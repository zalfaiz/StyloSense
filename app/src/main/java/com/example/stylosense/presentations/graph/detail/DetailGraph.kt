package com.example.stylosense.presentations.graph.detail

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.stylosense.commons.Constrains
import com.example.stylosense.presentations.graph.Graph
import com.example.stylosense.presentations.screen.cart_screen.CartScreen
import com.example.stylosense.presentations.screen.detail_taylor_screen.component.ProductDetailScreen
import com.example.stylosense.presentations.screen.notif_screen.NotificationScreen

fun NavGraphBuilder.detailNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailScreen.ProductDetailScreen.route + "/{${Constrains.PRODUCT_ID_PARAM}}"
    ) {
        composable(DetailScreen.CartScreen.route) {
            CartScreen()
        }
        composable(DetailScreen.NotificationScreen.route) {
            NotificationScreen()
        }
        composable(DetailScreen.ProductDetailScreen.route + "/{productId}") {
            ProductDetailScreen() {
                navController.popBackStack()
            }
        }
    }
}