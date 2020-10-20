package com.zemoso.listeners;

import com.zemoso.objects.FacebookUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppNotificationListener implements IEventListener {
    private static final Logger logger = LoggerFactory.getLogger(AppNotificationListener.class);

    private final FacebookUser user;

    public AppNotificationListener(FacebookUser user) {
        this.user = user;
    }

    public void update(String eventType, String displayName, String url) {
        logger.info(
                "App Notification >> Hey " + this.user.getFirstName() + "("+this.user.getEmail()+"), " +
                        displayName + " posted new content: " + eventType + " >> " + url);
    }
}
