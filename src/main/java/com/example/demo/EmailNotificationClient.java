package com.example.demo;

import org.springframework.stereotype.Component;

@Component(value="email")
public class EmailNotificationClient implements NotificationClient {
    @Override
    public void sendNotification(){
        System.out.println("Email Notification Sent");

    }
}
