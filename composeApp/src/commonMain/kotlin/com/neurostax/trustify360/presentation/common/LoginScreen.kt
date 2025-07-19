package com.neurostax.trustify360.presentation.common

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically

@Composable
fun LoginScreen(
    onLoginClicked: (String, String) -> Unit,
    onSignupClicked: (String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    // State for input fields and screen mode
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    var isLoginMode by remember { mutableStateOf(true) }

    // Premium gradient background with luxurious colors
    val gradient = Brush.linearGradient(
        colors = listOf(Color(0xFF1A237E), Color(0xFF0288D1), Color(0xFF4FC3F7)),
        start = androidx.compose.ui.geometry.Offset(0f, 0f),
        end = androidx.compose.ui.geometry.Offset(1000f, 1000f)
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(gradient),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight(0.55f)
                .clip(RoundedCornerShape(24.dp))
                .shadow(12.dp, RoundedCornerShape(24.dp)),
            colors = CardColors(
                containerColor = Color.White.copy(alpha = 0.98f),
                contentColor = Color.Black,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.Black
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Animated Title
                AnimatedVisibility(
                    visible = isLoginMode,
                    enter = slideInVertically() + fadeIn(animationSpec = tween(500)),
                    exit = slideOutVertically() + fadeOut(animationSpec = tween(500))
                ) {
                    Text(
                        text = "Welcome Back",
                        style = MaterialTheme.typography.headlineLarge,
                        fontSize = 32.sp,
                        color = Color(0xFF1A237E),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }
                AnimatedVisibility(
                    visible = !isLoginMode,
                    enter = slideInVertically() + fadeIn(animationSpec = tween(500)),
                    exit = slideOutVertically() + fadeOut(animationSpec = tween(500))
                ) {
                    Text(
                        text = "Join Us",
                        style = MaterialTheme.typography.headlineLarge,
                        fontSize = 32.sp,
                        color = Color(0xFF1A237E),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }

                // Email Field
                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                        isError = false
                    },
                    label = { Text("Email") },
                    isError = isError && email.isEmpty(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF0288D1),
                        unfocusedBorderColor = Color(0xFF4FC3F7),
                        focusedLabelColor = Color(0xFF0288D1),
                        cursorColor = Color(0xFF0288D1)
                    )
                )

                // Password Field
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                        isError = false
                    },
                    label = { Text("Password") },
                    isError = isError && password.isEmpty(),
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 12.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF0288D1),
                        unfocusedBorderColor = Color(0xFF4FC3F7),
                        focusedLabelColor = Color(0xFF0288D1),
                        cursorColor = Color(0xFF0288D1)
                    )
                )

                // Error Message
                AnimatedVisibility(visible = isError) {
                    Text(
                        text = "Please fill in all fields",
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }

                // Action Button
                Button(
                    onClick = {
                        if (email.isEmpty() || password.isEmpty()) {
                            isError = true
                        } else {
                            isError = false
                            if (isLoginMode) {
                                onLoginClicked(email, password)
                            } else {
                                onSignupClicked(email, password)
                            }
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(horizontal = 8.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0288D1),
                        contentColor = Color.White
                    ),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                ) {
                    Text(
                        text = if (isLoginMode) "Login" else "Sign Up",
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.labelLarge
                    )
                }

                // Toggle between Login and Signup
                Row(
                    modifier = Modifier.padding(top = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(
                        onClick = { isLoginMode = true },
                        modifier = Modifier.padding(end = 8.dp)
                    ) {
                        Text(
                            text = "Login",
                            color = if (isLoginMode) Color(0xFF1A237E) else Color.Gray,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 16.sp
                        )
                    }
                    TextButton(
                        onClick = { isLoginMode = false },
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        Text(
                            text = "Sign Up",
                            color = if (!isLoginMode) Color(0xFF1A237E) else Color.Gray,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 16.sp
                        )
                    }
                }

                // Forgot Password (only in login mode)
                AnimatedVisibility(visible = isLoginMode) {
                    TextButton(
                        onClick = { /* Handle forgot password */ },
                        modifier = Modifier.padding(top = 8.dp)
                    ) {
                        Text(
                            text = "Forgot Password?",
                            color = Color(0xFF0288D1),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun LoginScreenPreview() {
    MaterialTheme {
        LoginScreen(
            onLoginClicked = { email, password -> },
            onSignupClicked = { email, password -> }
        )
    }
}