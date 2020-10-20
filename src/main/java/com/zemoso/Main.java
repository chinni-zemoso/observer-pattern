package com.zemoso;

import com.zemoso.listeners.AppNotificationListener;
import com.zemoso.listeners.EmailNotificationListener;
import com.zemoso.objects.FacebookUser;
import com.zemoso.objects.FollowType;
import com.zemoso.publisher.FacebookPage;

public class Main {

    public static void main(String[] args) {

        // Initialization
        FacebookPage facebookPage = new FacebookPage("ZemosoLabs-DP");

        FacebookUser chinni = new FacebookUser("Chinni", "chinni@gmail.com");
        FacebookUser sai = new FacebookUser("Sai", "sai@gmail.com");

        // Chinni
        AppNotificationListener chinniAppNotification = new AppNotificationListener(chinni);

        facebookPage.follow(FollowType.VIDEO, chinniAppNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, chinniAppNotification);
        facebookPage.follow(FollowType.ARTICLE, chinniAppNotification);

        // Sai
        EmailNotificationListener saiEmailNotification = new EmailNotificationListener(sai);
        AppNotificationListener saiAppNotification = new AppNotificationListener(sai);

        facebookPage.follow(FollowType.VIDEO, saiEmailNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, saiEmailNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, saiAppNotification);

        // Notify
        facebookPage.startLiveStream("https://facbook.com/livestream");

//        facebookPage.unfollow(FollowType.LIVE_STREAM, saiAppNotification);
//
//        facebookPage.startLiveStream("https://facebook.com/other-livestream");
    }
}
