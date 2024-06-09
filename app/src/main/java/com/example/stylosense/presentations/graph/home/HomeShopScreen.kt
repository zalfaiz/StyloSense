package com.example.stylosense.presentations.graph.home

sealed class ShopHomeScreen(val route: String) {
    object DashboardScreen : ShopHomeScreen("dashboard_screen")
    object ConversationScreen : ShopHomeScreen("conversation_screen")
    object EditProfileScreen : ShopHomeScreen("edit_profile_screen")
    object ProfileScreen : ShopHomeScreen("profile_screen")
    object FavouriteScreen : ShopHomeScreen("favourite_screen")
    object ProfileDetailScreen : ShopHomeScreen("profile_detail_screen")
    object SettingsScreen : ShopHomeScreen("settings_screen")
    object NotificationScreen : ShopHomeScreen("notification_screen")
    object HelpCenterScreen : ShopHomeScreen("help_center_screen")
    object LogoutScreen : ShopHomeScreen("logout_screen")
}
