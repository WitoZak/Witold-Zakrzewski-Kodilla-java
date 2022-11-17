package com.kodilla.stream.forumUsers;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<forumUsers> getUserList() {
        List<forumUsers> theListOfUsers = new ArrayList<>();
        theListOfUsers.add(new forumUsers(1,"Frog",'M', LocalDate.of(1999,03,22),50));
        theListOfUsers.add(new forumUsers(2,"Benek",'M',LocalDate.of(2000,01,11), 44));
        theListOfUsers.add(new forumUsers(3,"Mika",'F',LocalDate.of(2007,11,01),90));
        theListOfUsers.add(new forumUsers(4,"Roza",'F',LocalDate.of(1977,04,03),0));
    return new ArrayList<>(theListOfUsers);
    }
}
