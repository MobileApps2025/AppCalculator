package com.example.appcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val btnAdunare = findViewById<Button>(R.id.btnAdunare)
        val btnScadere = findViewById<Button>(R.id.btnScadere)
        val btnInmultire = findViewById<Button>(R.id.btnInmultire)
        val btnImpartire = findViewById<Button>(R.id.btnImpartire)

        btnAdunare.setOnClickListener{
            openOperationActivity("+")
        }
        btnScadere.setOnClickListener {
            openOperationActivity("-")
        }
        btnInmultire.setOnClickListener {
            openOperationActivity("*")
        }
        btnImpartire.setOnClickListener {
            openOperationActivity("/")
        }
    }

    private fun openOperationActivity(op: String) {
        val intent = Intent(this, OperationActivity::class.java)
        intent.putExtra("operation", op)
        startActivity(intent)

    }
}