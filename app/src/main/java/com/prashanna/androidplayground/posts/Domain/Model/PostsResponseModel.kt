package com.prashanna.androidplayground.posts.Domain.Model

data class PostsResponseModel(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
