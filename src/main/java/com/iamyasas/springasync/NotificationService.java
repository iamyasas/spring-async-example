package com.iamyasas.springasync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async
    public void fireNotificatoin() throws InterruptedException {
        System.out.println("Time consuming service started...");
        Thread.sleep(10000); //This is to simulate a delay.
        System.out.println("Time consuming service ended");
    }

}
