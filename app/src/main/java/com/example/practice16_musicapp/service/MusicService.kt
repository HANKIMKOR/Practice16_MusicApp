package com.example.practice16_musicapp.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/e95a28f4-e7a7-4463-8fc0-7d2e1062ad43")
    fun listMusics(): Call<MusicDto>
}