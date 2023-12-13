package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class Jajargenjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jajargenjang)

        val txtka = findViewById(R.id.txtka) as EditText
        val txtkb = findViewById(R.id.txtkb) as EditText
        val txta = findViewById(R.id.txta) as EditText
        val txtb = findViewById(R.id.txtb) as EditText
        val btnkeliling = findViewById(R.id.btnkeliling) as Button
        val btnluas = findViewById(R.id.btnluas) as Button
        val builder = AlertDialog.Builder(this)

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView

        builder.setTitle("Hasil")
        builder.setPositiveButton("Ok", null)

        btnluas.setOnClickListener {
            val a = txta.text.toString().toInt()
            val b = txtb.text.toString().toInt()
            val luas = a * b
            builder.setMessage(luas.toString())
            builder.show()
        }
        btnkeliling.setOnClickListener {
            val a = txtka.text.toString().toInt()
            val b = txtkb.text.toString().toInt()
            val keliling = (a + b) * 2
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