package com.prashanna.androidplayground.posts.Data.implementation

import com.prashanna.androidplayground.posts.Data.remote.PostsAPIService
import com.prashanna.androidplayground.posts.Domain.Model.PostsResponseModel
import com.prashanna.androidplayground.posts.Domain.Repository.PostsRepository

class PostsRepositoryImpl(
    private  val apiService: PostsAPIService
): PostsRepository {
    override suspend fun getPosts(): List<PostsResponseModel> {
        return apiService.getPosts()
    }


}
