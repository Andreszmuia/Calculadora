package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.DataOutput

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        var btnUno = findViewById<Button>(R.id.btnUno)
        var btnDos = findViewById<Button>(R.id.btnDos)
        var btnTres = findViewById<Button>(R.id.btnTres)
        var btnCuatro = findViewById<Button>(R.id.btnCuatro)
        var btnCinco = findViewById<Button>(R.id.btnCinco)
        var btnSeis = findViewById<Button>(R.id.btnSeis)
        var btnSiete = findViewById<Button>(R.id.btnSiete)
        var btnOcho = findViewById<Button>(R.id.btnOcho)
        var btnNueve = findViewById<Button>(R.id.btnNueve)
        var btnCero = findViewById<Button>(R.id.btnCero)
        var btnPunto = findViewById<Button>(R.id.btnPunto)
        var btnSuma = findViewById<Button>(R.id.btnSuma)
        var btnResta = findViewById<Button>(R.id.btnResta)
        var btnDivision = findViewById<Button>(R.id.btnDivision)
        var btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        var btnResultado = findViewById<Button>(R.id.btnResultado)
        var btnBorrar = findViewById<Button>(R.id.btnBorrar)
        var btnRetroceso = findViewById<Button>(R.id.btnRetroceso)
        var tvResultado = findViewById<TextView>(R.id.tvResultado)
        btnUno.setOnClickListener{
            agregarDato("1")
        }
        btnUno.setOnClickListener{
            agregarDato("2")
        }
        btnUno.setOnClickListener{
            agregarDato("3")
        }
        btnUno.setOnClickListener{
            agregarDato("4")
        }
        btnUno.setOnClickListener{
            agregarDato("5")
        }
        btnUno.setOnClickListener{
            agregarDato("6")
        }
        btnUno.setOnClickListener{
            agregarDato("7")
        }
        btnUno.setOnClickListener{
            agregarDato("8")
        }
        btnUno.setOnClickListener{
            agregarDato("9")
        }
        btnUno.setOnClickListener{
            agregarDato("10")
        }
    }

    fun agregarDato(Dato: String){
        var tmPantalla = findViewById<EditText>(R.id.mtPantalla)
        var texto = tmPantalla.text.toString()
        texto += Dato
        tmPantalla.setText(texto)
    }
}