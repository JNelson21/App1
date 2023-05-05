package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Eventos de USUARIO 1
        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        btnSaludo.setOnClickListener {
            Log.d("LOGTAG", "Hola mundo")
            tvSaludo.text = "Hola mundo"
        }

        tvSaludo.setOnClickListener{
            tvSaludo.text = "Hola Jose"
        }

        //EVENTOS DE USUARIO 2
        //val lambda: (View) -> Unit = { Log.d("LOGTAG", "Hola mundo")}
        // btnSaludo.setOnClickListener(lambda)

        //EVENTOS DE USUARIO 3
        //Se encuentra en activity_main3.xml
    }
}