package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Storage:ViewModel() {

        val currentName = MutableLiveData<String>()

        val currentPhone = MutableLiveData<String>()

        val currentEmail = MutableLiveData<String>()

        val currentDescription = MutableLiveData<String>()

        fun setName(newData: String) {
            currentName.value = newData
        }

        fun setPhone(newData: String) {
            currentPhone.value = newData
        }

        fun setEmail(newData: String) {
            currentEmail.value = newData
        }

        fun setDescip(newData: String) {
            currentDescription.value = newData
        }
    fun getPhone(): String? {
        return currentPhone.value
    }
    }
