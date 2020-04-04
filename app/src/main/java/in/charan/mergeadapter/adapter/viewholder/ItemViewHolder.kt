package `in`.charan.mergeadapter.adapter.viewholder

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.model.ListItem
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by charan.br on April 04, 2020
 */
class ItemViewHolder (private val view: View): RecyclerView.ViewHolder(view) {

    private val tvTitle: TextView = view.findViewById(R.id.lliTvTitle)
    private val tvInfo: TextView = view.findViewById(R.id.lliTvInfo)

    fun setData(listItem: ListItem, position: Int) {
        with (listItem) {
            tvTitle.text = title + "$position"
            tvInfo.text = info
        }
    }
}