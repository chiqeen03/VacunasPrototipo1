package com.example.mnlgu.vacunasprototipo1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LauncherActivity : AppCompatActivity() {

    lateinit var enfermedadesButton: Button
    lateinit var verCarritoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        supportActionBar?.hide()

        enfermedadesButton = findViewById(R.id.siguienteButton)
        verCarritoButton = findViewById(R.id.verCarritoButton)

        enfermedadesButton.setOnClickListener {
            val it = Intent(applicationContext, MainActivity::class.java)
            startActivity(it)
        }

        verCarritoButton.setOnClickListener {
            val it = Intent(applicationContext, CarritoActivity::class.java)
            startActivity(it)
        }
    }
}
