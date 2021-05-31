package com.example.edu.visualizacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edu.R
import com.example.edu.databinding.ActivityEduMateriasBinding
import com.example.edu.objetos.Materia
import com.example.edu.objetos.app

class edu_materias : AppCompatActivity() {

    private lateinit var binding: ActivityEduMateriasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEduMateriasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var materias: MutableList<Materia> = ArrayList()


        binding.button8.setOnClickListener {
            if (binding.checkBoxPortugues.isChecked) {
                materias.add(Materia.portugues)
            }

            if (binding.checkBoxMatemTica.isChecked) {
                materias.add(Materia.matematica)
            }

            if (binding.checkBoxBiologia.isChecked) {
                materias.add(Materia.biologia)
            }

            if (binding.checkBoxFisica.isChecked) {
                materias.add(Materia.fisica)
            }

            if (binding.checkBoxQuimica.isChecked) {
                materias.add(Materia.quimica)
            }

            app.meu_app.usuario.materias = materias

            proxima_view()

        }

    }


    fun proxima_view() {
        startActivity(Intent(this, principal_activity::class.java))
        finish()
    }

}