package com.example.edu.visualizacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edu.databinding.ActivityPrincipalBinding

class principal_activity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}