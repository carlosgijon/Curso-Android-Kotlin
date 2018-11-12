package com.example.carlos.intents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById(R.id.textViewIntent) as TextView  // Se convierte a Textview igual que en java

        val bundle = intent.extras  // Usamos bundle para almacenar lo que llega de otras activitys
        if(bundle != null && bundle.getString("saludo") != null) {
            val saludo = bundle.getString("saludo")
            textView.text = saludo
        }
        else {
            Toast.makeText(this, "Esta vacio", Toast.LENGTH_SHORT).show()
        }
    }
}
