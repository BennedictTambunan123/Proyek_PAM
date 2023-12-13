package com.example.uts_praktikum_11321032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RuangCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruang_category)
        val datar = findViewById(R.id.datar) as Button
        val ruang = findViewById(R.id.ruang) as Button
        val home = findViewById(R.id.home) as ImageView
        val category = findViewById(R.id.category) as ImageView
        val profile = findViewById(R.id.profile) as ImageView
        val kubus = findViewById(R.id.kubus) as TextView
        val tabung = findViewById(R.id.tabung) as TextView
        val balok = findViewById(R.id.balok) as TextView
        val prisma = findViewById(R.id.prisma) as TextView
        val bola = findViewById(R.id.bola) as TextView
        val kerucut = findViewById(R.id.kerucut) as TextView


        datar.setOnClickListener {
            val intent = Intent(this, DatarCategory::class.java)
            startActivity(intent)
        }
        ruang.setOnClickListener {
            val intent = Intent(this, RuangCategory::class.java)
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
        prisma.setOnClickListener {
            val intent = Intent(this, PrismaActivity::class.java)
            startActivity(intent)
        }
        kerucut.setOnClickListener {
            val intent = Intent(this, KerucutActivity::class.java)
            startActivity(intent)
        }
        bola.setOnClickListener {
            val intent = Intent(this, BolaActivity::class.java)
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