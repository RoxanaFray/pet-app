package com.example.dogapp.models

import java.util.Date

data class Pet(
    var name: String,
    var birthDate: Date,
    var bodyWeight: Double,
    var species: String,
    var breed: String,
    var allergens: MutableList<String>,
    var notes: MutableList<String>,
    var aggressiveness: Int,
    var microchipId: String,
    var petEvents: MutableList<PetEvent>
)
