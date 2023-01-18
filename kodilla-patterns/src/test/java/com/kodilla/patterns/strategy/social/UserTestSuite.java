package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //When
        User twitterUser = new Millenials("Bill");
        User snapchatUser = new YGeneration("Gill");
        User facebookUser = new ZGeneration("Sill");

        //Then
        String twitterUserShare = twitterUser.sharePost();
        String snapchatUserShare = snapchatUser.sharePost();
        String facebookUserShare = facebookUser.sharePost();

        //Then
        assertEquals("Current You are using Twitter",twitterUserShare);
        assertEquals("Current You are using Snapchat",snapchatUserShare);
        assertEquals("Current You are using Facebook",facebookUserShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Give
        Millenials millenials = new Millenials("Bill");

        //When
        millenials.setShareStrategy(new SnapchatPublisher());
        String billShare = millenials.sharePost();

        //Then
        assertEquals("Current You are using Snapchat", billShare);

    }

}
