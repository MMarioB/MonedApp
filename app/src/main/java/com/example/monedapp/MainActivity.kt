package com.example.monedapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)

        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preguntas: ArrayList<String> = arrayListOf()
        val randomNumber = (0..43).random()

        preguntas.add("Quien es más guapo")
        preguntas.add("Quien es más feo")
        preguntas.add("Quien es más listo")
        preguntas.add("Quien es más tonto")
        preguntas.add("Quien es más sociable")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que compre cosas que no necesita")
        preguntas.add("Quien es más probable que llore en público")
        preguntas.add("Quien es más probable que se haga gay")
        preguntas.add("Quien es más probable que sea mas impaciente a la hora de hacer las cosas")
        preguntas.add("Quien es más probable que no se bañe una semana para cumplir un reto")
        preguntas.add("Quien es más probable que pase en redes sociales todo el dia")
        preguntas.add("Quien es más probable que pille cacho de fiesta")
        preguntas.add("Quien es más probable que lo encuentres comiendose su kk")
        preguntas.add("Quien es más probable que vaya más seguido al gimnasio")
        preguntas.add("Quien es más probable que pueda sobrevivir en un apocalipsis")
        preguntas.add("Quien es más probable que haga trampa en un juego solo para ganar")
        preguntas.add("Quien es más probable que se enfade por tonterías")
        preguntas.add("Quien es más probable que se case por dinero")
        preguntas.add("Quien es más probable que se tire un pedo en público")
        preguntas.add("Quien es más probable que salga por la calle y se encuentre a alguien que conoce")
        preguntas.add("Quien es más probable que pueda entablar una conversacion con alguien desconocido más rápido")
        preguntas.add("Quién es más probable que pase más de 24H sin salir de su cuarto")
        preguntas.add("Quien es más probable que rompa algún objeto mientras limpia")
        preguntas.add("Quien es más probable que que se enamore de la novia de un amigo")
        preguntas.add("Quien es más probable que se coma un moco")
        preguntas.add("Quien es más probable que encuentre novia antes")
        preguntas.add("Quien es más probable que tenga un accidente")
        preguntas.add("Quien es más probable que lo estafen")
        preguntas.add("Quien es más probable que que tenga hijos primero")
        preguntas.add("Quien es más probable que que la tenga mas grande")
        preguntas.add("Quien es más probable que que la tenga mas pequeña")
        preguntas.add("Quien baila mejor")
        preguntas.add("Quien es baila peor")
        preguntas.add("Quien crees que folla mejor")
        preguntas.add("Quien crees que folla peor")
        preguntas.add("De quien te fias mas")
        preguntas.add("De quien te fias menos")
        preguntas.add("Quien es el que más excusas da a la hora de salir")
        preguntas.add("Quien es más probable que deje una serie a medias")
        preguntas.add("Quien crees que es un bienqueda")
        preguntas.add("Quien crees que esta más en forma")
        preguntas.add("Quien crees que se enfada con más facilidad")
        preguntas.add("Quien es más probable que haga una estupidez por dinero")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")
        preguntas.add("Quien es más probable que haga preguntas estúpidas")








        text_view.setText(preguntas.get(randomNumber))
        preguntas.removeAt(randomNumber)

        button.setOnClickListener {

            val intent: Intent = Intent(this, Moneda::class.java)
            startActivity(intent)
        }
    }
}