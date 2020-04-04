package `in`.charan.mergeadapter.model

/**
 * Created by charan.br on April 04, 2020
 */
data class ListItem (val title: String, val info: String) {

    companion object {

        fun getListItemData(): ArrayList<ListItem> {
            val listItems = ArrayList<ListItem>()

            var listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is from the ItemsAdapter.")
            listItems.add(listItem)
            return listItems
        }

        fun getListItemNextPage(): ArrayList<ListItem> {
            val listItems = ArrayList<ListItem>()

            var listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)

            listItem = ListItem("Title #", "This is again from the ItemsAdapter.")
            listItems.add(listItem)
            return listItems
        }
    }
}