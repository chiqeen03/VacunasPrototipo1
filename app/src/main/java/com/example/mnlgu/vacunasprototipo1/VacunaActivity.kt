package com.example.mnlgu.vacunasprototipo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mnlgu.vacunasprototipo1.vacunas.Vacuna
import kotlinx.android.synthetic.main.activity_vacuna.*

class VacunaActivity : AppCompatActivity() {

    lateinit var vacuna: Vacuna
    lateinit var tituloTextView: TextView
    lateinit var descripcionTextView: TextView
    lateinit var descripcionEnfermedadTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacuna)

        supportActionBar?.hide()

        vacuna = intent.getSerializableExtra("Vacuna") as Vacuna
        tituloTextView = findViewById(R.id.tituloVacuna)
        descripcionTextView = findViewById(R.id.descripcionText)
        descripcionEnfermedadTextView = findViewById(R.id.descripcionEnfermedadText)

        tituloTextView.text = vacuna.nombre
        descripcionTextView.text = vacuna.descripcion
        descripcionEnfermedadTextView.text = vacuna.descripcionEnfermedad

    }
}
