package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Component
@Controller
@ResponseBody
@RequestMapping("/notifications")
public class NotificationAPI {
  //SpringBoot
  @Autowired
  private NotificationClient email;

  @GetMapping("/email")
  public void triggerNotification(){
      this.email.sendNotification();
  }
  //Spring
 /* //A class is depend on the interface not on implementation
  @Autowired
  //instead of using Qualifier use autowireing by name
 // @Qualifier("email")
 // private NotificationClient notificationClient;

  private NotificationClient email;
  public void triggerNotification(){
     // this.notificationClient.sendNotification();
      this.email.sendNotification();
  }
//instead of this setter method use @Autowired
//  public void setNotificationClient(NotificationClient notificationClient) {
   //   this.notificationClient = notificationClient;
 // }

  */
}
