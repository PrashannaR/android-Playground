package com.prashanna.androidplayground.posts.Domain.UseCase

import com.prashanna.androidplayground.posts.Domain.Repository.PostsRepository

class GetPostsUseCase(private val repository: PostsRepository) {
    suspend operator fun invoke() = repository.getPosts()
}