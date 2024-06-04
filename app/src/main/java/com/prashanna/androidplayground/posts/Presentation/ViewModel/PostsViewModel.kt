package com.prashanna.androidplayground.posts.Presentation.ViewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prashanna.androidplayground.posts.Domain.Model.PostsResponseModel
import com.prashanna.androidplayground.posts.Domain.UseCase.GetPostsUseCase
import kotlinx.coroutines.launch

class PostsViewModel(
    private  val getPostUseCase: GetPostsUseCase
): ViewModel() {
    var posts = mutableStateOf<List<PostsResponseModel>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        viewModelScope.launch {
            posts.value = getPostUseCase()
            isLoading.value = false
        }
    }

}
