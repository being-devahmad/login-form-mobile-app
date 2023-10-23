package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    lateinit var etName : EditText;
    lateinit var etPass : EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        etName = findViewById(R.id.etName)
        etPass = findViewById((R.id.etPassword))
    }

    fun openSignUpPage(view: View) {
        val intent = Intent(applicationContext , MainActivity::class.java);
        startActivity(intent);
    }

    fun login(view: View) {
        var name = etName.text.toString();
        var password = etPass.text.toString();

        if(name == password){
            val intent = Intent(applicationContext , HomePage::class.java);
            startActivity(intent);
        }else{
            val message = "Error 404"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, message, duration)
            toast.show()
        }
    }
}