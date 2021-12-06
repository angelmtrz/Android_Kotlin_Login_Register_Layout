package com.angelmtrz.apploginregisterlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            intent.putExtra("mensaje", "Registro exitoso!")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}