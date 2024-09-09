package com.example.ciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnCadastro:Button = findViewById(R.id.btnCadastro)
        var txtCar: EditText = findViewById(R.id.txtCar)

        btnCadastro.setOnClickListener{
            var intent = Intent(this,TelaCadastro::class.java)
            //intent.putExtra("carro","${txtCar.text}")
            //intent.putExtra("preco",1000.00)

            var carro1 = Carro(
                "Azera",
                139320
            )
            intent.putExtra("carros", carro1)

            startActivity(intent)
        }

    }
    override fun onStart(){
        super.onStart()
        Log.i("ciclo de vida", "onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.i("ciclo de vida", "onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.i("ciclo de vida", "onPause")
    }
    override fun onStop(){
        super.onStop()
        Log.i("ciclo de vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo de vida", "onDestroy")
    }
}