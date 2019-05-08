package com.example.mnlgu.vacunasprototipo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import com.example.mnlgu.vacunasprototipo1.adapters.SecondaryAdapter
import com.example.mnlgu.vacunasprototipo1.vacunas.Pais
import com.example.mnlgu.vacunasprototipo1.vacunas.Vacuna

class SecondaryActivity : AppCompatActivity() {

    lateinit var pais: Pais
    lateinit var recyclerView: RecyclerView
    lateinit var titulo: TextView
    lateinit var listaVacunas: List<Vacuna>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        supportActionBar?.hide()

        pais = intent.getSerializableExtra("Pais") as Pais
        listaVacunas = pais.listaVacunas

        titulo = findViewById(R.id.tituloPais)
        recyclerView = findViewById(R.id.recycleView2)

        titulo.text = pais.name

        setRecyclerView(listaVacunas as ArrayList<Vacuna>)

    }

    private fun setRecyclerView(listaVacunas: ArrayList<Vacuna>) {
        var secondaryAdapter = SecondaryAdapter(this, listaVacunas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = secondaryAdapter
    }
}
