package com.example.mnlgu.vacunasprototipo1.vacunas

class VacunaAdmin {
    val enCartilla: ArrayList<Vacuna> = ArrayList()
    val noEnCartilla: ArrayList<Vacuna> = ArrayList()

    val tuberculosis: Vacuna
    val hepatitisB: Vacuna
    val pentavalenteAcelular: Vacuna
    val dpt: Vacuna
    val rotavirus: Vacuna
    val neumococoConjugada: Vacuna
    val influenza: Vacuna
    val srp: Vacuna
    val vph: Vacuna
    val td: Vacuna
    val opv: Vacuna

    val meningitis: Vacuna
    val hepatitisA: Vacuna
    val fiebreTifoidea: Vacuna
    val fiebreAmarilla: Vacuna
    val malaria: Vacuna
    val dengue: Vacuna

    init {

        tuberculosis = Vacuna("Tuberculosis",
            "Dosis única, primera de la cartilla de vacunación. A veces bajo el nombre de vacuna BCG.",
            "La tuberculosis es una enfermedad causada por Mycobacterium tuberculosis, una bacteria que afecta a muchos órganos, pero generalmente afecta a los pulmones. Cuando un enfermo de tuberculosis pulmonar tose, estornuda o escupe, expulsa bacterias al aire. Basta con que una persona inhale una sola bacteria para quedar infectada, pero no necesariamente manifiestan la enfermedad. Las personas infectadas tienen a lo largo de la vida un riesgo de enfermar de tuberculosis de un 10%. Sin embargo, este riesgo es mucho mayor para las personas cuyo sistema inmunitario está dañado, como ocurre en casos de infección por el VIH, malnutrición o diabetes, o en quienes consumen tabaco.",
            true)
        enCartilla.add(tuberculosis)

        hepatitisB = Vacuna("Hepatitis B",
            "Agregada a partir de 1999 a la cartilla de vacunación Mexicana nacional, personas con esquemas anteriores deben buscar ser vacunados en su centro de salud más cercano. Se aplican 3 dosis:  la primera dosis se aplica después del nacimiento junto con la de la tuberculosis, la segunda dosis a las 2 meses de nacimiento y la tercera dosis a los 6 meses de edad.",
            "La hepatitis vírica aguda es una inflamación difusa del hígado producida por un virus y cuya duración es inferior a 6 meses. Se conocen varios tipos de virus: VHA, VHB, VHC, VHD y VHE. En la Hepatitis B un pequeño porcentaje de personas infectadas no consiguen eliminar el virus y la infección se vuelve crónica. Esas personas corren un mayor riesgo de morir por cirrosis hepática y cáncer de hígado. Se transmite por contacto con la sangre o los líquidos corporales de personas infectadas. Las principales vías de transmisión del VHB son perinatal (de la madre al hijo durante el parto); de un niño a otro; inyecciones y transfusiones contaminadas; y contacto sexual sin protección.",
            true)
        enCartilla.add(hepatitisB)

        pentavalenteAcelular = Vacuna("Pentavalente acelular",
            "Vacuna que protege contra 5 enfermedades: Difteria, Tos ferina, Tétanos, Poliomelitis, H. influenzae b. Se aplican 3 dosis: en el segundo, cuarto y sexto mes de edad.",
            "La difteria y la tos ferina son infecciones bacterianas transmitidas por vía aérea cuando una persona infectada tose o estornuda, se manifiesta principalmente por tos, en algunas ocasiones una tos seca (“tos de perro”). El tétanos es una enfermedad transmitida por una bacteria que sobrevive en el suelo, la saliva, el polvo y en el estiércol. Las bacterias suelen ingresar al cuerpo a través de un corte profundo, como cuando uno pisa un clavo, o a través de una quemadura; provoca severos espasmos musculares. La influenza es otra enfermedad respiratoria de origen viral que se manifiesta por tos, fiebre y dolores musculares; debido al recambio de los genes del virus es necesario vacunarse cada temporada en especial en inmunodeprimidos, adultos mayores y niños. La poliomielitis es una enfermedad que se transmite por secreciones respiratorias y por vía fecal-oral (cuando las personas no se lavan las manos después de ir al baño) que afecta a las neuronas responsables de los movimientos, provoca debilidad muscular, parálisis e incluso la muerte si afecta los músculos respiratorio (diafragma).",
            true)
        enCartilla.add(pentavalenteAcelular)

        dpt = Vacuna("DPT",
            "Vacuna de refuerzo contra: Difteria, Tos ferina, Tétanos. Única dosis administrada a los 4 años de edad.",
            "La difteria y la tos ferina son infecciones bacterianas transmitidas por vía aérea cuando una persona infectada tose o estornuda, se manifiesta principalmente por tos, en algunas ocasiones una tos seca (“tos de perro”). El tétanos es una enfermedad transmitida por una bacteria que sobrevive en el suelo, la saliva, el polvo y en el estiércol. Las bacterias suelen ingresar al cuerpo a través de un corte profundo, como cuando uno pisa un clavo, o a través de una quemadura; provoca severos espasmos musculares.",
            true)
        enCartilla.add(dpt)

        rotavirus = Vacuna("Rotavirus",
            "Vacuna de 3 dosis, administradas en el segundo, cuarto y sexto mes de edad.",
            "El rotavirus se transmite por secreciones respiratorias, por vía fecal-oral (cuando las personas no se lavan las manos después de ir al baño) y por superficies contaminadas; produce una gastroenteritis principalmente en niños menores de 5 años. La gastroenteritis se caracteriza por vómitos, una diarrea de consistencia acuosa y fiebre que pueden inducir una deshidratación mortal.",
            true)
        enCartilla.add(rotavirus)

        neumococoConjugada = Vacuna("Neumococo Conjugada",
            "Vacuna de 3 dosis, administradas en el segundo y cuarto mes de edad y al año.",
            "El neumococo (Streptococcus pneumoniae) es una bacteria que forma parte de nuestro cuerpo, principalmente en el sistema respiratorio; pero puede proliferar al grado de causar daño en varios órganos. Puede inflamar los bronquios, la nariz, los oídos, las conjuntivas de los ojos, las capas del corazón e incluso el cerebro. Es una de las bacterias que producen neumonía comunitaria. Las personas con un mayor riesgo son los inmunodeprimidos, los niños y los adultos mayores.",
            true)
        enCartilla.add(neumococoConjugada)

        influenza = Vacuna("Influenza",
            "Inicialmente de administran dos dosis: en el sexto y mes de edad. A partir de los 2 años se debe administrar el refuerzo anual entre octubre y enero.",
            "La influenza es una enfermedad respiratoria de origen viral que se manifiesta por tos, fiebre y dolores musculares; debido al recambio de los genes del virus es necesario vacunarse cada temporada en especial en inmunodeprimidos, adultos mayores y niños.",
            true)
        enCartilla.add(influenza)

        srp = Vacuna("SRP",
            "Vacuna que protege contra 3 enfermedades: Sarampión, Rubeóla, Parotiditis. La primera dosis se administra al año de edad, y el refuerzo se administra a los 6 años de edad. \n",
            "El sarampión es una enfermedad causada por un virus de la familia paramyxoviridae. Se caracteriza por pequeñas manchas en la piel de color rojo, fiebre y un estado general debilitado. La rubéola es una enfermedad causada por el virus de la rubéola de la familia togaviridae, se caracteriza por erupciones en la piel e inflamación en los ganglios linfáticos. La parotiditis o “paperas” es causada por un virus de la familia paramyxoviridae, sus síntomas son dolor de cabeza, malestar general, fiebre ocasional y dolor mandibular; posteriormente se presentan inflamación y crecimiento de las glándulas salivales (comenzando por las parótidas normalmente); también pueden verse afectados el páncreas y los testículos.\n",
            true)
        enCartilla.add(srp)

        vph = Vacuna("VPH",
            "Vacuna contra el Virus del Papiloma Humano administradas de los 11 a los 45 años: <14 años: 2 dosis con un intervalo de 6 meses. Agregada a partir del 2012 a la cartilla de vacunación Mexicana nacional, personas con esquemas anteriores deben buscar ser vacunados en su centro de salud más cercano y se le administrarán tres dosis: la segunda dosis con un intervalo de dos meses y en la tercera cuatro meses.",
            "El VPH es un virus transmitido a través de un contacto prolongado de piel con piel, principalmente a través de las relaciones sexuales (sexo anal y sexo vaginal); y en ocasiones puede transmitirse de la madre embarazada al feto. El VPH causa verrugas cutáneas en múltiples partes del cuerpo (manos, plantas de los pies, debajo de las uñas, brazos, cara) también causa verrugas genitales, verrugas anales y una gran variedad de tipos de cáncer: cervical, anal, vulvar, de pene, de boca, entre otros.",
            true)
        enCartilla.add(vph)

        td = Vacuna("Td",
            "Vacuna de refuerzo contra tétanos y difteria que debe administrarse cada 10 años.",
            "La difteria es una infección bacteriana transmitida por vía aérea cuando una persona infectada tose o estornuda, se manifiesta principalmente por tos, en algunas ocasiones una tos seca (“tos de perro”). El tétanos es una enfermedad transmitida por una bacteria que sobrevive en el suelo, la saliva, el polvo y en el estiércol. Las bacterias suelen ingresar al cuerpo a través de un corte profundo, como cuando uno pisa un clavo, o a través de una quemadura; provoca severos espasmos musculares.",
            true)
        enCartilla.add(td)

        opv = Vacuna("OPV",
            "Vacuna contra la poliomielitis vía oral con dosis a partir de los 6 meses hasta los 5 años en la primera y segunda Semanas Nacionales de Vacunación ",
            "La poliomielitis es una enfermedad que se transmite por secreciones respiratorias y por vía fecal-oral (cuando las personas no se lavan las manos después de ir al baño) que afecta a las neuronas responsables de los movimientos, provoca debilidad muscular, parálisis irreversible de las piernas e incluso la muerte si afecta los músculos respiratorio (diafragma). Afecta sobre todo a los niños menores de 5 años.",
            true)
        enCartilla.add(opv)

        meningitis = Vacuna("Meningitis por Meningococo",
            "El riesgo es mayor en África durante las épocas de sequía (diciembre-junio), en la región conocida como “Cinturón de Meningococo” que corresponde a una zona del África sub-Sahariana que va desde Senegal hasta Etiopía. La vacuna contra meningococo ACYW Menactra© está autorizada para su aplicación en México, esta vacuna es de tipo conjugada. El esquema para viajeros consiste en recibir dosis única, sin embargo cada dosis confiere una protección sostenida del 97 al 100% durante 3 a 5 años, posterior al cual se debe evaluar la aplicación de refuerzos. Consulte a su médico.",
            "Meningococo ACYW son grupo de bacterias que causan enfermedad y se trasmiten de humano a humano. Suelen ser de inicio súbito, evolución rápida (menos de 24h) y grave, puede encontrarse en la vías respiratorias y afecta principalmente al sistema nervioso central causando síntomas neurológicos. La bacteria se transmite por diseminación de gotas de saliva, a través de objetos contaminados y contacto directo con secreciones nasales o faríngeas.",
            false)
        noEnCartilla.add(meningitis)

        hepatitisA = Vacuna("Hepatitis A",
            "Las vacunas para viajar que confieren protección contra Hepatitis A se encuentran autorizadas para México en dos presentaciones, vacuna contra Hepatitis A sola o combinada con Hepatitis B. El esquema recomendado para viajeros consiste en la aplicación de dos dosis con un mínimo de 7 días previos al viaje. El esquema completo confiere una inmunidad contra la enfermedad del 95% con una dosis y mayor al 98% al completar dos dosis. Medidas preventivas: Clorar o hervir el agua (>1min a 85°C), beber agua embotellada o carbonatada, lavar y desinfectar frutas y verduras, evitar comer alimentos con cáscara, aumentar las prácticas de higiene personal, como lavarse las manos regularmente con agua y jabón, además de la vacunación. Consulte a su médico.",
            "La Hepatitis A es una enfermedad del hígado, causada por un virus, que puede ser leve hasta fulminante. Se considera una de las principales enfermedades que afecta a viajeros durante su estancia en el extranjero. Se transmite por la ingesta de alimentos y agua contaminada, además, del contacto directo con una persona infectada sin precauciones. Los síntomas pueden variar de leves (1-2 semanas) a severos. Se caracteriza por presentar fatiga, malestar general, pérdida de apetito, fiebre, dolor abdominal, náuseas, vómito, diarrea, orina oscura e ictericia (coloración amarillenta de la piel y la parte blanca de los ojos).",
            false)
        noEnCartilla.add(hepatitisA)

        fiebreTifoidea = Vacuna("Fiebre Tifoidea",
            "La vacuna contra Fiebre Entérica – Tifoidea Typhim Vi © está autorizada en México para la prevención de esta enfermedad. Se recomienda viajar vacunado e iniciar el esquema con un mínimo de 14 días previos al arribo de la zona con riesgo para que la inmunidad sea mayor al 75%. La vacuna confiere una protección adecuada durante los siguientes tres años. Contraindicaciones: niños menores de 2 años, personas con hipersensibilidad a la vacuna o a algún componente. Consulte a su médico.",
            "La Fiebre Tifoidea es una enfermedad aguda con fiebre, que ataca al tracto digestivo y es causada por la bacteria Salmonella typhi. Sin tratamiento oportuno puede causar complicaciones serias y potencialmente mortales. Se considera que más del 75% mundiales de los casos se adquieren durante el viaje. Se transmite por la ingesta de alimentos y agua contaminada. Consulte a su médico.",
            false)
        noEnCartilla.add(fiebreTifoidea)

        fiebreAmarilla = Vacuna("Fiebre Amarilla",
            "Viajar vacunado es la forma más efectiva de prevenir la fiebre amarilla. Iniciar el esquema con un mínimo de 10 días previos al arribo de la zona con riesgo para que la inmunidad sea mayor al 98%, una sola dosis de la vacuna basta para conferir inmunidad básica contra la enfermedad. Está contraindicada su administración en bebés menores de 9 meses, embarazadas o viajeros que tengan un tratamiento inmunosupresor.También deberá usar repelente que contenga DEET, Picaridina/KBR, IR3535 y/o Citronela en concentraciones suficientes sobre piel expuesta y ropa de mangas largas, pantalón y calcetines. Eliminar depósitos de agua donde pueda reproducirse el mosquito, entre otras. En México sólo se encuentra disponible la Vacuna de Fiebre Amarilla de Sanofi Pasteur (Stamaril ©), cepa 17D-204. Esta vacuna NO se debe aplicar, bajo ningún motivo, en dosis fraccionada. Consulte a su médico.",
            "La fiebre amarilla es una enfermedad causada por un virus, que se transmite por la picadura de un mosquito. Se presenta en 3 fases que dependen de la gravedad de la infección, con signos que van desde fiebre y dolor de cabeza, hasta daño al hígado, vómito negro (sangre) y falla renal. Entre el 20% y 50% de los enfermos pueden desarrollar complicaciones graves en órganos como el hígado, cerebro y riñones con desenlace fatal.",
            false)
        noEnCartilla.add(fiebreAmarilla)

        malaria = Vacuna("Malaria",
            "Actualmente no hay una vacuna contra el paludismo aprobada para usarse en seres humanos. Existen muchos medicamentos antipalúdicos eficaces. Consulte a su médico para encontrar el mejor medicamento profiláctico para usted (vía oral), si es que lo hay. Recuerde comentar sus planes de viaje, antecedentes médicos, edad, alergias a medicamentos, si tiene antecedentes de enfermedad psiquiátrica o está actualmente embarazada para escoger el mejor tratamiento para usted. Para dar suficiente tiempo para que algunos medicamentos surtan efecto, puede ser que tenga que ir al médico entre 4 y 6 semanas antes de viajar. Hay otros medicamentos contra el paludismo que solo se necesitan empezar a tomar un día antes del viaje, por lo que las personas que viajan a última hora aún pueden beneficiarse si consultan con su proveedor de atención médica antes de partir. Asimismo, se deben de evitar los piquetes de mosquito. . Cubra adecuadamente su cuerpo y tenga en especial precaución durante la noche.",
            "La malaria es transmitida por piquetes de mosquito (anófeles infectado) y causada por un parásito . Después de la infección, los parásitos (llamados esporozoítos) viajan a través del torrente sanguíneo hasta el hígado, donde maduran y producen otra forma de parásitos, llamada merozoítos. Los parásitos después ingresan e infectan a los glóbulos rojos en la sangre. Los síntomas y presentación principal es de fiebres altas, escalofríos, síntomas seudogripales (similares a una gripa) y anemia.",
            false)
        noEnCartilla.add(malaria)

        dengue = Vacuna("Dengue",
            "Se reporta un reciente brote. No hay vacunas para prevenir la infección por el virus del dengue y las medidas de protección más eficaces contra esta enfermedad son las que evitan las picaduras de mosquitos. Cuando ocurre la infección, la identificación temprana y el tratamiento de asistencia oportuno pueden disminuir de manera significativa el riesgo de complicaciones médicas y de muerte. Para disminuir el riesgo, cuando viaje a áreas donde hay dengue: Use repelentes para insectos que tengan DEET, utilice ropa que le cubra los brazos, las piernas y los pies y cierre las puertas y ventanas que no tengan telas protectora.",
            "El dengue es una infección causada por un virus. Usted puede infectarse si un mosquito infectado lo pica. El dengue no se transmite de persona a persona. Es común en áreas cálidas y húmedas del mundo. Los brotes pueden ocurrir en las épocas de lluvia. Los síntomas incluyen fiebre alta, dolores de cabeza, dolor en las articulaciones y los músculos, vómitos y sarpullido. Algunas veces, el dengue se convierte en fiebre hemorrágica por dengue, que causa sangrado en la nariz, las encías o debajo de la piel. También puede convertirse en síndrome de shock por dengue que causa sangrado masivo y shock. Estas formas de dengue ponen la vida en peligro.",
            false)
        noEnCartilla.add(dengue)
    }
}