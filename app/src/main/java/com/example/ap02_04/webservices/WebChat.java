package com.example.ap02_04.webservices;

import android.app.Application;
import android.content.Context;

import com.example.ap02_04.entities.Chat;
import com.example.ap02_04.entities.ChatLite;
import com.example.ap02_04.entities.User;
import com.example.ap02_04.room.LocalDatabase;

public class WebChat extends Application {
    public static Context context;
    public static String token;
    public static User user;
    public static User contact;
    public static String username;
    public static ChatLite chatLite;
    public static Chat chat;
    public static String BaseUrl;
    public static LocalDatabase db;
    public static boolean isNight;
    public static boolean isUpdated;



    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static void setContext(Context context) {
        WebChat.context = context;
    }

    public static void setUser(User user) {
        WebChat.user = user;
    }

    public static Context getContext() {
        return context;
    }

    public static void setToken(String token) { WebChat.token = "Bearer " + token; }

    public static String getToken() { return token; }

    public static User getUser() { return user; }

    public static String getUsername() { return username; }

    public static void setUsername(String username) { WebChat.username = username; }

    public static User getContact() { return contact; }

    public static void setContact(User contact) { WebChat.contact = contact; }

    public static Chat getChat() { return chat; }

    public static void setChat(ChatLite chatLite) { WebChat.chatLite = chatLite; }

    public static ChatLite getChatLite() { return chatLite; }

    public static void setChatLite(ChatLite chatLite) { WebChat.chatLite = chatLite; }

    public static void setChat(Chat chat) { WebChat.chat = chat; }

    public static String getBaseUrl() { return BaseUrl; }

    public static void setBaseUrl(String baseUrl) { BaseUrl = baseUrl; }

    public static LocalDatabase getDb() { return db; }

    public static void setDb(LocalDatabase db) { WebChat.db = db; }

    public static boolean isIsUpdated() { return isUpdated; }

    public static void setIsUpdated(boolean isUpdated) { WebChat.isUpdated = isUpdated; }

    public static boolean isNight() { return isNight; }

    public static void setIsNight(boolean isNight) { WebChat.isNight = isNight; }
}
