package br.com.igorbag.meuprimeiroappdio

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import br.com.igorbag.meuprimeiroappdio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val languages = resources.getStringArray(R.array.languages_list)
        val adapter = ArrayAdapter(this, R.layout.list_item, languages)

        binding.autoCompleteLanguages.setAdapter(adapter)
        binding.autoCompleteLanguages.setText("Português", false)
        mutableLinguage("Português")

        binding.autoCompleteLanguages.setOnItemClickListener { parent, view, position, id ->
            val selectedLanguage = languages[position]
            mutableLinguage(selectedLanguage)
        }
    }

    private fun mutableLinguage(language: String) {
        when (language) {
            "Português" -> {
                binding.cardBackBottomText.text =
                    "Meu primeiro aplicativo, criado para praticar os conceitos aprendidos no Bootcamp de Mobile Developer da DIO."
            }

            "Inglês" -> {
                binding.cardBackBottomText.text =
                    "My first app, created to practice the concepts learned in the DIO Mobile Developer Bootcamp."
            }

            "Espanhol" -> {
                binding.cardBackBottomText.text =
                    "Mi primera aplicación, creada para practicar los conceptos aprendidos en el DIO Mobile Developer Bootcamp."
            }

            "Francês" -> {
                binding.cardBackBottomText.text =
                    "Ma première application, créée pour mettre en pratique les concepts appris lors du DIO Mobile Developer Bootcamp."
            }

            "Alemão" -> {
                binding.cardBackBottomText.text =
                    "Meine erste App, entwickelt, um die im DIO Mobile Developer Bootcamp erlernten Konzepte in die Praxis umzusetzen."
            }
        }
    }
}