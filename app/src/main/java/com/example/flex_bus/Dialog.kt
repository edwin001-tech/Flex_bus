package com.example.flex_bus

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MyDialog: DialogFragment() {
    override
    fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        // Use the Builder class because this dialog
        // has a simple UI.
        // We will use the more flexible onCreateView function
        // instead of onCreateDialog in the next project
        val builder = AlertDialog.Builder(this.requireActivity())

             // Dialog will have "Make a selection" as the title
             builder.setMessage("Details successfully captured.Do you wish to proceed and book your seat?")
                 // An OK button that does nothing
                 .setPositiveButton("OK") { dialogInterface: DialogInterface, i: Int ->
                     val intent = Intent(this.requireActivity(),PickSeatActivity::class.java)
                     startActivity(intent)


                 }
                 // A "Cancel" button that does nothing
                 .setNegativeButton("Cancel") { dialog, id ->
                     // Nothing happening here either
                 }



        // More code here soon

        // Create the object and return it
        return builder.create()
        // End of onCreateDialog

    }
}