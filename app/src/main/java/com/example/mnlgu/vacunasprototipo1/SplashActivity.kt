package com.example.mnlgu.vacunasprototipo1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000

    val runnable: Runnable = java.lang.Runnable {
        if(!isFinishing){
            val intent = Intent(applicationContext, LauncherActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        val delayHandler: Handler = Handler()

        delayHandler.postDelayed(runnable, SPLASH_DELAY)
    }
}
