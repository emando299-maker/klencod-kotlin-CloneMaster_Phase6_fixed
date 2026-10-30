package com.clonemaster.manager

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val DarkScheme = darkColorScheme(
    primary = Color(0xFF8AB4FF),
    onPrimary = Color(0xFF05285C),
    primaryContainer = Color(0xFF1C3A6E),
    onPrimaryContainer = Color(0xFFD8E5FF),
    secondary = Color(0xFF7FDBCA),
    onSecondary = Color(0xFF00382F),
    secondaryContainer = Color(0xFF1C3A6E),
    onSecondaryContainer = Color(0xFFD8E5FF),
    background = Color(0xFF0A0D13),
    onBackground = Color(0xFFE6E9F0),
    surface = Color(0xFF10141C),
    onSurface = Color(0xFFE6E9F0),
    surfaceVariant = Color(0xFF181E29),
    onSurfaceVariant = Color(0xFFA3ACBF),
    outline = Color(0xFF343C4D),
    outlineVariant = Color(0xFF262D3B),
    error = Color(0xFFFF8A80),
    onError = Color(0xFF4A0A06),
    errorContainer = Color(0xFF4A1C1A),
    onErrorContainer = Color(0xFFFFDAD6)
)

private val AppShapes = Shapes(
    small = RoundedCornerShape(10.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(22.dp)
)

@Composable
fun CloneMasterTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = DarkScheme, shapes = AppShapes, content = content)
}
