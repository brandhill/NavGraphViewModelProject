package com.example.navgraphviewmodelproject.activityViewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel: ViewModel() {

    val sampleText = MutableLiveData("")



    override fun onCleared() {
        super.onCleared()
        Log.d("demo", "ActivityViewModel onCleared")
    }
}