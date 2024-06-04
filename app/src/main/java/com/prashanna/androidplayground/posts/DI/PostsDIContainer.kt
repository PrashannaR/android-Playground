package com.prashanna.androidplayground.posts.DI

import com.prashanna.androidplayground.posts.Data.implementation.PostsRepositoryImpl
import com.prashanna.androidplayground.posts.Data.remote.PostsAPIService
import com.prashanna.androidplayground.posts.Domain.UseCase.GetPostsUseCase
import com.prashanna.androidplayground.posts.Presentation.ViewModel.PostsViewModel
import com.prashanna.androidplayground.utils.Constants.baseURL
import com.prashanna.androidplayground.utils.NetworkModule

object PostsDIContainer {
    private val postsAPIService: PostsAPIService = NetworkModule.createService(
        PostsAPIService::class.java,
        baseURL
    )
    private val postsRepository = PostsRepositoryImpl(postsAPIService)
    val getPostsUseCase = GetPostsUseCase(postsRepository)
    val postsViewModel = PostsViewModel(getPostsUseCase)
}

