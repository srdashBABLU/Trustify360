package com.neurostax.trustify360.core.manager.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.delay

@Composable
fun AppNavHost() {
    Navigator(HomeScreen) { navigator ->
        CurrentScreen()
    }
}

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val isDark = isSystemInDarkTheme()

        MaterialTheme(
            colorScheme = if (isDark) darkColorScheme() else lightColorScheme()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize().background(MaterialTheme.colorScheme.background)
                    .safeContentPadding(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Welcome to Home!", color = MaterialTheme.colorScheme.onPrimary)
                Button(onClick = { navigator?.push(ProfileScreen("John")) }) {
                    Text("Go to Profile")
                }
            }
        }
    }
}

data class ProfileScreen(val name: String) : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow // ✅ safer version
        var value by remember { mutableStateOf("Admin") } // ✅ use `by remember {}`

        LaunchedEffect(Unit) {
            delay(500)
            value = "Soumya"
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Profile of $name, Role: $value")
            Button(onClick = { navigator.pop() }) {
                Text("Back")
            }
        }
    }
}


