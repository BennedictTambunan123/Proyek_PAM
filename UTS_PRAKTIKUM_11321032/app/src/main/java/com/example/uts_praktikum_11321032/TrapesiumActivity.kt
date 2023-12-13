package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class TrapesiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium)

        val txtab = findViewById(R.id.txtab) as EditText
        val txtbc = findViewById(R.id.txtbc) as EditText
        val txtcd = findViewById(R.id.txtcd) as EditText
        val txtad = findViewById(R.id.txtad) as EditText
        val txta = findViewById(R.id.txta) as EditText
        val txtb = findViewById(R.id.txtb) as EditText
        val txtt = findViewById(R.id.txtt) as EditText
        val btnkeliling = findViewById(R.id.btnkeliling) as Button
        val btnluas = findViewById(R.id.btnluas) as Button

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Hasil")
        builder.setPositiveButton("Ok", null)

        btnluas.setOnClickListener {
            val a = txta.text.toString().toInt()
            val b = txtb.text.toString().toInt()
            val t = txtt.text.toString().toInt()
            val luas = ((a + t)/2) * t
            builder.setMessage(luas.toString())
            builder.show()
        }
        btnkeliling.setOnClickListener {
            val ab = txtab.text.toString().toInt()
            val bc = txtbc.text.toString().toInt()
            val cd = txtcd.text.toString().toInt()
            val ad = txtad.text.toString().toInt()
            val keliling = ab + bc + cd + ab
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