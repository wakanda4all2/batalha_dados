package com.example.edu.visualizacao

import android.R.attr.data
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.edu.R
import com.example.edu.databinding.ActivityPrincipalBinding
import com.example.edu.objetos.app
import com.google.android.material.bottomnavigation.BottomNavigationView


class principal_activity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var agendamento: Boolean = false

        binding.cvBusca.visibility = View.GONE
        binding.cvAgendamento.visibility = View.GONE


        binding.btBottomBusca.setOnClickListener {
            binding.semDados.visibility = View.GONE
            binding.cvBusca.visibility = View.VISIBLE
            binding.cvAgendamento.visibility = View.GONE
        }

        binding.btBottomAgendamento.setOnClickListener {

            binding.cvBusca.visibility = View.GONE

            if (agendamento) {
                binding.semDados.visibility = View.GONE
                binding.cvAgendamento.visibility = View.VISIBLE
            } else {
                binding.semDados.visibility = View.VISIBLE
                binding.cvAgendamento.visibility = View.GONE
            }

        }

        binding.btAgendamento.setOnClickListener {
            agendamento = true
            Toast.makeText(
                applicationContext,
                "Agendamento realizado com sucesso",
                Toast.LENGTH_SHORT
            ).show()
            binding.btBottomAgendamento.callOnClick()
        }

    }




}