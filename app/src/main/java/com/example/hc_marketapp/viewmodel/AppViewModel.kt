package com.example.hc_marketapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    var title = mutableStateOf("Home")
}