package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etName : EditText;
    lateinit var etEmail : EditText;
    lateinit var etPassword : EditText;
    lateinit var etConfirmPassword : EditText;
    lateinit var rbMale : RadioButton;
    lateinit var rbFemale :  RadioButton;
    lateinit var cbCricket : CheckBox;
    lateinit var cbHockey : CheckBox;
    lateinit var cbFootball : CheckBox;
    lateinit var etBirthDate : EditText;
    lateinit var etCity : EditText;
    lateinit var etCountry : EditText;
    lateinit var rbBeginner : RadioButton;
    lateinit var rbAdvance : RadioButton;
    lateinit var cbTerms : CheckBox;
    lateinit var tvOutputBox : TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        cbCricket = findViewById(R.id.cbCricket);
        cbHockey = findViewById(R.id.cbHockey);
        cbFootball = findViewById(R.id.cbFootball);
        etBirthDate = findViewById(R.id.etBirthDate);
        etCity = findViewById(R.id.etCity);
        etCountry = findViewById(R.id.etCountry);
        rbBeginner = findViewById(R.id.rbBeginner);
        rbAdvance = findViewById(R.id.rbAdvance);
        cbTerms = findViewById(R.id.cbTerms);
        tvOutputBox = findViewById(R.id.tvOutputBox)

    }

    fun submitData(view: View) {
        var name = etName.text.toString();
        var email = etEmail.text.toString();
        var password = etPassword.text.toString()
        var confirmPassword = etConfirmPassword.text.toString();
        var gender = if (rbMale.isChecked) "Male" else if (rbFemale.isChecked) "Female" else "";
        var cricket = "";
            if(cbCricket.isChecked){
            cricket = "Cricket"
        }
        var football = "";
            if(cbFootball.isChecked){
                football = "Football";
            }
        var hockey = "";
            if(cbHockey.isChecked) {
                hockey = "Hockey"
        }
        var birthData = etBirthDate.text.toString();
        var city = etCity.text.toString();
        var country = etCountry.text.toString();
        var skills = if (rbBeginner.isChecked) "Beginner" else "Advance"


        if(password == confirmPassword){
           if(cbTerms.isChecked){
               if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                   val userData = "Name: $name\nEmail: $email\nPassword: $password\nGender: $gender\nSports: $cricket  $football  $hockey\nBirth Data: $birthData\nCity: $city\nCountry: $country\nSkills: $skills";
                   tvOutputBox.text = userData
               }
               else {
                   val message = "Please submit all details"
                   val duration = Toast.LENGTH_SHORT
                   val toast = Toast.makeText(applicationContext, message, duration)
                   toast.show()
               }
           }else{
               val message = "First of all , agree on our terms and conditions"
               val duration = Toast.LENGTH_SHORT
               val toast = Toast.makeText(applicationContext, message, duration)
               toast.show()
           }
        } else{
            val message = "Passwords didn't match"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, message, duration)
            toast.show()
        }

    }

    fun clearData(view: View) {
        etName.text.clear()
        etEmail.text.clear()
        etPassword.text.clear()
        etConfirmPassword.text.clear()
        rbMale.isChecked = false
        rbFemale.isChecked = false
        cbCricket.isChecked = false
        cbHockey.isChecked = false
        cbFootball.isChecked = false
        etBirthDate.text.clear()
        etCity.text.clear()
        etCountry.text.clear()
        rbBeginner.isChecked = false
        rbAdvance.isChecked = false
        cbTerms.isChecked = false
        tvOutputBox.text = ""
    }
}