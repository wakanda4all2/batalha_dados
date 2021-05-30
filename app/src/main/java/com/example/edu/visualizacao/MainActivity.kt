package com.example.edu.visualizacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edu.R
import com.example.edu.dados.data_mockup
import com.example.edu.dados.geolalization_mockup
import com.example.edu.databinding.ActivityMainBinding
import com.example.edu.objetos.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btStartAluno.setOnClickListener {
            app.meu_app.usuario =
                Usuario(
                    geolalization_mockup.get_geo_lat(),
                    geolalization_mockup.get_geo_long(),
                    binding.etStartNome.text.toString(),
                    usuario_tipo.aluno
                )

            startActivity(Intent(this, Aluno_materias::class.java))
        }


        binding.btStartEdu.setOnClickListener {

            app.meu_app.usuario =
                Usuario(
                    geolalization_mockup.get_geo_lat(),
                    geolalization_mockup.get_geo_long(),
                    binding.etStartNome.text.toString(),
                    usuario_tipo.edu
                )

            startActivity(Intent(this, edu_materias::class.java))
        }



    }





}