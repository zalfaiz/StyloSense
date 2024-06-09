package com.example.stylosense.presentations.screen.detail_taylor_screen

import com.example.stylosense.domains.models.ProductModel

data class ProductDetailState(
    val isLoading: Boolean = false,
    val productDetail: ProductModel? = null,
    val errorMessage: String = ""
)