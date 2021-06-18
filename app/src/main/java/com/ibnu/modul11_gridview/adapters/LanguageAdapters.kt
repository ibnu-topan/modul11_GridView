package com.ibnu.modul11_gridview.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.ibnu.modul11_gridview.R
import com.ibnu.modul11_gridview.model.LanguageItems

class LanguageAdapters (var context: Context , var arrayList : ArrayList<LanguageItems>): BaseAdapter() {


    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context , R.layout.card_view_item_grid, null)
        var icon:ImageView = view.findViewById(R.id.icon)
        var names:TextView = view.findViewById(R.id.name_text_view)

        var ListItems:LanguageItems = arrayList.get(position)

        icon.setImageResource(ListItems.icons!!)
        names.text = ListItems.name


        return view
    }

}