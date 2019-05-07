package com.example.mnlgu.vacunasprototipo1.adapters

import android.content.Context
import android.content.Intent
import android.icu.text.AlphabeticIndex
import com.example.mnlgu.vacunasprototipo1.vacunas.Pais
import com.example.mnlgu.vacunasprototipo1.vacunas.Vacuna
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mnlgu.vacunasprototipo1.R
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.mnlgu.vacunasprototipo1.SecondaryActivity

class MainAdapter (context: Context, paises: List<Pais>): RecyclerView.Adapter<RecordHolder>(){
    var context = context
    var paises = paises

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecordHolder {
        var view: View
        var inflater: LayoutInflater = LayoutInflater.from(context)
        view = inflater.inflate(R.layout.card_item, viewGroup, false)

        val recordHolder = RecordHolder(view)
        recordHolder.itemView.setOnClickListener {
            var pais: Pais = paises.get(recordHolder.adapterPosition)
            Toast.makeText(context, pais.name, Toast.LENGTH_SHORT).show()
            var it: Intent = Intent(context, SecondaryActivity::class.java)
            it.putExtra("Pais", pais)
            context.startActivity(it)
        }

        return recordHolder
    }

    override fun getItemCount(): Int {
        return paises.count()
    }

    override fun onBindViewHolder(recordHolder: RecordHolder, i: Int) {
        recordHolder.name.text = paises.get(i).name
    }

    fun filterList(filteredList: ArrayList<Pais>){
        paises = filteredList
        notifyDataSetChanged()
    }
}

class RecordHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var name: TextView

    init {
        name = itemView.findViewById(R.id.card_name)
    }
}