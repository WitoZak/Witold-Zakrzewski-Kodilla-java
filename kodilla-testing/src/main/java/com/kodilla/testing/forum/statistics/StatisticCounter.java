package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticCounter {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            averageNumberOfPostsPerUser = (double) postsCount / usersCount;
        } else {
            averageNumberOfPostsPerUser = 0;
        }
        if (usersCount != 0) {
            averageNumberOfCommentsPerUser = (double) commentsCount / usersCount;
        } else {
            averageNumberOfCommentsPerUser = 0;
        }
        if (postsCount != 0) {
            averageNumberOfCommentsPerPost = (double) commentsCount / postsCount;
        } else {
            averageNumberOfCommentsPerPost = 0;
        }
    }
    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }



    public void showStatistics() {
        System.out.println(usersCount);
        System.out.println(postsCount);
        System.out.println(commentsCount);
        System.out.println(averageNumberOfPostsPerUser);
        System.out.println(averageNumberOfCommentsPerUser);
        System.out.println(averageNumberOfCommentsPerPost);
    }

}
