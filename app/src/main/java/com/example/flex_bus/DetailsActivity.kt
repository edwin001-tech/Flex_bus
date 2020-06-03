package com.example.flex_bus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)





        val btnInsert = findViewById<View>(R.id.buttonCapture) as Button
        val editName =findViewById<View>(R.id.editTextName) as EditText
        val editAge = findViewById<View>(R.id.editTextDestination) as EditText
        fun saveRecord(view: View) {
            val id = editTextName.text.toString()
            val name = editTextDestination.text.toString()
            val databaseHandler: DatabaseHandler = DatabaseHandler(this)
        }



            /**buttonCapture.setOnClickListener {
                databaseHandler.insert(
                    editTextName.text.toString(),
                    editTextDestination.text.toString()
                )
            }*/






        buttonCapture.setOnClickListener {
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
