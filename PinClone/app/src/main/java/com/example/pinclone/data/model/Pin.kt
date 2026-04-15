package com.example.pinclone.data.model

data class Pin(
    val id: String,
    val imageUrl: String,
    val title: String,
    val description: String,
    val uploaderName: String,
    val uploaderProfileUrl: String
)