package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R.drawable
import com.example.littlelemon.ui.theme.Yellow


@Composable
fun HeroSection()
{
    Column(modifier = Modifier
        .fillMaxWidth()
       // .padding(16.dp)
        .height(280.dp)
        .background(Yellow)
        .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(R.string.AppName),
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(R.string.sub_title),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

            ) {
            Column (modifier = Modifier.weight(1f)) {
                Text(text = stringResource(id = R.string.Des))
                Spacer(modifier = Modifier.height(24.dp))

                Button(onClick = {}) { Text(stringResource(id = R.string.btnOrder))}

            }
            Image(
                painter = painterResource(R.drawable.ffoood),
                contentDescription = "", modifier = Modifier.size(120.dp)
            )

        }

    }
}
