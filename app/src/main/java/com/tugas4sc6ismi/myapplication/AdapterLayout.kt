package com.tugas4sc6ismi.myapplication

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AdapterLayout(
    private var activity: Activity, private var items:
    ArrayList<ItemLayout>
) : BaseAdapter() {
    var context: Context? = null

    private class ViewHolder(row: View?) {
        var lblJudul: TextView? = null
        var lblPenulis: TextView? = null
        var imgCover: ImageView? = null

        init {
            this.lblJudul = row?.findViewById<TextView>(R.id.lbl_Judul)
            this.lblPenulis = row?.findViewById<TextView>(R.id.lbl_Penulis)
            this.imgCover = row?.findViewById<ImageView>(R.id.img_Cover)
        }
    }

    override fun getView(
        position: Int, convertView: View?, parent:
        ViewGroup?
    ): View {
        val view: View
        this.context = context
        val image = this.items[position]
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater =
                activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.activity_listlayout, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var buku = items[position]
        viewHolder.lblJudul?.text = buku.judul
        viewHolder.lblPenulis?.text = buku.penulis
        viewHolder.imgCover?.setImageResource(buku.foto!!)
        return view as View
    }

    override fun getItem(i: Int): Any? {
        return items[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }
}