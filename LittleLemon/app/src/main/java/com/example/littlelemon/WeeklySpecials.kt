package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

data class SpecialItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val imageRes: Int
)

val specialsList = listOf(
    SpecialItem(1,"Greek Salad", "Fresh vegetables with feta cheese", "$12", R.drawable.salad),
    SpecialItem(2,"Lemon Dessert", "Sweet lemon treat", "$8", R.drawable.dessert),
    SpecialItem(3,"Grilled Chicken", "Marinated chicken with herbs", "$15", R.drawable.chicken),
)


data class Dish(
    val name: String,
    val description: String,
    val price: String,
    val imageRes: Int
)



@Composable
fun SpecialItemCard(item: SpecialItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        onClick = {onClick}
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.name,
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(item.name, fontWeight = FontWeight.Bold)
                Text(item.description)
                Text(item.price, color = Color.Red, fontWeight = FontWeight.Bold)
            }
        }
    }
}
@Composable
fun SpecialItemCards(navController: NavHostController) {
    LazyColumn {
        items(specialsList) { item ->
            SpecialItemCard(item, onClick = {navController.navigate("details")})
        }
    }
}