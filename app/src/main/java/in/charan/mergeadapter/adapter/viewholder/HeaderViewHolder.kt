package `in`.charan.mergeadapter.adapter.viewholder

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.model.Header
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_list_header.view.*

/**
 * Created by charan.br on April 04, 2020
 */
class HeaderViewHolder (private val view: View): RecyclerView.ViewHolder(view) {

    private val tvTitle: TextView = view.findViewById(R.id.llhTvTitle)
    private val tvSubTitle: TextView = view.findViewById(R.id.llhTvSubTitle)

    fun setData(header: Header) {
        with (header) {
            tvTitle.text = title
            tvSubTitle.text = subTitle
        }
    }
}