package com.prashanna.androidplayground.posts.Domain.Repository

import com.prashanna.androidplayground.posts.Domain.Model.PostsResponseModel

interface PostsRepository {
    suspend fun getPosts(): List<PostsResponseModel>
}