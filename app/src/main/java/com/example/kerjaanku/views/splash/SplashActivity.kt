package com.example.kerjaanku.views.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kerjaanku.R
import com.example.kerjaanku.views.main.MainActivity
import java.util.logging.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
//buat handler agar tampilan berpindah ke main activity setelah beberapa detik
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity<MainActivity>()
        }, 1200)
    }
}