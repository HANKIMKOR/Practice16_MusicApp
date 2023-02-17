package com.example.practice16_musicapp

import com.example.practice16_musicapp.service.MusicEntity
import com.example.practice16_musicapp.service.MusicModel

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )