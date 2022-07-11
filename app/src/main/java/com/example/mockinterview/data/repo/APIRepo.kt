package com.example.mockinterview.data.repo

import com.example.mockinterview.data.api.RetroAPI
import com.example.mockinterview.data.model.Email
import retrofit2.Response

class APIRepo(val retro: RetroAPI) {
    fun getEmail(): Response<List<Email>> {
        return retro.getAPI()
    }
}