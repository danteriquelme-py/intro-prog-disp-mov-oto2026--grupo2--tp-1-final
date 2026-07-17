package com.recetasapp.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.recetasapp.model.Receta

class RecetaViewModel : ViewModel() {

    private val _recetas = mutableStateListOf<Receta>()

    val recetas: List<Receta>
        get() = _recetas

    fun agregarReceta(
        nombre: String,
        tiempo: String,
        dificultad: String,
        ingredientes: String,
        calorias: String
    ) {

        _recetas.add(
            Receta(
                nombre = nombre,
                tiempoPreparacion = tiempo,
                dificultad = dificultad,
                ingredientes = ingredientes,
                calorias = calorias
            )
        )
    }

    fun eliminarReceta(receta: Receta) {
        _recetas.remove(receta)
    }
}
