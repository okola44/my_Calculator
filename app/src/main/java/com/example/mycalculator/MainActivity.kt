package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   var etNum=findViewById<EditText>(R.id.etNum)
   var etNum2=findViewById<EditText>(R.id.etNum2)
   var tvAnswer=findViewById<TextView>(R.id.tvAnswer)
        var btnadd = findViewById<Button>(R.id.btnplus)
        var btnminus = findViewById<Button>(R.id.btnminus)
        var btnmultiply=findViewById<Button>(R.id.btnmultiply)
        var btnmodulus=findViewById<Button>(R.id.btnmodulus)

        btnadd.setOnClickListener {
            if(etNum.text.toString()==""){
                Toast.makeText(baseContext,"Enter num",Toast.LENGTH_SHORT).show()
            }
            else if (etNum2.toString()==""){
                Toast.makeText(baseContext,"enter num",Toast.LENGTH_SHORT).show()
            }
            else{
                var a=etNum.text.toString().toInt()
                var b=etNum2.text.toString().toInt()
                var addition=a+b
                tvAnswer.text = " Answer:${addition}"
            }
        }
        btnminus.setOnClickListener {
            var a=etNum.text.toString().toInt()
            var b=etNum2.text.toString().toInt()
            var subtraction=a-b
            tvAnswer.text="Answer${subtraction}"


        }
        btnmodulus.setOnClickListener {
            var a=etNum.text.toString().toInt()
            var b=etNum2.toString().toInt()
            var modulus=a%b
            tvAnswer.text="Answer${modulus}"


        }
        btnmultiply.setOnClickListener {
            var a=etNum.text.toString().toInt()
            var b=etNum2.text.toString().toInt()
            var multiplication=a*b
            tvAnswer.text="Answer${multiplication}"
        }
       }
    }
