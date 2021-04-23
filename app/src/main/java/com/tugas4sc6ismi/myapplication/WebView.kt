package com.tugas4sc6ismi.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_webview.*

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        wv_CCIT.settings.javaScriptEnabled = true
        wv_URLCCIT.loadUrl("https://ccit.eng.ui.ac.id/")
    }
}