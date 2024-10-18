package com.example.task_0071

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var textET: EditText
    private lateinit var textTV: TextView
    private lateinit var buttonOutputInfoBTN: Button
    private lateinit var buttonRemoveInfoBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textET = findViewById(R.id.textET)
        textTV = findViewById(R.id.textTV)
        buttonOutputInfoBTN = findViewById(R.id.buttonOutputInfoBTN)
        buttonRemoveInfoBTN = findViewById(R.id.buttonRemoveInfoBTN)

        buttonOutputInfoBTN.setOnClickListener { view ->
            textTV.text = textET.text
        }

        buttonRemoveInfoBTN.setOnClickListener { view ->
            Snackbar.make(view, "Подтвердите удаление.", Snackbar.LENGTH_LONG)
                .setAction("Удалить.") {
                    textTV.text = ""
                    Snackbar.make(view, "Данные удалены", Snackbar.LENGTH_LONG).show()
                }.show()
        }
    }
}






