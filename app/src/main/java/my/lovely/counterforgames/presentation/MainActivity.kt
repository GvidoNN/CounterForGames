package my.lovely.counterforgames.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.counterforgames.presentation.mainScreen.MainScreen
import my.lovely.counterforgames.presentation.theme.CounterForGamesTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterForGamesTheme {
                MainScreen()
            }
        }
    }
}
