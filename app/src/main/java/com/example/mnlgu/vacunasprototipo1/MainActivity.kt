package com.example.mnlgu.vacunasprototipo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.example.mnlgu.vacunasprototipo1.adapters.MainAdapter
import com.example.mnlgu.vacunasprototipo1.vacunas.Pais
import com.example.mnlgu.vacunasprototipo1.vacunas.PaisAdmin

class MainActivity : AppCompatActivity() {

    val paisesAdmin: PaisAdmin = PaisAdmin()
    lateinit var paises: List<Pais>
    lateinit var recyclerView: RecyclerView
    lateinit var searchText: EditText
    lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        paises = paisesAdmin.paises
        recyclerView = findViewById(R.id.recycleView)

        setRecyclerView(paises as ArrayList<Pais>)

        searchText = findViewById(R.id.searchText)
        searchText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                filter(p0.toString())
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

        })


    }

    private fun filter(text: String){
        var filteredList: ArrayList<Pais> = ArrayList()

        for(pais: Pais in paises) {
            if (pais.name.toLowerCase().contains(text.toLowerCase())){
                filteredList.add(pais)
            }
        }

        mainAdapter.filterList(filteredList)
    }

    private fun setRecyclerView(paises: ArrayList<Pais>) {
        mainAdapter = MainAdapter(this, paises)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mainAdapter
    }

}
