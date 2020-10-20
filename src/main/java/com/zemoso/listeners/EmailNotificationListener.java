package com.zemoso.listeners;

import com.zemoso.objects.FacebookUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotificationListener implements IEventListener {
    private static final Logger logger = LoggerFactory.getLogger(EmailNotificationListener.class);
    private final FacebookUser user;

    public EmailNotificationListener(FacebookUser user) {
        this.user = user;
    }


    public void update(String eventType, String displayName, String url) {
        logger.info(
                "Email Notification >> Hey " + this.user.getFirstName() + "(" + this.user.getEmail() + "), " +
                        displayName + " posted new content: " + eventType + " >> " + url);
    }
}
