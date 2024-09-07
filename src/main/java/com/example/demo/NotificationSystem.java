package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class NotificationSystem
{
    public static void main( String[] args )
    {
       //SpringBoot

       SpringApplication.run(NotificationSystem.class,args);

       //Spring
      /*  ApplicationContext applicationContext=new AnnotationConfigApplicationContext(NotificationSystem.class);
       // applicationContext.getBeanDefinitionNames(); or
        for(String beanName:applicationContext.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

      NotificationAPI notificationAPI = (NotificationAPI)applicationContext.getBean("notificationAPI");
        notificationAPI.triggerNotification();

       //NotificationAPI notificationAPI=new NotificationAPI();
       //EmailNotificationClient emailNotificationClient=new EmailNotificationClient();
       //notificationAPI.setNotificationClient(emailNotificationClient);
       //notificationAPI.triggerNotification();

       */
    }
}
