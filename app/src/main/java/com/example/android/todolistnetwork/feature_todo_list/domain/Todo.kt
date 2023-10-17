package com.example.android.todolistnetwork.feature_todo_list.domain

data class Todo(
    val completed:Boolean,
    val id:Int,
    val title:String,
    val userId:Int,
)