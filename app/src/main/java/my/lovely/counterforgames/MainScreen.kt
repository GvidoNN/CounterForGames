package my.lovely.counterforgames

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun MainScreen() {
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
                value = "",
                onValueChange = {

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

            }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )

            }

        }
    }
}