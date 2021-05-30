package com.example.edu.objetos

import android.app.Application

class app: Application() {

    object meu_app{
        lateinit var usuario: Usuario
    }

}