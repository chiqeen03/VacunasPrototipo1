package com.example.mnlgu.vacunasprototipo1.vacunas

class PaisAdmin{

    val paises: ArrayList<Pais> = ArrayList()
    val africa: ArrayList<Pais> = ArrayList()
    val norteamerica: ArrayList<Pais> = ArrayList()
    val centroamerica: ArrayList<Pais> = ArrayList()
    val sudamerica: ArrayList<Pais> = ArrayList()
    val caribe: ArrayList<Pais> = ArrayList()
    val asia: ArrayList<Pais> = ArrayList()
    val medioOriente: ArrayList<Pais> = ArrayList()
    val europa: ArrayList<Pais> = ArrayList()
    val oceania: ArrayList<Pais> = ArrayList()

    val vacunaAdmin: VacunaAdmin = VacunaAdmin()

    init {

        fillAfrica()
        fillNorteamerica()
        fillCentroamerica()
        fillSudamerica()
        fillCaribe()
        fillAsia()
        fillMedioOriente()
        fillEuropa()
        fillOceania()

        fillPaises()
    }

    //FALTA
    fun fillAfrica(){

    }
    //LISTO
    fun fillNorteamerica(){
        //Canadá
        val canada = Pais("Canadá")
        canada.listaVacunas.addAll(vacunaAdmin.enCartilla)
        norteamerica.add(canada)

        //USA
        val usa = Pais("Estados Unidos")
        usa.listaVacunas.addAll(vacunaAdmin.enCartilla)
        norteamerica.add(usa)

        //Groenlandia
        val groenlandia = Pais("Groenlandia")
        groenlandia.listaVacunas.addAll(vacunaAdmin.enCartilla)
        norteamerica.add(groenlandia)
    }
    //LISTO
    fun fillCentroamerica(){
        //Belice
        val belice = Pais("Belice")
        belice.listaVacunas.addAll(vacunaAdmin.enCartilla)
        belice.listaVacunas.add(vacunaAdmin.hepatitisA)
        belice.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        centroamerica.add(belice)

        //Costa Rica
        val cr = Pais("Costa Rica")
        cr.listaVacunas.addAll(vacunaAdmin.enCartilla)
        cr.listaVacunas.add(vacunaAdmin.hepatitisA)
        cr.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        centroamerica.add(cr)

        //El Salvador
        val es = Pais("El Salvador")
        es.listaVacunas.addAll(vacunaAdmin.enCartilla)
        es.listaVacunas.add(vacunaAdmin.hepatitisA)
        es.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        centroamerica.add(es)

        //Guatemala
        val guate = Pais("Guatemala")
        guate.listaVacunas.addAll(vacunaAdmin.enCartilla)
        guate.listaVacunas.add(vacunaAdmin.hepatitisA)
        guate.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        centroamerica.add(guate)

        //Honduras
        val hon = Pais("Honduras")
        hon.listaVacunas.addAll(vacunaAdmin.enCartilla)
        hon.listaVacunas.add(vacunaAdmin.hepatitisA)
        hon.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        hon.listaVacunas.add(vacunaAdmin.dengue)
        centroamerica.add(hon)

        //Nicaragua
        val nic = Pais("Nicaragua")
        nic.listaVacunas.addAll(vacunaAdmin.enCartilla)
        nic.listaVacunas.add(vacunaAdmin.hepatitisA)
        nic.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        centroamerica.add(nic)

        //Panamá
        val pan = Pais("Panamá")
        pan.listaVacunas.addAll(vacunaAdmin.enCartilla)
        pan.listaVacunas.add(vacunaAdmin.hepatitisA)
        pan.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        centroamerica.add(pan)
    }
    //FALTA
    fun fillSudamerica(){

    }
    //FALTA
    fun fillCaribe(){

    }
    //FALTA
    fun fillAsia(){

    }
    //FALTA
    fun fillMedioOriente(){

    }
    //FALTA
    fun fillEuropa(){

    }
    //FALTA
    fun fillOceania(){

    }

    //LISTO
    fun fillPaises(){
        paises.addAll(africa)
        paises.addAll(norteamerica)
        paises.addAll(centroamerica)
        paises.addAll(sudamerica)
        paises.addAll(caribe)
        paises.addAll(asia)
        paises.addAll(medioOriente)
        paises.addAll(europa)
        paises.addAll(oceania)
    }
}