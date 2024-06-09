//package com.example.stylosense.presentations.graph.settings
//
//import android.content.Context
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavGraphBuilder
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.composable
//import androidx.navigation.navigation
//import com.example.stylosense.presentations.graph.Graph
//import com.example.stylosense.presentations.screen.profile_screen.LogoutScreen
//import com.example.stylosense.presentations.screen.profile_screen.NotificationScreen
//import com.example.stylosense.presentations.screen.profile_screen.ProfileScreen
//import com.example.stylosense.presentations.screen.profile_screen.SettingsScreen
//import com.example.stylosense.presentations.screen.profile_screen.profile_user_screen.ProfileDetailScreen
//import com.example.stylosense.presentations.graph.settings.ProfileRouteScreen
//
//@Composable
//fun
//        NavGraphBuilder.
//        SettingsNavGraph(navController: NavHostController,
//                         context: Context
//) {
////    NavHost
//    navigation(
////        navController = navController,
//        route = Graph.SETTINGS , startDestination = ProfileRouteScreen.ProfileScreen.route) {
////        composable(ProfileRouteScreen.ProfileScreen.route) { ProfileScreen(navController) }
//        composable(ProfileRouteScreen.ProfileDetailScreen.route) { ProfileDetailScreen() }
//        composable(ProfileRouteScreen.SettingsScreen.route) { SettingsScreen() }
//        composable(ProfileRouteScreen.NotificationScreen.route) { NotificationScreen() }
//        composable(ProfileRouteScreen.LogoutScreen.route) { LogoutScreen() }
//    }
//}