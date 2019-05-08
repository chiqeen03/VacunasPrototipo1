package com.example.mnlgu.vacunasprototipo1

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class LauncherActivity : AppCompatActivity() {

    lateinit var enfermedadesButton: Button
    lateinit var verCarritoButton: Button
    lateinit var tablaButton: ImageButton

    lateinit var myDialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        //guardarPreferencias()

        supportActionBar?.hide()

        myDialog = Dialog(this)

        enfermedadesButton = findViewById(R.id.siguienteButton)
        verCarritoButton = findViewById(R.id.verCarritoButton)
        tablaButton = findViewById(R.id.showTabla)


        enfermedadesButton.setOnClickListener {
            val it = Intent(applicationContext, MainActivity::class.java)
            startActivity(it)
        }

        verCarritoButton.setOnClickListener {
            val it = Intent(applicationContext, CarritoActivity::class.java)
            startActivity(it)
        }

        tablaButton.setOnClickListener {
            showInfo()
        }
    }

    private fun showInfo(){
        myDialog.setContentView(R.layout.popup_cartilla)

        val closeButton: Button = myDialog.findViewById(R.id.cerrarPopUp)
        closeButton.setOnClickListener {
            myDialog.dismiss()
        }

        myDialog.show()
    }

    fun guardarPreferencias(){
        val preferences: SharedPreferences = getSharedPreferences("indices", Context.MODE_PRIVATE)

        val editor: SharedPreferences.Editor = preferences.edit()
        editor.putBoolean("0", false)
        editor.putBoolean("1", false)
        editor.putBoolean("2", false)
        editor.putBoolean("3", false)
        editor.putBoolean("4", false)
        editor.putBoolean("5", false)
        editor.putBoolean("6", false)
        editor.putBoolean("7", false)
        editor.putBoolean("8", false)
        editor.putBoolean("9", false)
        editor.putBoolean("10", false)
        editor.putBoolean("11", false)
        editor.putBoolean("12", false)
        editor.putBoolean("13", false)
        editor.putBoolean("14", false)
        editor.putBoolean("15", false)
        editor.putBoolean("16", false)

        editor.apply()
    }
}
