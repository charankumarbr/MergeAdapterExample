package `in`.charan.mergeadapter.adapter

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.adapter.viewholder.HeaderViewHolder
import `in`.charan.mergeadapter.model.Header
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by charan.br on April 04, 2020
 */
class HeaderAdapter constructor(private val header: Header): RecyclerView.Adapter<HeaderViewHolder>() {

    override fun getItemCount() = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeaderViewHolder(layoutInflater.inflate(R.layout.layout_list_header, parent, false))
    }

    override fun onBindViewHolder(headerViewHolder: HeaderViewHolder, position: Int) {
        headerViewHolder.setData(header)
    }

}