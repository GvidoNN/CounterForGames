package my.lovely.counterforgames.presentation.mainScreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import my.lovely.counterforgames.domain.models.PlayerModel

@Composable
fun MainScreen(
    mainViewModel: MainViewModel = viewModel()
) {
    val players = mainViewModel.players.observeAsState()
    Log.d("MyLog",players.value.toString())
    var text by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = {
                    Text(text = "Name...")
                },
                modifier = Modifier.weight(1f),
                colors = TextFieldDefaults.textFieldColors(
                    Color.White
                )
            )

            IconButton(onClick = {
                mainViewModel.insertPlayer(player = PlayerModel(id = 0, name = text, score = 100))

            }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )

            }

        }
        Spacer(modifier = Modifier.height(5.dp))
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(6){
                my.lovely.counterforgames.presentation.theme.ListItem()
            }

        }
    }
}