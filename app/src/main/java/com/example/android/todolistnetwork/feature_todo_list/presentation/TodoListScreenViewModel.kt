package com.example.android.todolistnetwork.feature_todo_list.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import com.example.android.todolistnetwork.feature_todo_list.domain.use_case.GetAllTodos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoListScreenViewModel @Inject constructor(private val getAllTodos: GetAllTodos):ViewModel(){

//    var todos by mutableStateOf<List<Todo>?>(null)
    var todos = mutableStateOf(TodoListState())

    init {
        viewModelScope.launch {
//            todos = getAllTodos()
            todos.value.todos = getAllTodos()
            todos.value.status = true
        }
    }


}