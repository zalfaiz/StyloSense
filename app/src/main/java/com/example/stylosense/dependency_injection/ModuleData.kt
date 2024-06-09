package com.example.stylosense.dependency_injection

import com.example.stylosense.datas.dummy_db.DemoDB
import com.example.stylosense.datas.repos.ProductRepositoryImp
import com.example.stylosense.domains.repos.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideProductRepository(demoDB: DemoDB): ProductRepository {
        return ProductRepositoryImp(demoDB)
    }

}