package com.neurostax.trustify360.previews.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.neurostax.trustify360.presentation.common.SplashScreen

@Preview(showBackground = true)
@Composable
fun MobilePrev(){
    SplashScreen()
}

@Preview(showBackground = true, widthDp = 800, heightDp = 500)
@Composable
fun TabletPrev(){
    SplashScreen()
}