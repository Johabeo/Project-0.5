package com.example.mockinterview.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.mockinterview.data.model.Email
import com.example.mockinterview.data.repo.APIRepo

class EmailViewModel(val repo: APIRepo) {
    var emailList = MutableLiveData<List<Email>>()
    fun getEmail() {
        val res = repo.getEmail()
        if (res.isSuccessful)
            emailList.postValue(res.body())

    }
}