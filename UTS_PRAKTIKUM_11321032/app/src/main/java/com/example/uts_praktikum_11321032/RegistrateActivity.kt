package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class RegistrateActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        fun login(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrate)

        val txtnoktp = findViewById(R.id.txtnoktp) as EditText
        val txtname = findViewById(R.id.txtname) as EditText
        val txtusername = findViewById(R.id.txtusername) as EditText
        val txtpassword = findViewById(R.id.txtpassword) as EditText
        val txtrepassword = findViewById(R.id.txtrepassword) as EditText
        val txtnohp = findViewById(R.id.txtnohp) as EditText
        val btnregistrate = findViewById(R.id.btnregistrate) as Button

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Pesan")
        builder.setPositiveButton("Kembali", null)

        btnregistrate.setOnClickListener {
            val noktp = txtnoktp.text.toString() ;
            val name = txtname.text.toString() ;
            val username = txtusername.text.toString() ;
            val password = txtpassword.text.toString() ;
            val repassword = txtrepassword.text.toString() ;
            val nomorhp = txtnohp.text.toString() ;
            if (noktp.isEmpty() || name.isEmpty() || nomorhp.isEmpty() || username.isEmpty() || password.isEmpty() || repassword.isEmpty()) {
                builder.setMessage("Masukkan data dengan lengkap")
                builder.show()
            }else if(repassword != password){
                builder.setMessage("Konfirmasi password tidak sesuai")
                builder.show()
            }else{
                builder.setMessage("Berhasil Registrasi Silahkan Login")
                builder.show()
                builder.setPositiveButton("Kembali", null)
                login()
            }
        }

        val textLink = findViewById<TextView>(R.id.hyperlink)
        textLink.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

}