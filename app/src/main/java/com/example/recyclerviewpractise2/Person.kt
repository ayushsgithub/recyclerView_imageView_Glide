package com.example.recyclerviewpractise2

data class Person(val name: String, val age: Int){
    val imageUrl = "https://picsum.photos/150?random=$age"
    val landscapeImageUrl = "https://picsum.photos/300/150?random=$age"
}