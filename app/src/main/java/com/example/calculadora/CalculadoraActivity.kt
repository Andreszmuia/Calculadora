package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Arrays
import kotlin.math.log

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        val btnUno = findViewById<Button>(R.id.btnUno)
        val btnDos = findViewById<Button>(R.id.btnDos)
        val btnTres = findViewById<Button>(R.id.btnTres)
        val btnCuatro = findViewById<Button>(R.id.btnCuatro)
        val btnCinco = findViewById<Button>(R.id.btnCinco)
        val btnSeis = findViewById<Button>(R.id.btnSeis)
        val btnSiete = findViewById<Button>(R.id.btnSiete)
        val btnOcho = findViewById<Button>(R.id.btnOcho)
        val btnNueve = findViewById<Button>(R.id.btnNueve)
        val btnCero = findViewById<Button>(R.id.btnCero)
        val btnPunto = findViewById<Button>(R.id.btnPunto)
        val btnSuma = findViewById<Button>(R.id.btnSuma)
        val btnResta = findViewById<Button>(R.id.btnResta)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        val btnResultado = findViewById<Button>(R.id.btnResultado)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val btnRetroceso = findViewById<Button>(R.id.btnRetroceso)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val mtPantalla = findViewById<EditText>(R.id.mtPantalla)
        btnUno.setOnClickListener{
            agregarDato("1")
        }
        btnDos.setOnClickListener{
            agregarDato("2")
        }
        btnTres.setOnClickListener{
            agregarDato("3")
        }
        btnCuatro.setOnClickListener{
            agregarDato("4")
        }
        btnCinco.setOnClickListener{
            agregarDato("5")
        }
        btnSeis.setOnClickListener{
            agregarDato("6")
        }
        btnSiete.setOnClickListener{
            agregarDato("7")
        }
        btnOcho.setOnClickListener{
            agregarDato("8")
        }
        btnNueve.setOnClickListener{
            agregarDato("9")
        }
        btnCero.setOnClickListener{
            agregarDato("0")
        }
        btnSuma.setOnClickListener {
            if (!mtPantalla.text.isNullOrEmpty()) {
                if (mtPantalla.text.split(" ").last() != ""){
                    agregarDato(" + ")
                }
            }
        }
        btnResta.setOnClickListener {
            if (!mtPantalla.text.isNullOrEmpty()) {
                if (mtPantalla.text.split(" ").last() != ""){
                    agregarDato(" - ")
                }
            }
        }
        btnDivision.setOnClickListener {
            if (!mtPantalla.text.isNullOrEmpty()) {
                if (mtPantalla.text.split(" ").last() != ""){
                    agregarDato(" / ")
                }
            }
        }
        btnMultiplicacion.setOnClickListener {
            if (!mtPantalla.text.isNullOrEmpty()) {
                if (mtPantalla.text.split(" ").last() != ""){
                    agregarDato(" * ")
                }
            }
        }
        btnPunto.setOnClickListener {
            agregarDato(".")
        }
        btnBorrar.setOnClickListener {
            mtPantalla.setText("")
        }
        btnRetroceso.setOnClickListener {
            if (!mtPantalla.text.isNullOrEmpty()){var txt = mtPantalla.text.split("")
                txt = txt.dropLast(1)
                txt = txt.drop(1)
                if (txt[(txt.count()-1)] == " "){
                    txt = txt.dropLast(3)
                } else {
                    txt = txt.dropLast(1)
                }
                var res = ""
                txt.forEach { res += it }
                mtPantalla.setText(res)
            }
        }
        btnResultado.setOnClickListener {
            val operacion = mtPantalla.text.split(" ")
            var resul = 0
            if (operacion.count() >= 3){
                for (i in (0 until (operacion.count())) step 2){
                    if (resul == 0){
                        resul = operacion[0].toInt();
                    }
                    if (i != (operacion.count()-1)){
                        if (operacion[i+1] == "+"){
                            resul += operacion[i+2].toInt()
                        } else if (operacion[i+1] == "-"){
                            resul -= operacion[i+2].toInt()
                        } else if (operacion[i+1] == "/"){
                            resul /= operacion[i+2].toInt()
                        } else if (operacion[i+1] == "*"){
                            resul *= operacion[i+2].toInt()
                        }
                    }
                }
                tvResultado.setText("" + resul)
            }else {

            }
        }
    }

    fun agregarDato(Dato: String){
        var tmPantalla = findViewById<EditText>(R.id.mtPantalla)
        var texto = tmPantalla.text.toString()
        texto += Dato
        tmPantalla.setText(texto)
    }
}