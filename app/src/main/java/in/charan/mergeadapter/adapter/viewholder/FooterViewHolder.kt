package `in`.charan.mergeadapter.adapter.viewholder

import `in`.charan.mergeadapter.R
import `in`.charan.mergeadapter.model.Footer
import `in`.charan.mergeadapter.util.gone
import `in`.charan.mergeadapter.util.visible
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by charan.br on April 04, 2020
 */
class FooterViewHolder (private val view: View): RecyclerView.ViewHolder(view) {

    private val pbLoading: ProgressBar = view.findViewById(R.id.llfPbLoading)
    private val tvLoadText: TextView = view.findViewById(R.id.llfTvLoadText)

    fun setData(footer: Footer) {
        with (footer) {
            if (isLoadingAllowed) {
                pbLoading.visible()
                tvLoadText.setText(R.string.loading_data)

            } else {
                pbLoading.gone()
                tvLoadText.setText(R.string.reached_end)
            }
        }
    }


}