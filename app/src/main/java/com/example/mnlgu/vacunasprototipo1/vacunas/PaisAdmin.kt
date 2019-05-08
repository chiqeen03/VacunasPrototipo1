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
    //LISTO
    fun fillSudamerica(){

        //Argentina
        val argentina = Pais("Argentina")
        argentina.listaVacunas.addAll(vacunaAdmin.enCartilla)
        argentina.listaVacunas.add(vacunaAdmin.hepatitisA)
        argentina.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(argentina)

        //Bolivia
        val bol = Pais("Bolivia")
        bol.listaVacunas.addAll(vacunaAdmin.enCartilla)
        bol.listaVacunas.add(vacunaAdmin.hepatitisA)
        bol.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(bol)

        //Brasil
        val bra = Pais("Brasil")
        bra.listaVacunas.addAll(vacunaAdmin.enCartilla)
        bra.listaVacunas.add(vacunaAdmin.hepatitisA)
        bra.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(bra)

        //Chile
        val chile = Pais("Chile")
        chile.listaVacunas.addAll(vacunaAdmin.enCartilla)
        chile.listaVacunas.add(vacunaAdmin.hepatitisA)
        chile.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(chile)

        //Colombia
        val col = Pais("Colombia")
        col.listaVacunas.addAll(vacunaAdmin.enCartilla)
        col.listaVacunas.add(vacunaAdmin.hepatitisA)
        col.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(col)

        //Ecuador
        val ecu = Pais("Ecuador")
        ecu.listaVacunas.addAll(vacunaAdmin.enCartilla)
        ecu.listaVacunas.add(vacunaAdmin.hepatitisA)
        ecu.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(ecu)

        //GuyanaFrancesa
        val guyana = Pais("Guyana Francesa")
        guyana.listaVacunas.addAll(vacunaAdmin.enCartilla)
        guyana.listaVacunas.add(vacunaAdmin.hepatitisA)
        guyana.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        guyana.listaVacunas.add(vacunaAdmin.fiebreAmarilla)
        sudamerica.add(guyana)

        //Paraguay
        val paraguay = Pais("Paraguay")
        paraguay.listaVacunas.addAll(vacunaAdmin.enCartilla)
        paraguay.listaVacunas.add(vacunaAdmin.hepatitisA)
        paraguay.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(paraguay)

        //Peru
        val peru = Pais("Perú")
        peru.listaVacunas.addAll(vacunaAdmin.enCartilla)
        peru.listaVacunas.add(vacunaAdmin.hepatitisA)
        peru.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(peru)

        //Surinam
        val sur = Pais("Surinam")
        sur.listaVacunas.addAll(vacunaAdmin.enCartilla)
        sur.listaVacunas.add(vacunaAdmin.hepatitisA)
        sur.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sur.listaVacunas.add(vacunaAdmin.fiebreAmarilla)
        sudamerica.add(sur)

        //Uruguay
        val uru = Pais("Uruguay")
        uru.listaVacunas.addAll(vacunaAdmin.enCartilla)
        uru.listaVacunas.add(vacunaAdmin.hepatitisA)
        uru.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(uru)

        //Veneuela
        val vene = Pais("Venezuela")
        vene.listaVacunas.addAll(vacunaAdmin.enCartilla)
        vene.listaVacunas.add(vacunaAdmin.hepatitisA)
        vene.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        sudamerica.add(vene)
    }
    //LISTO
    fun fillCaribe(){
        //Argentina
        val ayb = Pais("Antigua y Barbuda")
        ayb.listaVacunas.addAll(vacunaAdmin.enCartilla)
        ayb.listaVacunas.add(vacunaAdmin.hepatitisA)
        ayb.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(ayb)

        //Argentina
        val bahamas = Pais("Bahamas")
        bahamas.listaVacunas.addAll(vacunaAdmin.enCartilla)
        bahamas.listaVacunas.add(vacunaAdmin.hepatitisA)
        bahamas.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(bahamas)

        //Barbados
        val barb = Pais("Barbados")
        barb.listaVacunas.addAll(vacunaAdmin.enCartilla)
        barb.listaVacunas.add(vacunaAdmin.hepatitisA)
        barb.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(barb)

        //Cuba
        val cuba = Pais("Cuba")
        cuba.listaVacunas.addAll(vacunaAdmin.enCartilla)
        cuba.listaVacunas.add(vacunaAdmin.hepatitisA)
        cuba.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(cuba)

        //Dominicana
        val dom = Pais("Dominicana")
        dom.listaVacunas.addAll(vacunaAdmin.enCartilla)
        dom.listaVacunas.add(vacunaAdmin.hepatitisA)
        dom.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(dom)

        //haiti
        val haiti = Pais("Haití")
        haiti.listaVacunas.addAll(vacunaAdmin.enCartilla)
        haiti.listaVacunas.add(vacunaAdmin.hepatitisA)
        haiti.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        haiti.listaVacunas.add(vacunaAdmin.malaria)
        caribe.add(haiti)

        //Islas Turcas y Caicos
        val itc = Pais("Islas Turcas y Caicos")
        itc.listaVacunas.addAll(vacunaAdmin.enCartilla)
        itc.listaVacunas.add(vacunaAdmin.hepatitisA)
        itc.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(itc)

        val jamaica = Pais("Haití")
        jamaica.listaVacunas.addAll(vacunaAdmin.enCartilla)
        jamaica.listaVacunas.add(vacunaAdmin.hepatitisA)
        jamaica.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        jamaica.listaVacunas.add(vacunaAdmin.malaria)
        caribe.add(jamaica)

        //puerto rico
        val pr = Pais("Puerto Rico")
        pr.listaVacunas.addAll(vacunaAdmin.enCartilla)
        pr.listaVacunas.add(vacunaAdmin.hepatitisA)
        pr.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(pr)

        //Republica Dominicana
        val rd = Pais("Republica Dominicana")
        rd.listaVacunas.addAll(vacunaAdmin.enCartilla)
        rd.listaVacunas.add(vacunaAdmin.hepatitisA)
        rd.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        caribe.add(rd)
    }
    //LISTO
    fun fillAsia(){
        val bang = Pais("Bangladesh")
        bang.listaVacunas.addAll(vacunaAdmin.enCartilla)
        bang.listaVacunas.add(vacunaAdmin.hepatitisA)
        bang.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        bang.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(bang)

        val butan = Pais("Bután")
        butan.listaVacunas.addAll(vacunaAdmin.enCartilla)
        butan.listaVacunas.add(vacunaAdmin.hepatitisA)
        butan.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        butan.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(butan)

        val camb = Pais("Cambodia")
        camb.listaVacunas.addAll(vacunaAdmin.enCartilla)
        camb.listaVacunas.add(vacunaAdmin.hepatitisA)
        camb.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        camb.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(camb)

        val china = Pais("China")
        china.listaVacunas.addAll(vacunaAdmin.enCartilla)
        china.listaVacunas.add(vacunaAdmin.hepatitisA)
        china.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        china.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(china)

        val nork = Pais("Corea del Norte")
        nork.listaVacunas.addAll(vacunaAdmin.enCartilla)
        nork.listaVacunas.add(vacunaAdmin.hepatitisA)
        nork.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        nork.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(nork)

        val south = Pais("Corea del Sur")
        south.listaVacunas.addAll(vacunaAdmin.enCartilla)
        south.listaVacunas.add(vacunaAdmin.hepatitisA)
        south.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        south.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(south)

        val hk = Pais("Hong Kong")
        hk.listaVacunas.addAll(vacunaAdmin.enCartilla)
        hk.listaVacunas.add(vacunaAdmin.hepatitisA)
        hk.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        hk.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(hk)

        val indo = Pais("Indonesia")
        indo.listaVacunas.addAll(vacunaAdmin.enCartilla)
        indo.listaVacunas.add(vacunaAdmin.hepatitisA)
        indo.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        indo.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(indo)

        val jap = Pais("Japon")
        jap.listaVacunas.addAll(vacunaAdmin.enCartilla)
        asia.add(jap)

        val kaz = Pais("Kazahistán")
        kaz.listaVacunas.addAll(vacunaAdmin.enCartilla)
        kaz.listaVacunas.add(vacunaAdmin.hepatitisA)
        kaz.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        asia.add(kaz)

        val laos = Pais("Laos")
        laos.listaVacunas.addAll(vacunaAdmin.enCartilla)
        laos.listaVacunas.add(vacunaAdmin.hepatitisA)
        laos.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        laos.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(laos)

        val malas = Pais("Malasia")
        malas.listaVacunas.addAll(vacunaAdmin.enCartilla)
        malas.listaVacunas.add(vacunaAdmin.hepatitisA)
        malas.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        malas.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(malas)

        val mald = Pais("Maldivas")
        mald.listaVacunas.addAll(vacunaAdmin.enCartilla)
        mald.listaVacunas.add(vacunaAdmin.hepatitisA)
        mald.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        asia.add(mald)

        val mong = Pais("Mongolia")
        mong.listaVacunas.addAll(vacunaAdmin.enCartilla)
        mong.listaVacunas.add(vacunaAdmin.hepatitisA)
        mong.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        asia.add(mong)

        val nep = Pais("Nepal")
        nep.listaVacunas.addAll(vacunaAdmin.enCartilla)
        nep.listaVacunas.add(vacunaAdmin.hepatitisA)
        nep.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        nep.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(nep)

        val paki = Pais("Pakistan")
        paki.listaVacunas.addAll(vacunaAdmin.enCartilla)
        paki.listaVacunas.add(vacunaAdmin.hepatitisA)
        paki.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        paki.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(paki)

        val sing = Pais("Singapur")
        sing.listaVacunas.addAll(vacunaAdmin.enCartilla)
        sing.listaVacunas.add(vacunaAdmin.hepatitisA)
        sing.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        asia.add(sing)

        val sri = Pais("Sri Lanka")
        sri.listaVacunas.addAll(vacunaAdmin.enCartilla)
        sri.listaVacunas.add(vacunaAdmin.hepatitisA)
        sri.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        asia.add(sri)

        val tai = Pais("Tailandia")
        tai.listaVacunas.addAll(vacunaAdmin.enCartilla)
        tai.listaVacunas.add(vacunaAdmin.hepatitisA)
        tai.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        tai.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(tai)

        val taiw = Pais("Taiwan")
        taiw.listaVacunas.addAll(vacunaAdmin.enCartilla)
        taiw.listaVacunas.add(vacunaAdmin.hepatitisA)
        asia.add(taiw)

        val tayi = Pais("Tayikistán")
        tayi.listaVacunas.addAll(vacunaAdmin.enCartilla)
        tayi.listaVacunas.add(vacunaAdmin.hepatitisA)
        tayi.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        tayi.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(tayi)

        val uzbe = Pais("Uzbekistán")
        uzbe.listaVacunas.addAll(vacunaAdmin.enCartilla)
        uzbe.listaVacunas.add(vacunaAdmin.hepatitisA)
        uzbe.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        asia.add(uzbe)

        val viet = Pais("Vietnam")
        viet.listaVacunas.addAll(vacunaAdmin.enCartilla)
        viet.listaVacunas.add(vacunaAdmin.hepatitisA)
        viet.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        viet.listaVacunas.add(vacunaAdmin.malaria)
        asia.add(viet)


    }
    //LISTO
    fun fillMedioOriente(){

        //Jordania
        val jor = Pais("Jordania")
        jor.listaVacunas.addAll(vacunaAdmin.enCartilla)
        jor.listaVacunas.add(vacunaAdmin.hepatitisA)
        jor.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(jor)

        //Arabia Saudita
        val arsau = Pais("Arabia Saudita")
        arsau.listaVacunas.addAll(vacunaAdmin.enCartilla)
        arsau.listaVacunas.add(vacunaAdmin.hepatitisA)
        arsau.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        arsau.listaVacunas.add(vacunaAdmin.malaria)
        medioOriente.add(arsau)

        //Emiratos Arabes Unidos
        val amir = Pais("Emiratos Arabes Unidos")
        amir.listaVacunas.addAll(vacunaAdmin.enCartilla)
        amir.listaVacunas.add(vacunaAdmin.hepatitisA)
        amir.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(amir)

        //Iran
        val iran = Pais("Irán")
        iran.listaVacunas.addAll(vacunaAdmin.enCartilla)
        iran.listaVacunas.add(vacunaAdmin.hepatitisA)
        iran.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        iran.listaVacunas.add(vacunaAdmin.malaria)
        medioOriente.add(iran)

        //Iraq
        val iraq = Pais("Iraq")
        iraq.listaVacunas.addAll(vacunaAdmin.enCartilla)
        iraq.listaVacunas.add(vacunaAdmin.hepatitisA)
        iraq.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(iraq)

        //Jordania
        val isra = Pais("Israel")
        isra.listaVacunas.addAll(vacunaAdmin.enCartilla)
        isra.listaVacunas.add(vacunaAdmin.hepatitisA)
        isra.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(isra)

        //Kuwait
        val kuw = Pais("Kuwait")
        kuw.listaVacunas.addAll(vacunaAdmin.enCartilla)
        kuw.listaVacunas.add(vacunaAdmin.hepatitisA)
        kuw.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(kuw)

        val lib = Pais("Líbano")
        lib.listaVacunas.addAll(vacunaAdmin.enCartilla)
        lib.listaVacunas.add(vacunaAdmin.hepatitisA)
        lib.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(lib)

        val oman = Pais("Oman")
        oman.listaVacunas.addAll(vacunaAdmin.enCartilla)
        oman.listaVacunas.add(vacunaAdmin.hepatitisA)
        oman.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oman.listaVacunas.add(vacunaAdmin.malaria)
        medioOriente.add(oman)

        val qat = Pais("Qatar")
        qat.listaVacunas.addAll(vacunaAdmin.enCartilla)
        qat.listaVacunas.add(vacunaAdmin.hepatitisA)
        qat.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(qat)

        val siria = Pais("Siria")
        siria.listaVacunas.addAll(vacunaAdmin.enCartilla)
        siria.listaVacunas.add(vacunaAdmin.hepatitisA)
        siria.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(siria)

        val tur = Pais("Turquía")
        tur.listaVacunas.addAll(vacunaAdmin.enCartilla)
        tur.listaVacunas.add(vacunaAdmin.hepatitisA)
        tur.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        medioOriente.add(tur)

        val yem = Pais("Yemen")
        yem.listaVacunas.addAll(vacunaAdmin.enCartilla)
        yem.listaVacunas.add(vacunaAdmin.hepatitisA)
        yem.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        yem.listaVacunas.add(vacunaAdmin.malaria)
        medioOriente.add(yem)
    }
    //LISTO
    fun fillEuropa(){
        val aus = Pais("Austria")
        aus.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(aus)

        val ale = Pais("Alemania")
        ale.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(ale)

        val bel = Pais("Bélgica")
        bel.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(bel)

        val biel = Pais("Bielorrusia")
        biel.listaVacunas.addAll(vacunaAdmin.enCartilla)
        biel.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(bel)

        val bos = Pais("Bosnia y Herzegovina")
        bos.listaVacunas.addAll(vacunaAdmin.enCartilla)
        bos.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(bos)

        val bul = Pais("Bulgaria")
        bul.listaVacunas.addAll(vacunaAdmin.enCartilla)
        bul.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(bul)

        val croa = Pais("Croacia")
        croa.listaVacunas.addAll(vacunaAdmin.enCartilla)
        croa.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(croa)

        val din = Pais("Dinamarca")
        din.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(din)

        val vat = Pais("El Vaticano")
        vat.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(vat)

        val eslo = Pais("Eslovakia")
        eslo.listaVacunas.addAll(vacunaAdmin.enCartilla)
        eslo.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(eslo)

        val eslov = Pais("Eslovenia")
        eslov.listaVacunas.addAll(vacunaAdmin.enCartilla)
        eslov.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(eslov)

        val esp = Pais("España")
        esp.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(esp)

        val esto = Pais("Estonia")
        esto.listaVacunas.addAll(vacunaAdmin.enCartilla)
        esto.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(esto)

        val fin = Pais("Finlandia")
        fin.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(fin)

        val gre = Pais("Grecia")
        gre.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(gre)

        val hol = Pais("Holanda")
        hol.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(hol)

        val hun = Pais("Hungría")
        hun.listaVacunas.addAll(vacunaAdmin.enCartilla)
        esto.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(hun)

        val irl = Pais("Irlanda")
        irl.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(irl)

        val isl = Pais("Islandia")
        isl.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(isl)

        val ita = Pais("Italia")
        ita.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(ita)

        val liech = Pais("Liechtestein")
        liech.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(liech)

        val lit = Pais("Lituania")
        lit.listaVacunas.addAll(vacunaAdmin.enCartilla)
        lit.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(lit)

        val lux = Pais("Luxemburgo")
        lux.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(lux)

        val mol = Pais("Moldavia")
        mol.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(mol)

        val mon = Pais("Monaco")
        mon.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(mon)

        val nor = Pais("Noruega")
        nor.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(nor)

        val pol = Pais("Polonia")
        pol.listaVacunas.addAll(vacunaAdmin.enCartilla)
        pol.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(pol)

        val uk = Pais("Reino Unido")
        uk.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(uk)

        val chec = Pais("Republica Checa")
        chec.listaVacunas.addAll(vacunaAdmin.enCartilla)
        chec.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(chec)

        val rum = Pais("Rumania")
        rum.listaVacunas.addAll(vacunaAdmin.enCartilla)
        rum.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(rum)

        val rus = Pais("Rusia")
        rus.listaVacunas.addAll(vacunaAdmin.enCartilla)
        rus.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(rus)

        val sm = Pais("San Marino")
        sm.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(sm)

        val ser = Pais("Serbia")
        ser.listaVacunas.addAll(vacunaAdmin.enCartilla)
        ser.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(ser)

        val sue = Pais("Suecia")
        sue.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(sue)

        val suiz = Pais("Suiza")
        suiz.listaVacunas.addAll(vacunaAdmin.enCartilla)
        europa.add(suiz)

        val ucr = Pais("Ucrania")
        ucr.listaVacunas.addAll(vacunaAdmin.enCartilla)
        ucr.listaVacunas.add(vacunaAdmin.hepatitisA)
        europa.add(ucr)
    }
    //LISTO
    fun fillOceania(){
        //Australia
        val aus = Pais("Australia")
        aus.listaVacunas.addAll(vacunaAdmin.enCartilla)
        oceania.add(aus)

        //Fiji
        val fiji = Pais("Fiji")
        fiji.listaVacunas.addAll(vacunaAdmin.enCartilla)
        fiji.listaVacunas.add(vacunaAdmin.hepatitisA)
        fiji.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oceania.add(fiji)

        //Filipinas
        val fili = Pais("Filipinas")
        fili.listaVacunas.addAll(vacunaAdmin.enCartilla)
        fili.listaVacunas.add(vacunaAdmin.hepatitisA)
        fili.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oceania.add(fili)

        //Islas Salomon
        val salo = Pais("Islas Salomón")
        salo.listaVacunas.addAll(vacunaAdmin.enCartilla)
        salo.listaVacunas.add(vacunaAdmin.hepatitisA)
        salo.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        salo.listaVacunas.add(vacunaAdmin.malaria)
        oceania.add(salo)

        //New Caledonia
        val cale = Pais("New Caledonia")
        cale.listaVacunas.addAll(vacunaAdmin.enCartilla)
        cale.listaVacunas.add(vacunaAdmin.hepatitisA)
        cale.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oceania.add(cale)

        //Nueva Zelanda
        val zel = Pais("Nueva Zelanda")
        zel.listaVacunas.addAll(vacunaAdmin.enCartilla)
        oceania.add(zel)

        //Palau
        val palau = Pais("Palau")
        palau.listaVacunas.addAll(vacunaAdmin.enCartilla)
        palau.listaVacunas.add(vacunaAdmin.hepatitisA)
        palau.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oceania.add(palau)

        //Papua Nueva Guinea
        val nuevaguinea = Pais("Papua Nueva Guinea")
        nuevaguinea.listaVacunas.addAll(vacunaAdmin.enCartilla)
        nuevaguinea.listaVacunas.add(vacunaAdmin.hepatitisA)
        nuevaguinea.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oceania.add(nuevaguinea)

        //Samoa
        val samoa = Pais("Samoa")
        samoa.listaVacunas.addAll(vacunaAdmin.enCartilla)
        samoa.listaVacunas.add(vacunaAdmin.hepatitisA)
        samoa.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        oceania.add(samoa)

        //Vanuatu
        val vanuatu = Pais("Vanuatu")
        vanuatu.listaVacunas.addAll(vacunaAdmin.enCartilla)
        vanuatu.listaVacunas.add(vacunaAdmin.hepatitisA)
        vanuatu.listaVacunas.add(vacunaAdmin.fiebreTifoidea)
        vanuatu.listaVacunas.add(vacunaAdmin.malaria)
        oceania.add(vanuatu)
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