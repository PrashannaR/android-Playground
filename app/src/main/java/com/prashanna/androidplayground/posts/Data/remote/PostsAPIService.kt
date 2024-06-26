package com.prashanna.androidplayground.posts.Data.remote

import com.prashanna.androidplayground.posts.Domain.Model.PostsResponseModel
import com.prashanna.androidplayground.utils.URLPaths.posts
import retrofit2.http.GET

interface PostsAPIService {
    @GET(posts)
    suspend fun getPosts() : List<PostsResponseModel>
}