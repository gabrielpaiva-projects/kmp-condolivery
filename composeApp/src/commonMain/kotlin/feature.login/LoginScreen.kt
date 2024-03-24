package feature.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import condolivery.composeapp.generated.resources.Res
import condolivery.composeapp.generated.resources.app_name
import condolivery.composeapp.generated.resources.slogan_message
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LoginScreen() {

    Column {
        Text(
            stringResource(Res.string.app_name),
            fontSize = 16.sp,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 48.dp)
        )
        Text(
            stringResource(Res.string.slogan_message),
            fontSize = 48.sp,
            lineHeight = 45.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 24.dp)
        )

        LoginForm()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Não possuí uma conta?",
                color = Color.Black,
                modifier = Modifier.clickable {

                }
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LoginForm() {
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    Column {
        TextField(
            value = emailState.value,
            onValueChange = {
                emailState.value = it
            },
            label = { Text(text = "E-mail") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent
            ),
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp, top = 48.dp)
        )

        TextField(
            value = passwordState.value,
            onValueChange = {
                passwordState.value = it
            },
            label = { Text(text = "Senha") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent
            ),
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp, top = 24.dp)
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 48.dp)
                    .height(70.dp),
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Login",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(16.dp)
                        .height(60.dp),

                    )
            }
        }
    }

}