package com.example.mnlgu.vacunasprototipo1.vacunas

import java.io.Serializable

class Vacuna (nombre: String, descripcion: String, descripcionEnfermedad: String, enCartilla: Boolean): Serializable{
    var nombre = nombre
    var descripcion = descripcion
    var descripcionEnfermedad = descripcionEnfermedad
    var enCartilla = enCartilla
}