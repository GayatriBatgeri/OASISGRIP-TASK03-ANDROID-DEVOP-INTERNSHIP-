package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnadd = findViewById<Button>(R.id.btnadd)
        val btnsub = findViewById<Button>(R.id.btnsub)
        val btnmul = findViewById<Button>(R.id.btnmul)
        val btndiv = findViewById<Button>(R.id.btndiv)
        val tvresult = findViewById<TextView>(R.id.tvresult)
        val etfno = findViewById<EditText>(R.id.etfno)
        val etsno = findViewById<EditText>(R.id.etsno)
        btnadd.setOnClickListener(){
            tvresult.text = "Addition : "+(etfno.text.toString().toFloat()+etsno.text.toString().toFloat()).toString()
        }
        btnmul.setOnClickListener(){
            tvresult.text = "Multiplication : "+(etfno.text.toString().toFloat()*etsno.text.toString().toFloat()).toString()
        }
        btnsub.setOnClickListener(){
            tvresult.text = "Subtrtaction : "+(etfno.text.toString().toFloat()-etsno.text.toString().toFloat()).toString()
        }
        btndiv.setOnClickListener(){
            tvresult.text = "Division : "+(etfno.text.toString().toFloat()/etsno.text.toString().toFloat()).toString()
        }
    }
}