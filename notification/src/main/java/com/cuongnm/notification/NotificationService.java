package com.cuongnm.notification;

import com.cuongnm.client.notification.NotificationRequest;

public interface NotificationService {

    void send(NotificationRequest notificationRequest);
}
