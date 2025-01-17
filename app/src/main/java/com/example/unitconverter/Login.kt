package com.example.unitconverter

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 60.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(R.drawable.download),
            contentDescription = "Login",
            modifier = Modifier.size(300.dp)

        )
        Spacer(Modifier.height(20.dp))
        Text(text = "Welcome", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(20.dp))
        Text(text = "LogIn to your account", fontSize = 30.sp)
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, Modifier.fillMaxWidth(), label = {
            Text(text = "Email Address")
        })
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, Modifier.fillMaxWidth(), label = {
            Text(text = "Password")
        })
        Spacer(Modifier.height(16.dp))
        Button(onClick = {}, Modifier.fillMaxWidth()) {
            Text(text = "Login")
        }

        Spacer(Modifier.height(52.dp))
        TextButton(onClick = {}) {
            Text(text = "forgot password")
        }
        Text(text = "or sign in with")
        Spacer(Modifier.height(16.dp))
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            Icon(imageVector = Icons.Rounded.AccountBox , contentDescription = null, Modifier.clickable {  })
            Spacer(Modifier.width(20.dp))
            Icon(imageVector = Icons.Rounded.MailOutline, contentDescription = null, Modifier.clickable {  })
            Spacer(Modifier.width(20.dp))
            Icon(imageVector = Icons.Rounded.Edit, contentDescription = null, Modifier.clickable {  })
        }
    }
}