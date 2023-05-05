package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    //Añadido
    private lateinit var tvSaludo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvSaludo = findViewById<TextView>(R.id.tvSaludo)
    }

    fun miClick(view: View) {
        when (view.id){
            R.id.tvSaludo -> {
                tvSaludo.text = "Hola Jose N."
            }
            R.id.btnSaludo -> {
                tvSaludo.text = "Hello World"
            }
        }
    }
}