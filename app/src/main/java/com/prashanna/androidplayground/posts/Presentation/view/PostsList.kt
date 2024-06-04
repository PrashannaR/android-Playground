package com.prashanna.androidplayground.posts.Presentation.view

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prashanna.androidplayground.posts.Presentation.ViewModel.PostsViewModel

@Composable
fun PostsList(viewModel: PostsViewModel) {
    val posts = viewModel.posts
    val isLoading = viewModel.isLoading
    val error = viewModel.error

    if (isLoading.value) {
        // Display a progress indicator or some loading text
        Text("Loading...")
    } else if (error.value.isNotEmpty()) {
        // Display the error message
        Text("Error: ${error.value}")
        Log.d("PostList", "PostsList: $error")
    } else {
        LazyColumn {
            items(posts.value) { post ->
                Column(modifier = Modifier.padding(16.dp)){
                    Text(post.title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        post.body,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal

                        )
                }
            }
        }
    }
}
