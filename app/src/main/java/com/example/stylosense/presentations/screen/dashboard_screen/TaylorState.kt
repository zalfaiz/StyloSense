package com.example.stylosense.presentations.screen.dashboard_screen

import com.example.stylosense.domains.models.ProductModel

data class ProductState(
    val isLoading: Boolean = false,
    val product: List<ProductModel>? = null,
    val errorMessage: String = ""
)