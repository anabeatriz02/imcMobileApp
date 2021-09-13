package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = findViewById<Button>(R.id.button_calcular)
        val etPeso = findViewById<EditText>(R.id.edit_text_peso)
        val etAltura = findViewById<EditText>(R.id.edit_text_altura)
        val textViewResultado = findViewById<TextView>(R.id.text_view_resultado)

        var x = "10"


        btnCalcular.setOnClickListener {
//            val peso = etPeso.text.toString().
//            val altura = etAltura.text.toString().toDouble()
//            val imc = calcularImc(peso, altura)
//
//            textViewResultado.text = String.format("%.1f", imc)
        }

    }
}





