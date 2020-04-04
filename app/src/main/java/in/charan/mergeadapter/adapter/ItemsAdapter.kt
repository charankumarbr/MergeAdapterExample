package `in`.charan.mergeadapter.adapter

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.adapter.viewholder.ItemViewHolder
import `in`.charan.mergeadapter.model.ListItem
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

/**
 * Created by charan.br on April 04, 2020
 */
class ItemsAdapter (private val items: MutableList<ListItem>): RecyclerView.Adapter<ItemViewHolder>() {

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(layoutInflater.inflate(R.layout.layout_list_item, parent, false))
    }

    override fun onBindViewHolder(itemViewHolder: ItemViewHolder, position: Int) {
        itemViewHolder.setData(items[position], position)
    }

    fun addData(listItemNextPage: ArrayList<ListItem>) {
        items.addAll(listItemNextPage)
    }
}