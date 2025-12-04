package com.example.calculator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

fun Calculat(FirstNum: Int, SecondNum: Int, Op: String): Int {
    return when (Op) {
        "+" -> FirstNum + SecondNum
        "-" -> FirstNum - SecondNum
        "/" -> if (SecondNum != 0) FirstNum / SecondNum else 0
        else -> 0
    }
}

@Composable
fun CalculatorButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.height(98.dp).size(98.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Text(text = label, fontSize = 32.sp)
    }
}





@Composable
fun VewwNumber() {

    val ViewNumber = remember { mutableStateListOf<Int>() }
    var currentOperation by remember { mutableStateOf<String?>(null) }
    var FirstNumber by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize().padding(bottom = 62.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            ViewNumber.joinToString(""),
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp),
            fontSize = 32.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        // الصف الأول: + 9 8 7
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            CalculatorButton("+", {
                if (ViewNumber.isNotEmpty()) {
                    FirstNumber = ViewNumber.joinToString("").toInt()
                    currentOperation = "+"
                    ViewNumber.clear()
                }
            }, Modifier.weight(1f))

            CalculatorButton("9", { ViewNumber.add(9) }, Modifier.weight(1f))
            CalculatorButton("8", { ViewNumber.add(8) }, Modifier.weight(1f))
            CalculatorButton("7", { ViewNumber.add(7) }, Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        // الصف الثاني: - 6 5 4
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            CalculatorButton("-", {
                if (ViewNumber.isNotEmpty()) {
                    FirstNumber = ViewNumber.joinToString("").toInt()
                    currentOperation = "-"
                    ViewNumber.clear()
                }
            }, Modifier.weight(1f))

            CalculatorButton("6", { ViewNumber.add(6) }, Modifier.weight(1f))
            CalculatorButton("5", { ViewNumber.add(5) }, Modifier.weight(1f))
            CalculatorButton("4", { ViewNumber.add(4) }, Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        // الصف الثالث: / 3 2 1
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            CalculatorButton("/", {
                if (ViewNumber.isNotEmpty()) {
                    FirstNumber = ViewNumber.joinToString("").toInt()
                    currentOperation = "/"
                    ViewNumber.clear()
                }
            }, Modifier.weight(1f))

            CalculatorButton("3", { ViewNumber.add(3) }, Modifier.weight(1f))
            CalculatorButton("2", { ViewNumber.add(2) }, Modifier.weight(1f))
            CalculatorButton("1", { ViewNumber.add(1) }, Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        // الصف الرابع: = 0 (أكبر)
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            CalculatorButton("=", {
                if (ViewNumber.isNotEmpty() && currentOperation != null) {
                    val SecondNum = ViewNumber.joinToString("").toInt()
                    val result = Calculat(FirstNumber, SecondNum, currentOperation!!)
                    ViewNumber.clear()
                    result.toString().forEach { ch -> ViewNumber.add(ch.digitToInt()) }
                }
            }, Modifier.weight(1f))

            CalculatorButton("0", { ViewNumber.add(0) }, Modifier.weight(2f))
        }
    }

    Spacer(modifier = Modifier.padding(bottom = 200.dp))

}
