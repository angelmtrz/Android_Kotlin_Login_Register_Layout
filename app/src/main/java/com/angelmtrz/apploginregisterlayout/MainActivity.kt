package com.angelmtrz.apploginregisterlayout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainLogin.setOnClickListener{
            val intent = Intent(baseContext, LoginActivity::class.java)
            startForResult.launch(intent)
        }

        btnMainRegister.setOnClickListener {
            val intent = Intent(baseContext, RegisterActivity::class.java)
            startForResult.launch(intent)
        }

    }

    val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult())
    { result: ActivityResult ->
        if(result.resultCode == Activity.RESULT_OK){
            val recibir = result.data
            val mensaje = recibir?.getStringExtra("mensaje")
            if(null != mensaje){
                Toast.makeText(baseContext,mensaje, Toast.LENGTH_LONG).show()
            }
        }
    }
}


