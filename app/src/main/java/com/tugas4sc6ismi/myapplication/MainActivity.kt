package com.tugas4sc6ismi.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter: AdapterLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = AdapterLayout(this, generateDataBuku())
        var listBuku: ArrayList<ItemLayout>
        listBuku = generateDataBuku()
        gv_Buku.adapter = adapter
        gv_Buku.setOnItemClickListener {_, _, i, _ ->
            if(i==0){
                val intent: Intent = Intent(applicationContext,
                    TableLayout::class.java)
                startActivity(intent);

            }
            else if(i==1)
            {
                val intent: Intent = Intent(applicationContext,
                    ListBuku2::class.java)
                startActivity(intent)

            }
            else if(i==2)
            {
                val intent: Intent = Intent(applicationContext,
                    LinearLayout::class.java)
                startActivity(intent)

            }else if(i==3)
            {
                val intent: Intent = Intent(applicationContext,
                    RelativeLayout2::class.java)
                startActivity(intent)

            }else if(i==4)
            {
                val intent: Intent = Intent(applicationContext,
                    FrameLayout::class.java)
                startActivity(intent)

            }else if(i==5)
            {
                val intent: Intent = Intent(applicationContext,
                    WebView::class.java)
                startActivity(intent)

            }
        }
    }
    private fun generateDataBuku(): ArrayList<ItemLayout> {
        var result = ArrayList<ItemLayout>()
        var buku: ItemLayout = ItemLayout()
        buku.judul = "Data Buku Tabel"
        buku.penulis = "TableLayout"
        buku.foto = R.drawable.table_layout
        buku.desc =
            "Pada aplikasi Android, TableLayout merupakan subclass dari ViewGroup yang \n" +
                    "digunakan untuk menampilkan turunan dari View berupa baris dan kolom.\n" +
                    "TableLayout mempisisikan turunannya dalam baris dan kolom dan tidak akan \n" +
                    "menampilkan border lines untuk baris, kolom maupun cells."
        result.add(buku)
        buku = ItemLayout()
        buku.judul = "Data Buku List View"
        buku.penulis = "ListView"
        buku.foto = R.drawable.list_view
        buku.desc = "ListView juga merupakan sebuah ViewGroup \n" +
                "dan digunakan untuk menampilkan sebuah daftar yang bisa di scroll dan terdiri dari baris\u0002baris item. Untuk mengisikan baris data kedalam daftar, kita menggunakan data adapter \n" +
                "yang menarik data dari sumber data seperti sebuah array atau database lalu \n" +
                "mengkonversinya kedalam sebuah result view untuk diletakkan kedalam daftar.\n" +
                "Di Android sendiri, Adapter akan berlaku sebagai sebuah perantara antara sumber data \n" +
                "view dari adapter seperti ListView dan GridView untuk memasukka data kedalam view \n" +
                "adapter"
        result.add(buku)
        buku = ItemLayout()
        buku.judul = "Data Buku Linear Layout"
        buku.penulis = "LinearLayout"
        buku.foto = R.drawable.linear_layout
        buku.desc = "Pada Aplikasi Android, LinearLayout adalah subclass dari ViewGroup yang \n" +
                "digunakan untuk memberikan semua instance turunan View satu persatu, baik dalam \n" +
                "bentuk Horizontal maupun Vertikal tergantung properti atribut android:orientation di file \n" +
                "layout XML.\n" +
                "Di LinearLayout, contoh/ instances dari turunan View diatur satu persatu, sehingga \n" +
                "untuk bentuk Horizontal akan memiliki satu baris dengan beberapa kolom, sebaliknya \n" +
                "bentuk Vertikal akan memiliki satu kolo, dengan beberapa baris."
        result.add(buku)
        buku = ItemLayout()
        buku.judul = "Data Buku Relative Layout"
        buku.penulis = "RelativeLayout"
        buku.foto = R.drawable.relative_layout
        buku.desc = "Layout berikutnya adalah RelativeLayout yang digunakan untuk menentukan posisi \n" +
                "setiap kontrol realtif satu sama lain, misalkan posisi kontrol A berada di sebelah kiri \n" +
                "kontrol B. Secara bawaan, turunan View diposisikan di bagian atas kiri dari layout.\n"
        result.add(buku)

        buku = ItemLayout()
        buku.judul = "Data Buku Frame Layout"
        buku.penulis = "FrameLayout"
        buku.foto = R.drawable.frame_layout
        buku.desc = "FrameLayout adalah sebuah subclass ViewGroup yang digunakan untuk \n" +
                "mengspesifikasikan posisi dari contoh View. Secara sederhana, FrameLayout berguna \n" +
                "untuk mengunci sebuah area layar agar tampil dalam satu item saja."
        result.add(buku)
        buku = ItemLayout()
        buku.judul = "Data Buku Web View"
        buku.penulis = "WebView"
        buku.foto = R.drawable.web_view
        buku.desc = "WebView, yakni sebuah extention dari View yang \n" +
                "digunakan untuk menampilkan halaman HTML static atau melakukan remote halaman \n" +
                "web dengan URL di aplikasi Android.\n" +
                "Secara umum, WebView di Android akan berlaku sebagai browser yang tertanam \n" +
                "untuk menampilkan halaman web di layout activity dan tidak memiliki fitur-fitur normal \n" +
                "yang ada pada sebuah browser seperti address bar, kontrol navigasi, dll.\n"
        result.add(buku)
        return result
    }
}