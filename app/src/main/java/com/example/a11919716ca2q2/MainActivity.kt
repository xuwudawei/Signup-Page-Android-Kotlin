package com.example.a11919716ca2q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var myRadioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val genderRadioGrp=findViewById<RadioGroup>(R.id.genderRadioGroup)
        val userAgreeCheck=findViewById<CheckBox>(R.id.checkbox)
        val signupButton=findViewById<Button>(R.id.submitButton)

        signupButton.setOnClickListener{
            val selectedId:Int=genderRadioGrp.checkedRadioButtonId
            myRadioButton.findViewById<RadioButton>(selectedId)
            Toast.makeText(applicationContext,"You selected "+myRadioButton.text.toString(),Toast.LENGTH_SHORT).show()
            if(userAgreeCheck.isChecked){
                Toast.makeText(applicationContext,"You have agreed, congratulations!!", Toast.LENGTH_LONG).show()
            }
        }
    }
}