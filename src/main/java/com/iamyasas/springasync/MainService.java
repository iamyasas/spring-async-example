package com.iamyasas.springasync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired private NotificationService notificationService;

    public String getGreeting(String name) throws InterruptedException {
        notificationService.fireNotificatoin();
        return "Hi, " + name;
    }
}
