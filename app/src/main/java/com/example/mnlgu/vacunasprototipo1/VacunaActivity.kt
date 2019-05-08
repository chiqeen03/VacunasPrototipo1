package com.example.mnlgu.vacunasprototipo1

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatImageButton
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.mnlgu.vacunasprototipo1.vacunas.Vacuna
import kotlinx.android.synthetic.main.activity_vacuna.*

class VacunaActivity : AppCompatActivity() {

    lateinit var vacuna: Vacuna
    lateinit var tituloTextView: TextView
    lateinit var descripcionTextView: TextView
    lateinit var descripcionEnfermedadTextView: TextView
    lateinit var carritoButton: AppCompatImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacuna)

        supportActionBar?.hide()

        vacuna = intent.getSerializableExtra("Vacuna") as Vacuna
        tituloTextView = findViewById(R.id.tituloVacuna)
        descripcionTextView = findViewById(R.id.descripcionText)
        descripcionEnfermedadTextView = findViewById(R.id.descripcionEnfermedadText)
        carritoButton = findViewById(R.id.carritoButton)

        tituloTextView.text = vacuna.nombre
        descripcionTextView.text = vacuna.descripcion
        descripcionEnfermedadTextView.text = vacuna.descripcionEnfermedad

        carritoButton.setOnClickListener {
            agregarACarrito(vacuna.id.toString())
            Toast.makeText(applicationContext, "Agregado al carrito", Toast.LENGTH_SHORT).show()
        }

    }

    fun agregarACarrito(indice: String){
        val preferences: SharedPreferences = getSharedPreferences("indices", Context.MODE_PRIVATE)

        val editor: SharedPreferences.Editor = preferences.edit()
        editor.putBoolean(indice, true)

        editor.apply()
    }
}
