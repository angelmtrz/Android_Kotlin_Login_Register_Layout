package com.angelmtrz.apploginregisterlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            val intent = Intent(baseContext, MainActivity::class.java)
            intent.putExtra("mensaje", "Login exitoso!")
            setResult(RESULT_OK, intent)
            finish()
        }
    }


}