package com.recetasapp.ui.screen

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.unit.dp
import com.recetasapp.ui.components.RecetaItem
import com.recetasapp.viewmodel.RecetaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecetaScreen(
    viewModel: RecetaViewModel
) {

    val context = LocalContext.current

    var nombre by remember { mutableStateOf("") }
    var tiempo by remember { mutableStateOf("") }
    var ingredientes by remember { mutableStateOf("") }
    var calorias by remember { mutableStateOf("") }

    var dificultad by remember {
        mutableStateOf("Fácil")
    }

    var expanded by remember {
        mutableStateOf(false)
    }

    val dificultades = listOf(
        "Fácil",
        "Media",
        "Difícil"
    )

    Scaffold(

        topBar = {

            TopAppBar(
                title = {
                    Text("Registro de Recetas")
                }
            )
        }

    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {

            OutlinedTextField(
                value = nombre,
                onValueChange = {
                    nombre = it
                },
                label = {
                    Text("Nombre del plato")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = tiempo,
                onValueChange = {
                    tiempo = it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ),
                label = {
                    Text("Tiempo (minutos)")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = {
                    expanded = !expanded
                }
            ) {

                OutlinedTextField(
                    value = dificultad,
                    onValueChange = {},
                    readOnly = true,
                    label = {
                        Text("Dificultad")
                    },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = {
                        expanded = false
                    }
                ) {

                    dificultades.forEach { opcion ->

                        DropdownMenuItem(
                            text = {
                                Text(opcion)
                            },
                            onClick = {
                                dificultad = opcion
                                expanded = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = ingredientes,
                onValueChange = {
                    ingredientes = it
                },
                label = {
                    Text("Ingredientes")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = calorias,
                onValueChange = {
                    calorias = it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ),
                label = {
                    Text("Calorías")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {

                    if (
                        nombre.isBlank() ||
                        tiempo.isBlank() ||
                        ingredientes.isBlank() ||
                        calorias.isBlank()
                    ) {

                        Toast.makeText(
                            context,
                            "Complete todos los campos",
                            Toast.LENGTH_SHORT
                        ).show()

                    } else {

                        viewModel.agregarReceta(
                            nombre,
                            tiempo,
                            dificultad,
                            ingredientes,
                            calorias
                        )

                        Toast.makeText(
                            context,
                            "Receta registrada",
                            Toast.LENGTH_SHORT
                        ).show()

                        nombre = ""
                        tiempo = ""
                        ingredientes = ""
                        calorias = ""
                    }
                }
            ) {
                Text("Registrar Receta")
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {

                items(viewModel.recetas) { receta ->

                    RecetaItem(
                        receta = receta,
                        onDelete = {
                            viewModel.eliminarReceta(receta)
                        }
                    )
                }
            }
        }
    }
}



