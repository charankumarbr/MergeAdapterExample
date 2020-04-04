package `in`.charan.mergeadapter.model

/**
 * Created by charan.br on April 04, 2020
 */
data class Footer constructor(var isLoadingAllowed: Boolean){

    companion object {

        fun getFooterData() = Footer(true)
    }
}