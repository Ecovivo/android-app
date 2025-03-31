package com.example.ecovivo.features.intro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IntroViewModel: ViewModel() {
    private val _name = MutableLiveData<String>()
    private val _hasProject = MutableLiveData<Boolean>()
    val name: LiveData<String> = _name
    val hasProject: LiveData<Boolean> = _hasProject

    fun onNameChange(name: String) {
        _name.value = name
        if(_name.value!!.isNotEmpty()) {
            _hasProject.value = true
        }
    }
}