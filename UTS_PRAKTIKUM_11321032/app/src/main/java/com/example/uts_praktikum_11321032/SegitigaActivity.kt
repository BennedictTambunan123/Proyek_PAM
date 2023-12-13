package com.example.uts_praktikum_11321032

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class SegitigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        val txtalas = findViewById(R.id.txtalas) as EditText
        val txttinggi = findViewById(R.id.txttinggi) as EditText
        val txtkelilingalas = findViewById(R.id.txtalas2) as EditText
        val txtkelilingtinggi = findViewById(R.id.txttinggi2) as EditText
        val txtkelilingsisi = findViewById(R.id.txtsisi2) as EditText
        val btnkeliling = findViewById(R.id.btnkeliling) as Button
        val btnluas = findViewById(R.id.btnluas) as Button

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Hasil")
        builder.setPositiveButton("Ok", null)

        btnluas.setOnClickListener {
            val a = txtalas.text.toString().toInt()
            val t = txttinggi.text.toString().toInt()
            val luas = (a * t)/2
            builder.setMessage(luas.toString())
            builder.show()
        }
        btnkeliling.setOnClickListener {
            val a = txtkelilingalas.text.toString().toInt()
            val b = txtkelilingtinggi.text.toString().toInt()
            val c = txtkelilingsisi.text.toString().toInt()
            val keliling = a + b + c
            builder.setMessage(keliling.toString())
            builder.show()
        }

        home.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        category.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
        profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}