package `in`.charan.mergeadapter.adapter

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.adapter.viewholder.FooterViewHolder
import `in`.charan.mergeadapter.adapter.viewholder.HeaderViewHolder
import `in`.charan.mergeadapter.model.Footer
import `in`.charan.mergeadapter.ui.AdapterCommunicator
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by charan.br on April 04, 2020
 */
class FooterAdapter (private var footer: Footer,
                     private val adapterCommunicator: AdapterCommunicator):
    RecyclerView.Adapter<FooterViewHolder>() {

    override fun getItemCount() = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FooterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FooterViewHolder(layoutInflater.inflate(R.layout.layout_list_footer, parent, false))
    }

    override fun onBindViewHolder(footerViewHolder: FooterViewHolder, position: Int) {
        footerViewHolder.setData(footer)
        if (footer.isLoadingAllowed) {
            adapterCommunicator.loadNextPage()
        }
    }

    fun stopLoading() {
        footer.isLoadingAllowed = false
    }
}