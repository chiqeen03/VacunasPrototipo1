package com.example.mnlgu.vacunasprototipo1

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.mnlgu.vacunasprototipo1.adapters.CarritoAdapter
import com.example.mnlgu.vacunasprototipo1.vacunas.Vacuna
import com.example.mnlgu.vacunasprototipo1.vacunas.VacunaAdmin

class CarritoActivity : AppCompatActivity() {

    lateinit var booleanos: ArrayList<Boolean>

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        supportActionBar?.hide()

        var adminVacunas = VacunaAdmin()
        var listaVacunas = ArrayList<Vacuna>()

        listaVacunas.addAll(adminVacunas.enCartilla)
        listaVacunas.addAll(adminVacunas.noEnCartilla)

        var auxList: ArrayList<Vacuna> = ArrayList()

        booleanos = ArrayList()

        for (i in 0..16){
            cargarVacunas(i.toString())
        }

        fillAux(auxList, listaVacunas)

        recyclerView = findViewById(R.id.recycleView3)

        var listaVacia: ArrayList<Vacuna> = ArrayList()
        var vacunaVacia = Vacuna("", "", "", false)
        vacunaVacia.id = -10
        listaVacia.add(vacunaVacia)

        if(auxList.isEmpty()){
            setRecyclerView(listaVacia)
        }
        else{
            setRecyclerView(auxList)
        }
    }

    private fun setRecyclerView(listaVacunas: ArrayList<Vacuna>) {
        var carritoAdapter = CarritoAdapter(this, listaVacunas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = carritoAdapter
    }

    private fun cargarVacunas(indice: String) {
        val preferences: SharedPreferences = getSharedPreferences("indices", Context.MODE_PRIVATE)
        var aux = preferences.getBoolean(indice, false)
        booleanos.add(aux)
    }

    fun fillAux(aux: ArrayList<Vacuna>, from: ArrayList<Vacuna>){
        for(i in 0..16){
            if(booleanos.get(i)){
                aux.add(from.get(i))
            }
        }
    }
}
