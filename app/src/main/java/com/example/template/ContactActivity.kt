package com.example.template

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        val tvEmail: TextView = findViewById(R.id.tvEmail)
        val tvPhone: TextView = findViewById(R.id.tvPhone)
        val tvAddress: TextView = findViewById(R.id.tvAddress)
        tvEmail.text = getString(R.string.contact_email)
        tvPhone.text = getString(R.string.contact_phone)
        tvAddress.text = getString(R.string.contact_address)
    }
}
