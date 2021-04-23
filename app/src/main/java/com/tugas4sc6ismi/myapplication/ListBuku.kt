package com.tugas4sc6ismi.myapplication

class ListBuku {
    var judul: String = ""
    var penulis: String = ""
    var kategori: String = ""

    constructor(judul_buku: String, penulis_buku: String, kategori_buku: String){
        this.judul = judul_buku
        this.penulis = penulis_buku
        this.kategori = kategori_buku
    }
}