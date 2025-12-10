package com.example.littlelemon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.Purple80


@Composable
fun TopAppBar()
{
    Row(modifier = Modifier.fillMaxWidth().background(Color.White)
        .height(80.dp).padding(top = 24.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        IconButton(onClick = {}) {
            Icon(Icons.Default.Menu, contentDescription = "Menue")
        }
        Spacer(Modifier.weight(1f))
        Text("Little Lemon", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.weight(1f))
        IconButton(onClick = {}) {
            Icon(Icons.Default.ShoppingCart, contentDescription = "")
        }

    }
}

