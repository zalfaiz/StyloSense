package com.example.stylosense.presentations.graph.detail

sealed class DetailScreen( val route: String) {
    object CartScreen : DetailScreen("cart_screen")
    object NotificationScreen : DetailScreen("notification_screen")
    object ProductDetailScreen : DetailScreen("product_detail_screen")
}