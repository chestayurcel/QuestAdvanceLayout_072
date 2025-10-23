package com.example.myuipertama

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(stringResource(R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(25.dp))
        Card (modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            )
    }
}