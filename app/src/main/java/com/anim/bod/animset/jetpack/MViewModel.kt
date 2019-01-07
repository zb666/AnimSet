package com.anim.bod.animset.jetpack

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MViewModel : ViewModel() {

    var data: MutableLiveData<String> = MutableLiveData()

    init {
        data.apply {
            getUserData().observeForever {
            }
        }
    }

    fun getUserData(): LiveData<String> {
        return data
    }

    fun doAction(action: String) {
        data.value = action
    }


}