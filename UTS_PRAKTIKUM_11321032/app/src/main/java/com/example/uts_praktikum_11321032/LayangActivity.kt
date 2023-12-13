package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class LayangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layang)

        val txtd1 = findViewById(R.id.txtd1) as EditText
        val txtd2 = findViewById(R.id.txtd2) as EditText
        val txta = findViewById(R.id.txtka) as EditText
        val txtb = findViewById(R.id.txtkb) as EditText
        val txtc = findViewById(R.id.txtkc) as EditText
        val txtd = findViewById(R.id.txtkd) as EditText
        val btnkeliling = findViewById(R.id.btnkeliling) as Button
        val btnluas = findViewById(R.id.btnluas) as Button

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Hasil")
        builder.setPositiveButton("Ok", null)

        btnluas.setOnClickListener {
            val d1 = txtd1.text.toString().toInt()
            val d2 = txtd2.text.toString().toInt()
            val luas = (d1 * d2)/2
            builder.setMessage(luas.toString())
            builder.show()
        }
        btnkeliling.setOnClickListener {
            val a = txta.text.toString().toInt()
            val b = txtb.text.toString().toInt()
            val c = txtc.text.toString().toInt()
            val d = txtd.text.toString().toInt()
            val keliling = a + b + c + d
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