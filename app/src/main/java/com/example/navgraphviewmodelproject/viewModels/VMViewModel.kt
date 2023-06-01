package com.example.navgraphviewmodelproject.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VMViewModel: ViewModel() {

    val sampleText = MutableLiveData("")


    override fun onCleared() {
        super.onCleared()
        Log.d("demo", "VMViewModel onCleared")
    }
}