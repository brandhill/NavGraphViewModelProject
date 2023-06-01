package com.example.navgraphviewmodelproject.navGraphViewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NavGraphViewModel: ViewModel() {

    val sampleText = MutableLiveData("")


    override fun onCleared() {
        super.onCleared()
        Log.d("demo", "NavGraphViewModel onCleared")
    }
}