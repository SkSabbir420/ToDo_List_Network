package com.example.android.todolistnetwork

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.android.todolistnetwork.feature_todo_list.presentation.TodoListScreen
import com.example.android.todolistnetwork.feature_todo_list.presentation.TodoListScreenViewModel
import com.example.android.todolistnetwork.ui.theme.ToDoListNetworkTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

//        val viewModel by viewModels<TodoListScreenViewModel>()
        setContent {
            ToDoListNetworkTheme {
                val viewModel = hiltViewModel<TodoListScreenViewModel>()
                viewModel.todos.let { it.value.todos?.let { it1 -> TodoListScreen(todos = it1) } }
            }
        }

    }
}
