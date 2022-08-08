package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val editResultado: EditText = findViewById(R.id.editResultado)
        val btnVoltar: Button = findViewById(R.id.btnVoltar)

        val intent = intent
        val inputNome = intent.getStringExtra("nome")
        val inputEndereco = intent.getStringExtra("endereco")
        val inputBairro = intent.getStringExtra("bairro")
        val inputCep = intent.getStringExtra("cep")
        val inputCidade = intent.getStringExtra("cidade")


        editResultado.setText("Nome: " + inputNome.toString() + "; " + "Endereço: " + inputEndereco.toString() + "; " + "Bairro: "
                + inputBairro.toString() + "; " + "CEP: " + inputCep.toString() + "; " + "Cidade: " + inputCidade.toString())


        btnVoltar.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}