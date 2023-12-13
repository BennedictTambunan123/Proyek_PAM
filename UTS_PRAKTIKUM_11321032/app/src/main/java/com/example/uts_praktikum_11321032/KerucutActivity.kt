package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class KerucutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerucut)

        val txtka = findViewById(R.id.txtka) as EditText
        val txtkt = findViewById(R.id.txtkt) as EditText
        val txtks = findViewById(R.id.txtks) as EditText
        val txta = findViewById(R.id.txta) as EditText
        val txts = findViewById(R.id.txts) as EditText
        val btnkeliling = findViewById(R.id.btnkeliling) as Button
        val btnluas = findViewById(R.id.btnluas) as Button

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Hasil")
        builder.setPositiveButton("Ok", null)

        btnluas.setOnClickListener {
            val r = txta.text.toString().toInt()
            val s = txts.text.toString().toInt()
            val luas = 3.14 * r * (r + s)
            builder.setMessage(luas.toString())
            builder.show()
        }
        btnkeliling.setOnClickListener {
            val r = txtka.text.toString().toInt()
            val s = txtks.text.toString().toInt()
            val t = txtkt.text.toString().toInt()
            val keliling = (3.14 * (r * r) * t)/3
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