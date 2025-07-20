import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.neurostax.trustify360.App
import com.neurostax.trustify360.core.manager.navigation.AppNavHost
import com.neurostax.trustify360.presentation.common.LoginScreen
import com.neurostax.trustify360.presentation.common.PrivacyPolicyScreen
import java.awt.Dimension

fun main() = application {
    Window(
        title = "Trustify360",
        state = rememberWindowState(width = 800.dp, height = 600.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(350, 600)
//        PrivacyPolicyScreen()
        //AppNavHost()
        LoginScreen(

            onLoginClicked = {

            } as (String, String) -> Unit,
            onSignupClicked = {

            }as (String, String) -> Unit,
            Modifier
        )

    }
}

