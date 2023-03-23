package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(HomeWorkQueue homeWorkQueue) {
        System.out.println(mentorName + ": New homework added to " + homeWorkQueue.getCourseName() + "\n" +
                "Total number of homework: " + homeWorkQueue.getHomeworks().size());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
