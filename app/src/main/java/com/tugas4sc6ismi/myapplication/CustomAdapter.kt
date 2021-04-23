package com.tugas4sc6ismi.myapplication

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(
    private var activity: Activity,
    private var items: ArrayList<ListBuku>
) : BaseAdapter() {
    private class ViewHolder(row: View?) {
        var txtJudul: TextView? = null
        var txtPenulis: TextView? = null
        var txtKategori: TextView? = null
        init {
            this.txtJudul = row?.findViewById<TextView>(R.id.txt_Judul)
            this.txtPenulis = row?.findViewById<TextView>(R.id.txt_Penulis)
            this.txtKategori = row?.findViewById<TextView>(R.id.txt_Kategori)
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater =
                activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_row, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var book = items[position]
        viewHolder.txtJudul?.text = book.judul
        viewHolder.txtPenulis?.text = book.penulis
        viewHolder.txtKategori?.text = book.kategori
        return view as View
    }

    override fun getItem(i: Int): ListBuku {
        return items[i]
        TODO("Not yet implemented")
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        return items.size
        TODO("Not yet implemented")
    }

}