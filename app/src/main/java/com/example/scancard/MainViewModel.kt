package com.example.scancard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.scancard.MainActivity.Companion.DESIRED_HEIGHT_CROP_PERCENT
import com.example.scancard.MainActivity.Companion.DESIRED_WIDTH_CROP_PERCENT

class MainViewModel : ViewModel() {
    val imageCropPercentages = MutableLiveData<Pair<Int, Int>>()
        .apply { value = Pair(DESIRED_HEIGHT_CROP_PERCENT, DESIRED_WIDTH_CROP_PERCENT) }
}