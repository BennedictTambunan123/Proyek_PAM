package com.example.uts_praktikum_11321032

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)

        val txtusername = findViewById(R.id.txtusername) as EditText
        val txtpassword = findViewById(R.id.txtpassword) as EditText
        val btnsign_in = findViewById(R.id.sign_in) as Button
        val btnregistrate = findViewById(R.id.registrate) as Button

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Eror")
        builder.setPositiveButton("Kembali", null)

        btnsign_in.setOnClickListener {
            val username = txtusername.text.toString() ;
            val password = txtpassword.text.toString() ;
            if (username == "user123@gmail.com" || username == "user123" && password == "password123") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else if(username.isEmpty() || password.isEmpty()){
                builder.setMessage("Masukkan data dengan lengkap")
                builder.show()
            }
            else if(username != "user123" || username != "user123@gmail.com" && password != "password123"){
                builder.setMessage("username atau passoword salah")
                builder.show()
            }
        }

            btnregistrate.setOnClickListener {
                val intent = Intent(this, RegistrateActivity::class.java)
                startActivity(intent)
                }
        }
}