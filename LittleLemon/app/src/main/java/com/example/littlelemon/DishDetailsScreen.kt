package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun DishDetailsScreen(id: Int, navController: NavHostController)
{
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Image(modifier = Modifier.fillMaxWidth().height(240.dp).clip(RoundedCornerShape(12.dp)), painter = painterResource(specialsList[id].imageRes), contentDescription = "",     contentScale = ContentScale.Crop)
        Text(specialsList[id].name, fontSize = 28.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(16.dp))
        Text(specialsList[id].description, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 24.dp)) {Text("Add To Card ${specialsList[id].price}") }
    }
}