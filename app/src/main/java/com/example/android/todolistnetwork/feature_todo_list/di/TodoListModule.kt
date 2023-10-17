package com.example.android.todolistnetwork.feature_todo_list.di

import android.app.Activity
import androidx.core.app.ActivityCompat
import com.example.android.todolistnetwork.feature_todo_list.data.remote.TodoApi
import com.example.android.todolistnetwork.feature_todo_list.data.repository.TodoRepositoryImp
import com.example.android.todolistnetwork.feature_todo_list.domain.Todo
import com.example.android.todolistnetwork.feature_todo_list.domain.repository.TodoRepository
import com.example.android.todolistnetwork.feature_todo_list.domain.use_case.GetAllTodos
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoListModule {

    @Provides
    @Singleton
    fun ProvideTodoApi(): TodoApi{
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoApi::class.java)
    }

    @Provides
    @Singleton
    fun ProvideAllTodos(todoApi:TodoApi):TodoRepository{
        return TodoRepositoryImp(todoApi)
    }

    @Provides
    @Singleton
    fun ProvideGetAllTodosUseCase(todoRepository: TodoRepository):GetAllTodos{
        return GetAllTodos(todoRepository)
    }



}