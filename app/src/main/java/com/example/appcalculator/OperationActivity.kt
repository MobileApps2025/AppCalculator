package com.example.appcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OperationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtNumber1 = findViewById<EditText>(R.id.edtNumberOne)
        val edtNumber2 = findViewById<EditText>(R.id.edtNumberTwo)
        val btnCalcul = findViewById<Button>(R.id.btnCalcul)
        val btnHome = findViewById<Button>(R.id.btnHome)
        val txtResult = findViewById<TextView>(R.id.txtRezultat)

        val operation = intent.getStringExtra("operation")?: "+"

        btnCalcul.setOnClickListener {
            val num1 = edtNumber1.text.toString().toIntOrNull()?:0
            val num2 = edtNumber2.text.toString().toIntOrNull()?:0

            val number = Number(num1, num2)


            val result = when(operation){
                "+"->number.add()
                "-"->number.subtract()
                "*"->number.multiply()
                "/"->number.divide()
                else -> "Operatie necunoscuta!"
            }
            txtResult.text="$num1 $operation $num2 = $result"

        }
btnHome.setOnClickListener {
    finish()
}

    }
}