package com.example.android.todolistnetwork.feature_todo_list.presentation


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import androidx.compose.foundation.lazy.items

@Composable
fun TodoListScreen(todos: List<Todo>){
    LazyColumn{
        items(todos){todo ->
            TodoList(todo = todo)
        }
    }
}