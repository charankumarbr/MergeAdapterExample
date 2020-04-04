package `in`.charan.mergeadapter.ui

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.adapter.FooterAdapter
import `in`.charan.mergeadapter.adapter.HeaderAdapter
import `in`.charan.mergeadapter.adapter.ItemsAdapter
import `in`.charan.mergeadapter.model.Footer
import `in`.charan.mergeadapter.model.Header
import `in`.charan.mergeadapter.model.ListItem
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.recyclerview.widget.MergeAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity(), AdapterCommunicator {

    private val loadDelay = 4000L

    private val emptyMessageId = 9013

    private lateinit var mergeAdapter: MergeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        val headerAdapter = HeaderAdapter(Header.getHeaderData())
        val itemsAdapter = ItemsAdapter(ListItem.getListItemData())
        val footerAdapter = FooterAdapter(Footer.getFooterData(), this)

        mergeAdapter = MergeAdapter(headerAdapter, itemsAdapter, footerAdapter)
        amRvItems.adapter = mergeAdapter
    }

    override fun loadNextPage() {
        thread(true,name="NextPageLoader", block = {
            Thread.sleep(loadDelay)
            handler.sendEmptyMessage(emptyMessageId)
        })
    }

    private val handler = Handler {
        if (it.what == emptyMessageId) {
            if (this::mergeAdapter.isInitialized) {
                mergeAdapter.adapters.forEach { adapter ->
                    if (adapter is ItemsAdapter) {
                        adapter.addData(ListItem.getListItemNextPage())
                        adapter.notifyDataSetChanged()

                    } else if (adapter is FooterAdapter) {
                        adapter.stopLoading()
                        adapter.notifyDataSetChanged()
                    }
                }
                //mergeAdapter.notifyDataSetChanged()
                true

            } else {
                false
            }

        } else {
            false
        }
    }
}
