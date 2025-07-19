package com.neurostax.trustify360

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.neurostax.trustify360.presentation.common.DataCollectionScreen
import com.neurostax.trustify360.presentation.common.PrivacyPolicyScreen
import com.neurostax.trustify360.presentation.common.SplashScreen
import com.neurostax.trustify360.presentation.common.TermsAndConditionsScreen
import com.neurostax.trustify360.presentation.common.TrustifyOnboardingScreen

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            PrivacyPolicyScreen()
//            TermsAndConditionsScreen()
//            DataCollectionScreen()
//            SplashScreen()
            TrustifyOnboardingScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Prev() {
    App()
}