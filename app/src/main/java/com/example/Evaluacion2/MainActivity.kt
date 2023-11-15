package com.example.Evaluacion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val usuario = findViewById<EditText>(R.id.Usuario)

        val clave = findViewById<EditText>(R.id.Clave)

        val iniciar = findViewById<Button>(R.id.Iniciar)

        // Comprobar

        val Usuario = usuario.text.toString()

        val Clave = clave.text.toString()

        if (Usuario == "admin" && Clave == "1234")
        {

            val intent = Intent(this, MenuActivity::class.java)

            startActivity(intent)
        }

        iniciar.setOnClickListener {

            val Usuario = usuario.text.toString()
            val Clave = clave.text.toString()

            if (Usuario == "admin" && Clave == "1234") {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)

            } else {
                // Si el usuario es invalido aparecerá un mensaje que diga:

                Toast.makeText(this, "Usuario Invalido",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

}