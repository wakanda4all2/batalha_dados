package com.example.edu.visualizacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edu.R
import com.example.edu.databinding.ActivityAlunoMateriasBinding
import com.example.edu.databinding.ActivityMainBinding
import com.example.edu.objetos.Materia
import com.example.edu.objetos.app

class Aluno_materias : AppCompatActivity() {

    private lateinit var binding: ActivityAlunoMateriasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlunoMateriasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btPortugues.setOnClickListener {
            app.meu_app.usuario.materias.clear()
            app.meu_app.usuario.materias.add(Materia.portugues)
            proxima_view()
        }

        binding.btMatematica.setOnClickListener {
            app.meu_app.usuario.materias.clear()
            app.meu_app.usuario.materias.add(Materia.matematica)
            proxima_view()
        }

        binding.btFisica.setOnClickListener {
            app.meu_app.usuario.materias.clear()
            app.meu_app.usuario.materias.add(Materia.fisica)
            proxima_view()
        }

        binding.btBiologia.setOnClickListener {
            app.meu_app.usuario.materias.clear()
            app.meu_app.usuario.materias.add(Materia.biologia)
            proxima_view()
        }

        binding.btQuimica.setOnClickListener {
            app.meu_app.usuario.materias.clear()
            app.meu_app.usuario.materias.add(Materia.quimica)
            proxima_view()
        }

    }

    fun proxima_view() {
        startActivity(Intent(this, principal_activity::class.java))
        finish()
    }


}