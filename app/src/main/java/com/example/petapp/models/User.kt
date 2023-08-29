package com.example.dogapp.models

data class User(
    var nickname: String,
    var pets: MutableList<Pet>
)
