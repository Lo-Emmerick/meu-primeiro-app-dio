package br.com.igorbag.meuprimeiroappdio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteLanguages)
        val languages = resources.getStringArray(R.array.languages_list)
        val adapter = ArrayAdapter(this, R.layout.list_item, languages)
        autoCompleteTextView.setAdapter(adapter)
    }

        //O desafio sera criar uma valor dentro do string.xml
        // E trocar o texto do xml e tornar internacional (Ingles, Espanhol, etc...)

}