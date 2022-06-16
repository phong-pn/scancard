package com.example.scancard

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class DialogNapthe(
    private val number : String,
    val nap: (number: String) -> Unit,

    ):DialogFragment() {
    private lateinit var numberText : TextView
    private lateinit var naptheButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.napthe,container,false)

    }

    override fun getTheme() = R.style.NaptheDialog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        numberText =  view.findViewById<TextView>(R.id.number_text).also { it.text = number }
        naptheButton = view.findViewById<Button>(R.id.napthe_button)
            .also { it.setOnClickListener { nap(number) }
        }

    }

    override fun onDismiss(dialog: DialogInterface) {
        MainActivity.dimissDialog()
    }

}