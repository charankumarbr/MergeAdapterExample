package `in`.charan.mergeadapter.model

/**
 * Created by charan.br on April 04, 2020
 */
data class Header (val title: String, val subTitle: String) {

    companion object {
        fun getHeaderData() =
            Header("Header",
                "This is inflated using an adapter for Header only.")
    }
}