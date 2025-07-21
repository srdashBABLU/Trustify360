package com.neurostax.trustify360.presentation.common

import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Handshake
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Rocket
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

// Brand Colors
val TrustifyPrimary = Color(0xFF1A365D)
val TrustifySecondary = Color(0xFF2B77CB)
val TrustifyAccent = Color(0xFF00C9A7)
val TrustifyGold = Color(0xFFFFB800)
val SoftGray = Color(0xFFF7FAFC)
val DarkText = Color(0xFF2D3748)
val LightText = Color(0xFF718096)

data class OnboardingPage(
    val title: String,
    val description: String,
    val icon: ImageVector,
    val gradientColors: List<Color>
)

val onboardingPages = listOf(
    OnboardingPage(
        title = "Welcome to Trustify 360",
        description = "The all-in-one CRM solution that transforms how you manage customer relationships and grow your business.",
        icon = Icons.Default.Handshake,
        gradientColors = listOf(TrustifyPrimary, TrustifySecondary)
    ),
    OnboardingPage(
        title = "Manage All Your Customers",
        description = "Centralize customer data, track interactions, and build stronger relationships with powerful contact management tools.",
        icon = Icons.Default.People,
        gradientColors = listOf(TrustifySecondary, TrustifyAccent)
    ),
    OnboardingPage(
        title = "Smart Sales Pipeline",
        description = "Track deals, forecast revenue, and never miss an opportunity with our intelligent sales automation features.",
        icon = Icons.AutoMirrored.Filled.TrendingUp,
        gradientColors = listOf(TrustifyAccent, TrustifyGold)
    ),
    OnboardingPage(
        title = "Powerful Analytics",
        description = "Make data-driven decisions with comprehensive reports and real-time insights into your business performance.",
        icon = Icons.Default.Analytics,
        gradientColors = listOf(TrustifyGold, Color(0xFFFF6B35))
    ),
    OnboardingPage(
        title = "Ready to Transform?",
        description = "Join thousands of businesses already using Trustify 360 to streamline their operations and boost growth.",
        icon = Icons.Default.Rocket,
        gradientColors = listOf(Color(0xFFFF6B35), TrustifyPrimary)
    )
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TrustifyOnboardingScreen(
    onGetStarted: () -> Unit = {},
    onSkip: () -> Unit = {}
) {
    val pagerState = rememberPagerState(pageCount = { onboardingPages.size })
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SoftGray)
    ) {
        // Skip Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = onSkip) {
                Text(
                    text = "Skip",
                    color = LightText,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        // Pager Content
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            OnboardingPageContent(
                page = onboardingPages[page],
                currentPage = page
            )
        }

        // Bottom Section
        Column(
            modifier = Modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Page Indicators
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(onboardingPages.size) { index ->
                    PageIndicator(
                        isActive = index == pagerState.currentPage,
                        color = if (index == pagerState.currentPage)
                            TrustifySecondary else LightText.copy(alpha = 0.3f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Navigation Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = if (pagerState.currentPage < onboardingPages.size - 1) {
                    Arrangement.SpaceBetween
                } else {
                    Arrangement.Center
                }
            ) {
                // Previous Button (if not first page)
                if (pagerState.currentPage > 0) {
                    OutlinedButton(
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage - 1)
                            }
                        },
                        modifier = Modifier
                            .height(56.dp)
                            .then(
                                if (pagerState.currentPage == onboardingPages.size - 1)
                                    Modifier else Modifier.weight(1f)
                            ),
                        border = BorderStroke(1.dp, TrustifySecondary),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = "Previous",
                            color = TrustifySecondary,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    if (pagerState.currentPage < onboardingPages.size - 1) {
                        Spacer(modifier = Modifier.width(16.dp))
                    }
                }

                // Next/Get Started Button
                Button(
                    onClick = {
                        if (pagerState.currentPage < onboardingPages.size - 1) {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
                            }
                        } else {
                            onGetStarted()
                        }
                    },
                    modifier = Modifier
                        .height(56.dp)
                        .then(
                            if (pagerState.currentPage == 0 || pagerState.currentPage == onboardingPages.size - 1)
                                Modifier.fillMaxWidth() else Modifier.weight(1f)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = TrustifySecondary
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = if (pagerState.currentPage == onboardingPages.size - 1)
                            "Get Started" else "Next",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun OnboardingPageContent(
    page: OnboardingPage,
    currentPage: Int
) {
    var isVisible by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isVisible) 1f else 0.8f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "scale"
    )

    val alpha by animateFloatAsState(
        targetValue = if (isVisible) 1f else 0f,
        animationSpec = tween(durationMillis = 600),
        label = "alpha"
    )

    LaunchedEffect(currentPage) {
        isVisible = false
        kotlinx.coroutines.delay(150)
        isVisible = true
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp)
            .alpha(alpha)
            .scale(scale),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Illustration Container
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .background(
                    brush = Brush.radialGradient(
                        colors = page.gradientColors + page.gradientColors.map { it.copy(alpha = 0.3f) }
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            // Animated background circles
            repeat(3) { index ->
                val animatedAlpha by rememberInfiniteTransition(label = "bg_circle").animateFloat(
                    initialValue = 0.1f,
                    targetValue = 0.3f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(2000 + index * 500, easing = FastOutSlowInEasing),
                        repeatMode = RepeatMode.Reverse
                    ),
                    label = "circle_alpha_$index"
                )

                Box(
                    modifier = Modifier
                        .size((160 + index * 20).dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = animatedAlpha))
                )
            }

            // Main Icon
            Icon(
                imageVector = page.icon,
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.height(48.dp))

        // Title
        Text(
            text = page.title,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = DarkText,
            textAlign = TextAlign.Center,
            lineHeight = 36.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Description
        Text(
            text = page.description,
            fontSize = 16.sp,
            color = LightText,
            textAlign = TextAlign.Center,
            lineHeight = 24.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}

@Composable
fun PageIndicator(
    isActive: Boolean,
    color: Color
) {
    val width by animateIntAsState(
        targetValue = if (isActive) 32 else 8,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy),
        label = "indicator_width"
    )

    Box(
        modifier = Modifier
            .size(width = width.dp, height = 8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(color)
    )
}