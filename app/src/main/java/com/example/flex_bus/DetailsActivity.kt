package com.example.flex_bus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*



class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)



        button.setOnClickListener {
            val myDialog = MyDialog()
            myDialog.show(supportFragmentManager, "123")
            // it... accesses the view that was clicked

            // We want to act on the textView and editText instances
            // Change the text on the TextView
            // to whatever is currently in the EditText
            //val  intent = Intent(this,ViewDetailsActivity2::class.java)
            //startActivity(intent)
            //textViewName.text = editTextName.text
            //textViewPhone.text = checkBoxExecutive.text
        }
    }
}
