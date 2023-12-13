package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class BalokActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)

        val txtp = findViewById(R.id.txtp) as EditText
        val txtl = findViewById(R.id.txtl) as EditText
        val txtt = findViewById(R.id.txtt) as EditText
        val txtvp = findViewById(R.id.txtvp) as EditText
        val txtvl = findViewById(R.id.txtvl) as EditText
        val txtvt = findViewById(R.id.txtvt) as EditText
        val btnkeliling = findViewById(R.id.btnkeliling) as Button
        val btnluas = findViewById(R.id.btnluas) as Button
        val builder = AlertDialog.Builder(this)

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView

        builder.setTitle("Hasil")
        builder.setPositiveButton("Ok", null)

        btnluas.setOnClickListener {
            val p = txtp.text.toString().toInt()
            val l = txtl.text.toString().toInt()
            val t = txtt.text.toString().toInt()
            val luas = 2 * ((p*l) + (p*t) + (l*t))
            builder.setMessage(luas.toString())
            builder.show()
        }
        btnkeliling.setOnClickListener {
            val p = txtvp.text.toString().toInt()
            val l = txtvl.text.toString().toInt()
            val t = txtvt.text.toString().toInt()
            val keliling = p * l * t
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