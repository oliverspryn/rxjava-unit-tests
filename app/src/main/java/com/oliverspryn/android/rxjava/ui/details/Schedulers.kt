package com.oliverspryn.android.rxjava.ui.details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.oliverspryn.android.rxjava.model.SchedulersUiState
import com.oliverspryn.android.rxjava.model.SchedulersViewModel

@Composable
fun Schedulers(
    schedulersViewModel: SchedulersViewModel
) {
    val uiState by schedulersViewModel.uiState.collectAsState()

    Schedulers(
        schedulersUiState = uiState
    )
}

@Composable
private fun Schedulers(
    schedulersUiState: SchedulersUiState
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = schedulersUiState.name)
    }
}
