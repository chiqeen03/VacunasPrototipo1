package com.example.mnlgu.vacunasprototipo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.mnlgu.vacunasprototipo1.adapters.MainAdapter
import com.example.mnlgu.vacunasprototipo1.vacunas.Pais
import com.example.mnlgu.vacunasprototipo1.vacunas.PaisAdmin

class MainActivity : AppCompatActivity() {

    val paisesAdmin: PaisAdmin = PaisAdmin()
    lateinit var paises: List<Pais>
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        paises = paisesAdmin.paises
        recyclerView = findViewById(R.id.recycleView)

        setRecyclerView(paises as ArrayList<Pais>)
    }

    private fun setRecyclerView(paises: ArrayList<Pais>) {
        var mainAdapter = MainAdapter(this, paises)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mainAdapter
    }
}
