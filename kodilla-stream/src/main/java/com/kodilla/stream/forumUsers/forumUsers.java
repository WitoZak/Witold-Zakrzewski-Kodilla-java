package com.kodilla.stream.forumUsers;

import java.time.LocalDate;

public final class forumUsers {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public forumUsers(final int id, final String userName, final char sex, final LocalDate dateOfBirth, final int postCount) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "forumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
