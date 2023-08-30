package com.example.petapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.dogapp.models.Pet
import com.example.petapp.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.pet = Pet(
            name = "Luanne",
            birthDate = Date(2020, 7, 24),
            bodyWeight = 9.8,
            species = "Dog",
            breed = "French Bulldog",
            allergens = mutableListOf("chicken", "sunflower seeds", "lamb"),
            notes = mutableListOf("loves balls"),
            aggressiveness = 1,
            microchipId ="64309920003095",
            petEvents = mutableListOf()
        )

        val dogImage: ImageView = findViewById(R.id.dog_image)
        dogImage.setImageResource(R.drawable.sticker1)
    }
}