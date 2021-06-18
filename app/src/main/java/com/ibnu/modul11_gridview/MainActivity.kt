package com.ibnu.modul11_gridview

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.ibnu.modul11_gridview.adapters.LanguageAdapters
import com.ibnu.modul11_gridview.model.LanguageItems

class MainActivity : AppCompatActivity() , AdapterView.OnItemClickListener{

    private var arrayList:ArrayList<LanguageItems> ? null
    private var gridView:GridView ? = null
    private var languageAdapters: LanguageAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.my_grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataList()
        languageAdapters = LanguageAdapters (applicationContext, arrayList!!)
        gridView?.adapter = LanguageAdapters
        gridView?.onItemClickListener = this

    }

    private fun setDataList() : ArrayList<LanguageItems> {

        var arrayList:ArrayList<LanguageItems> = ArrayList()

        arrayList.add(LanguageItems(R.drawable.icon1, name = "mess1"))
        arrayList.add(LanguageItems(R.drawable.icon2, name = "mess2"))
        arrayList.add(LanguageItems(R.drawable.icon3, name = "mess3"))
        arrayList.add(LanguageItems(R.drawable.icon4, name = "mess4"))
        arrayList.add(LanguageItems(R.drawable.icon5, name = "mess5"))
        arrayList.add(LanguageItems(R.drawable.icon6, name = "mess6"))
        arrayList.add(LanguageItems(R.drawable.icon7, name = "mess7"))
        arrayList.add(LanguageItems(R.drawable.icon8, name = "mess8"))
        arrayList.add(LanguageItems(R.drawable.icon9, name = "mess9"))


        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:LanguageItems = arrayList!!.get(position)
        Toast.makeText(applicationContext ,items.name, Toast.LENGTH_LONG).show()
    }
}