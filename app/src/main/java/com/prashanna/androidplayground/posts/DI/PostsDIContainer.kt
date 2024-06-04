package com.prashanna.androidplayground.posts.DI

import com.prashanna.androidplayground.posts.Data.implementation.PostsRepositoryImpl
import com.prashanna.androidplayground.posts.Data.remote.PostsAPIService
import com.prashanna.androidplayground.posts.Domain.UseCase.GetPostsUseCase
import com.prashanna.androidplayground.posts.Presentation.ViewModel.PostsViewModel
import com.prashanna.androidplayground.utils.Constants.baseURL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostsDIContainer {
    private val postsAPIService = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PostsAPIService::class.java)

    private  val postsRepository = PostsRepositoryImpl(postsAPIService)
    val getPostsUseCase = GetPostsUseCase(postsRepository)
    val postsViewModel = PostsViewModel(getPostsUseCase)

}
