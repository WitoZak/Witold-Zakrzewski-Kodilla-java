package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> getUserList() {
        List<ForumUser> theListOfUsers = new ArrayList<>();
        theListOfUsers.add(new ForumUser(1,"Frog",'M', LocalDate.of(1999,03,22),50));
        theListOfUsers.add(new ForumUser(2,"Benek",'M',LocalDate.of(2002,10,17), 44));
        theListOfUsers.add(new ForumUser(3,"Mika",'F',LocalDate.of(2002,11,01),90));
        theListOfUsers.add(new ForumUser(4,"Roza",'F',LocalDate.of(1977,04,03),0));
        return new ArrayList<>(theListOfUsers);
    }
}