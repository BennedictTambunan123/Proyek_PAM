package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        val logout = findViewById(R.id.logout) as ImageView
        val persegi = findViewById(R.id.persegi) as TextView
        val segitiga = findViewById(R.id.segitiga) as TextView
        val trapesium = findViewById(R.id.trapesium) as TextView
        val belahketupat = findViewById(R.id.belah_ketupat) as TextView
        val jajargenjang = findViewById(R.id.jajargenjang) as TextView
        val lingkaran = findViewById(R.id.lingkaran) as TextView
        val kubus = findViewById(R.id.kubus) as TextView
        val tabung = findViewById(R.id.tabung) as TextView
        val balok = findViewById(R.id.balok) as TextView
        val persegipanjang = findViewById(R.id.persegi_panjang) as TextView
        val segienam = findViewById(R.id.segienam) as TextView
        val layang = findViewById(R.id.layang) as TextView

        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView

        logout.setOnClickListener {
            val intent = Intent(this, FirstPage::class.java)
            startActivity(intent)
        }
        persegi.setOnClickListener {
            val intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }
        segitiga.setOnClickListener {
            val intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }
        trapesium.setOnClickListener {
            val intent = Intent(this, TrapesiumActivity::class.java)
            startActivity(intent)
        }
        belahketupat.setOnClickListener {
            val intent = Intent(this, BelahKetupatActivity::class.java)
            startActivity(intent)
        }
        jajargenjang.setOnClickListener {
            val intent = Intent(this, Jajargenjang::class.java)
            startActivity(intent)
        }
        lingkaran.setOnClickListener {
            val intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }
        kubus.setOnClickListener {
            val intent = Intent(this, KubusActivity::class.java)
            startActivity(intent)
        }
        tabung.setOnClickListener {
            val intent = Intent(this, TabungActivity::class.java)
            startActivity(intent)
        }
        balok.setOnClickListener {
            val intent = Intent(this, BalokActivity::class.java)
            startActivity(intent)
        }
        persegipanjang.setOnClickListener {
            val intent = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }
        segienam.setOnClickListener {
            val intent = Intent(this, SegiEnamActivity::class.java)
            startActivity(intent)
        }
        layang.setOnClickListener {
            val intent = Intent(this, LayangActivity::class.java)
            startActivity(intent)
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