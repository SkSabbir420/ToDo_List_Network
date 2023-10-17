package com.example.android.todolistnetwork.feature_todo_list.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo

@Composable
fun TodoList(todo:Todo){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = todo.id.toString(), modifier = Modifier.padding(8.dp))
        Text(text = todo.title)
        Checkbox(checked = todo.completed, onCheckedChange = {},modifier = Modifier.padding(8.dp) )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTodoList(){
    val todo = Todo(true,0,"This is a title",0)
    TodoList(todo = todo )
}