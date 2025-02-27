package com.example.template

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    private lateinit var tvEmail: TextView
    private lateinit var tvPhone: TextView
    private lateinit var tvAddress: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        initializeViews()
        setupClickListeners()
        loadContactInfo()
    }

    private fun initializeViews() {
        tvEmail = findViewById(R.id.tvEmail)
        tvPhone = findViewById(R.id.tvPhone)
        tvAddress = findViewById(R.id.tvAddress)
    }

    private fun setupClickListeners() {
        tvEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:${getString(R.string.contact_email)}")
            }
            startActivity(Intent.createChooser(intent, "إرسال بريد إلكتروني"))
        }

        tvPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:${getString(R.string.contact_phone)}")
            }
            startActivity(intent)
        }
    }

    private fun loadContactInfo() {
        tvEmail.text = getString(R.string.contact_email)
        tvPhone.text = getString(R.string.contact_phone)
        tvAddress.text = getString(R.string.contact_address)
    }
}
