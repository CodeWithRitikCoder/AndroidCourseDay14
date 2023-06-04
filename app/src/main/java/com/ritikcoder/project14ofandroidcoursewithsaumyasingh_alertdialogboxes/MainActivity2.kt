package com.ritikcoder.project14ofandroidcoursewithsaumyasingh_alertdialogboxes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ritikcoder.project14ofandroidcoursewithsaumyasingh_alertdialogboxes.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //Alert Dialog Box first.
        binding.buttonForAlertDialogBox1.setOnClickListener {
            val builderForAlertDialogBoxFirst= AlertDialog.Builder(this)
            builderForAlertDialogBoxFirst.setTitle("Alert dialog box")
            builderForAlertDialogBoxFirst.setMessage("Do you want to close the App?")
            builderForAlertDialogBoxFirst.setIcon(R.drawable.baseline_exit_to_app_24)
            //Positive action
            builderForAlertDialogBoxFirst.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when Yes is clicked?
                finish()
            })
            //Negative action
            builderForAlertDialogBoxFirst.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when No is clicked?

            })
            builderForAlertDialogBoxFirst.show()

        }

        //Alert Dialog Box second.
        binding.buttonForAlertDialogBox2.setOnClickListener {
            val options= arrayOf("Gulab Jamun", "Rasmallai", "Kaju katli")
            val builderForAlertDialogBoxSecond= AlertDialog.Builder(this)
            builderForAlertDialogBoxSecond.setTitle("Single selection dialog box")
            //builderForAlertDialogBoxSecond.setMessage("Which is your favorite sweet?")
            builderForAlertDialogBoxSecond.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when user clicks on any option.
                Toast.makeText(this, "you clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            //Positive action.
            builderForAlertDialogBoxSecond.setPositiveButton("Accept", DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when Submit is clicked.

            })
            //Negative action.
            builderForAlertDialogBoxSecond.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when Decline is clicked
            })
            builderForAlertDialogBoxSecond.show()
        }

        //Alert Dialog Box third.
        binding.buttonForAlertDialogBox3.setOnClickListener {
            val options= arrayOf("Gulab Jamun", "Rasmallai", "Kaju katli")
            val builderForAlertDialogBoxThird= AlertDialog.Builder(this)
            builderForAlertDialogBoxThird.setTitle("Multiple selection dialog box")
            //builderForAlertDialogBoxThird.setMessage("Select your sweets")
            builderForAlertDialogBoxThird.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this, "you clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            //Positive action.
            builderForAlertDialogBoxThird.setPositiveButton("Accept", DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when Submit is clicked.

            })
            //Negative action.
            builderForAlertDialogBoxThird.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when Decline is clicked
            })
            builderForAlertDialogBoxThird.show()
        }

    }
}