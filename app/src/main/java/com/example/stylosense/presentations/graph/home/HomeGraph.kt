package com.example.stylosense.presentations.graph.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stylosense.presentations.graph.Graph
import com.example.stylosense.presentations.graph.detail.DetailScreen
import com.example.stylosense.presentations.graph.detail.detailNavGraph
import com.example.stylosense.presentations.screen.chat_screen.ConversationScreen
import com.example.stylosense.presentations.screen.dashboard_screen.component.DashboardScreen
import com.example.stylosense.presentations.screen.fav_screen.FavouriteScreen
import com.example.stylosense.presentations.screen.profile_screen.ProfileScreen
import com.example.stylosense.presentations.screen.profile_screen.help_center_screen.HelpCenterScreen
import com.example.stylosense.presentations.screen.profile_screen.profile_edit_user_screen.EditProfileScreen
import com.example.stylosense.presentations.screen.profile_screen.profile_user_screen.ProfileDetailScreen
import com.example.stylosense.presentations.screen.profile_screen.setting_screen.SettingsScreen


@Composable
fun HomeNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        route = Graph.HOME,
        startDestination = ShopHomeScreen.DashboardScreen.route
    ) {
        composable(ShopHomeScreen.DashboardScreen.route) {
            DashboardScreen() { productId ->
                navHostController.navigate(DetailScreen.ProductDetailScreen.route + "/${productId}")
            }
        }
        composable(ShopHomeScreen.FavouriteScreen.route) {
            FavouriteScreen()
        }
        composable(ShopHomeScreen.ConversationScreen.route) {
            ConversationScreen()
        }
        composable(ShopHomeScreen.EditProfileScreen.route) {
            EditProfileScreen()
        }
        composable(ShopHomeScreen.ProfileDetailScreen.route) {
            ProfileDetailScreen()
        }
        composable(ShopHomeScreen.SettingsScreen.route) {
            SettingsScreen()
        }
        composable(ShopHomeScreen.HelpCenterScreen.route) {
            HelpCenterScreen()
        }
        composable(ShopHomeScreen.ProfileScreen.route) {
//            ProfileScreen() {
//                navHostController.popBackStack()
//            }
            ProfileScreen(navController = navHostController)
        }
        //detail graph
        detailNavGraph(navController = navHostController)
    }
}