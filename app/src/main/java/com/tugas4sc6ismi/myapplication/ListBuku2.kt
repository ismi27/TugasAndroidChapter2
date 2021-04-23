package com.tugas4sc6ismi.myapplication

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_listviewlayout.*

class ListBuku2 : AppCompatActivity() {
    var listView: ListView? = null
    var adapter: CustomAdapter? = null
    val judulbuku = arrayOf(
        "The Silent Patient", "Think and Grow Rich!",
        "English Grammar in Use"
    )
    var penulisbuku = arrayOf(
        "Alex Michaelides", "Napoleon Hill, Ross Cornwell",
        "Murphy, Raymond"
    )
    var kategori = arrayOf(
        "Novel", "Buku Referensi", "Kebahasaan"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listviewlayout)
        listView = findViewById<ListView>(R.id.lv_buku)
        adapter = CustomAdapter(this, getDataAnggota())
        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()
        lv_buku.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Judul Bukunya-" + (position + 1) + " " + judulbuku[position].toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun getDataAnggota(): ArrayList<ListBuku> {
        var hasil = ArrayList<ListBuku>()
        for (i in judulbuku.indices) {
            var bku: ListBuku = ListBuku(
                judulbuku[i].toString(), penulisbuku[i].toString(),
                kategori[i].toString()
            )
            hasil.add(bku)
        }
        return hasil
    }
}