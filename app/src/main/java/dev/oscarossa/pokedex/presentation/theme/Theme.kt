package dev.oscarossa.pokedex.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val darkColorScheme =
    darkColorScheme(
        primary = Color.Yellow,
        background = Color(0xFF101010),
        onBackground = Color.White,
        surface = Color(0xFF303030),
        onSurface = Color.White,
    )

private val lightColorScheme =
    lightColorScheme(
        primary = Color.Blue,
        background = LightBlue,
        onBackground = Color.Black,
        surface = Color.White,
        onSurface = Color.Black,
    )

@Composable
fun PokedexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors =
        if (darkTheme) {
            darkColorScheme
        } else {
            lightColorScheme
        }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}
