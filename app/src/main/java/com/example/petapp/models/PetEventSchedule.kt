package com.example.dogapp.models

import java.util.Date

data class PetEventSchedule(
    var type: PetEventTypes,
    var periodInDays: Int,
    var lastEvent: Date

)