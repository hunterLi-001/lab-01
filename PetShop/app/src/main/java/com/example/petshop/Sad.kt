package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun getDate(): String{
        return date
    }
}
