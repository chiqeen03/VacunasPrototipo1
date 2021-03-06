package com.example.mnlgu.vacunasprototipo1.adapters

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.mnlgu.vacunasprototipo1.R
import com.example.mnlgu.vacunasprototipo1.SecondaryActivity
import com.example.mnlgu.vacunasprototipo1.VacunaActivity
import com.example.mnlgu.vacunasprototipo1.vacunas.Pais
import com.example.mnlgu.vacunasprototipo1.vacunas.Vacuna

class SecondaryAdapter (context: Context, vacunas: List<Vacuna>): RecyclerView.Adapter<RecordHolder2>(){
    var context = context
    var vacunas = vacunas

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecordHolder2 {
        var view: View
        var inflater: LayoutInflater = LayoutInflater.from(context)
        view = inflater.inflate(R.layout.vaccine_item, viewGroup, false)

        val recordHolder = RecordHolder2(view)

        recordHolder.itemView.setOnClickListener {
            var vacuna: Vacuna = vacunas.get(recordHolder.adapterPosition)
            Toast.makeText(context, vacuna.nombre, Toast.LENGTH_SHORT).show()
            var it: Intent = Intent(context, VacunaActivity::class.java)
            it.putExtra("Vacuna", vacuna)
            context.startActivity(it)
        }

        return recordHolder
    }

    override fun getItemCount(): Int {
        return vacunas.size
    }

    override fun onBindViewHolder(recordHolder: RecordHolder2, i: Int) {
        recordHolder.name.text = vacunas.get(i).nombre
        recordHolder.enCartillaAux = vacunas.get(i).enCartilla

        if(recordHolder.enCartillaAux) {
            recordHolder.enCartilla.text = "En Cartilla"
            recordHolder.enCartilla.setBackgroundColor(Color.parseColor("#e4fadb"))
        }
        else {
            recordHolder.enCartilla.text = "No en Cartilla"
            recordHolder.enCartilla.setBackgroundColor(Color.parseColor("#fae6db"))
        }
    }
}

class RecordHolder2(itemView: View): RecyclerView.ViewHolder(itemView) {
    var name: TextView
    var enCartilla: TextView
    var enCartillaAux: Boolean = true


    init {
        name = itemView.findViewById(R.id.vaccine_name)
        enCartilla = itemView.findViewById(R.id.enCartilla)
    }
}