package com.recetasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.recetasapp.ui.screen.RecetaScreen
import com.recetasapp.ui.theme.RecetasTheme
import com.recetasapp.viewmodel.RecetaViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            RecetasTheme {

                val recetaViewModel: RecetaViewModel =
                    viewModel()

                RecetaScreen(
                    viewModel = recetaViewModel
                )
            }
        }
    }
}
