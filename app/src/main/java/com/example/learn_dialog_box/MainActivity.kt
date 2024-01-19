package com.example.learn_dialog_box

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.learn_dialog_box.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.type1Button.setOnClickListener {
            val builder1 = AlertDialog.Builder( this )
            builder1.setTitle("Are you sure ? ")
            builder1.setMessage("Do you want to close the app ?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes" , DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when  clicked
                finish()
            })
            builder1.setNegativeButton("No" , DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when  clicked
            })
            builder1.show()
        }
        binding.type2Button.setOnClickListener {
            val options = arrayOf("c++" , "c" , "java" , "kotlin")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("what is you want?")
            builder2.setSingleChoiceItems(options , 0 ,DialogInterface.OnClickListener { dialog, which ->
//                what actions performed when user clicked any button
                Toast.makeText(this , "You clicked on ${options[which]}" , Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Yes" , DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when  clicked
                finish()
            })
            builder2.setNegativeButton("No" , DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when  clicked
            })
            builder2.show()
        }

    }
}