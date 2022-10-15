package com.example.practicekt5

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel(){

    private val TAG : String = "KOTLINFUN"

    init {
        viewModelScope.launch {
            while (true){
                delay(500)
                Log.d(TAG, "Hello from CheezyCode")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "View model destroyed")

    }
}