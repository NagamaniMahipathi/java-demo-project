package com.example.demo;

import org.springframework.stereotype.Component;

@Component(value="sms")
public class SMSNotificationClient implements NotificationClient {
    @Override
    public void sendNotification(){
        System.out.println("SMS Notification Sent");

    }
}
