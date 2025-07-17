import androidx.compose.ui.window.ComposeUIViewController
import com.neurostax.trustify360.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
