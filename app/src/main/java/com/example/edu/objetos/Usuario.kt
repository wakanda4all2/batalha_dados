package com.example.edu.objetos

class Usuario(val latitude: Int, val longitude: Int, val nome: String, val user_type: usuario_tipo) {

    var materias: MutableList<Materia> = ArrayList()
}