package com.example.mnlgu.vacunasprototipo1.vacunas

import java.io.Serializable

class Pais (name: String): Serializable{

    var name = name
    val listaVacunas: ArrayList<Vacuna> = ArrayList()

}