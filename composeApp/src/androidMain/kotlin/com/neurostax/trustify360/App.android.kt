package com.neurostax.trustify360

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.neurostax.trustify360.core.manager.navigation.AppNavHost
import com.neurostax.trustify360.core.manager.navigation.HomeScreen
import com.neurostax.trustify360.presentation.common.DataCollectionScreen
import com.neurostax.trustify360.presentation.common.LoginScreen
import com.neurostax.trustify360.presentation.common.PrivacyPolicyScreen
import com.neurostax.trustify360.presentation.common.SplashScreen
import com.neurostax.trustify360.presentation.common.TermsAndConditionsScreen
import com.neurostax.trustify360.presentation.common.TrustifyOnboardingScreen
import com.neurostax.trustify360.presentation.common.authentication.LoginSignupPage

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            PrivacyPolicyScreen()
//            TermsAndConditionsScreen()
//            DataCollectionScreen()
//            SplashScreen()
//            TrustifyOnboardingScreen()
//            LoginScreen(
//                onLoginClicked = { email, password -> },
//                onSignupClicked = { email, password -> }
//            )
//            LoginSignupPage()
            AppNavHost()
//            HomeScreen.Content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Prev() {
    LoginSignupPage()
}