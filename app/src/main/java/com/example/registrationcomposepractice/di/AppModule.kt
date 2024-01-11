package com.example.registrationcomposepractice.di

import com.example.registrationcomposepractice.data.Repository
import com.example.registrationcomposepractice.data.RepositoryImpl
import com.example.registrationcomposepractice.domain.RegisterUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providesRepository() : Repository {
        return RepositoryImpl()
    }

    @Provides
    fun provideRegisterUserUseCase(repository: Repository): RegisterUserUseCase {
        return RegisterUserUseCase(repository)
    }
}