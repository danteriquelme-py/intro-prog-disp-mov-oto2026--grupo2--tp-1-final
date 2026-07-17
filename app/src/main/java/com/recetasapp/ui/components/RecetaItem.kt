package com.recetasapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.recetasapp.model.Receta

@Composable
fun RecetaItem(
    receta: Receta,
    onDelete: () -> Unit
) {

    var mostrarDialogo by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = receta.nombre,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                items(
                    listOf(
                        "⏱ ${receta.tiempoPreparacion} min",
                        "📊 ${receta.dificultad}",
                        "🥗 ${receta.ingredientes}",
                        "🔥 ${receta.calorias} kcal"
                    )
                ) { dato ->

                    AssistChip(
                        onClick = {},
                        label = {
                            Text(dato)
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    mostrarDialogo = true
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                )
            ) {
                Text("Eliminar")
            }
        }
    }

    if (mostrarDialogo) {

        AlertDialog(
            onDismissRequest = {
                mostrarDialogo = false
            },
            title = {
                Text("Eliminar receta")
            },
            text = {
                Text("¿Deseas eliminar esta receta?")
            },
            confirmButton = {
                Button(
                    onClick = {
                        onDelete()
                        mostrarDialogo = false
                    }
                ) {
                    Text("Sí")
                }
            },
            dismissButton = {
                OutlinedButton(
                    onClick = {
                        mostrarDialogo = false
                    }
                ) {
                    Text("No")
                }
            }
        )
    }
}
