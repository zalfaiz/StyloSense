package com.example.stylosense.domains.repos

import com.example.stylosense.domains.models.ProductModel

interface ProductRepository {
    suspend fun getProduct(): List<ProductModel>? = null
    suspend fun getProductDetail(id: Int): ProductModel? = null
}