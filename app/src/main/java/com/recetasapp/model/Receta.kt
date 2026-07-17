package com.recetasapp.model
data class Receta(
    val id: Long = System.currentTimeMillis(),
    val nombre: String,
    val tiempoPreparacion: String,
    val dificultad: String,
    val ingredientes: String,
    val calorias: String
)
