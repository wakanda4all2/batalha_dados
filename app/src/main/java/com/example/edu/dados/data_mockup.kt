package com.example.edu.dados

import com.example.edu.objetos.Usuario
import com.example.edu.objetos.usuario_tipo

object data_mockup {

    init {
        inicializador()
    }

    var usuarios: MutableList<Usuario> = ArrayList()



    fun inicializador() {
        usuarios.add(Usuario(1, 2, "José", usuario_tipo.aluno))
        usuarios.add(Usuario(0, 3, "José", usuario_tipo.edu))
    }

    fun adicina_usuario(input: Usuario) {
        usuarios.add(input)
    }



}