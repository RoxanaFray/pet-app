package com.example.dogapp.models

import java.util.Date

data class PetEvent(
    var type: PetEventTypes,
    var title: String,
    var date: Date,
    var comment: String,
)
