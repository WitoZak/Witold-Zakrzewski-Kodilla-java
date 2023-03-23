package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HomeWorkQueueTest {

    @Test
    void testUpdate() {
        //given
        HomeWorkQueue queue1 = new HomeWorkQueue("Backend");
        HomeWorkQueue queue2 = new HomeWorkQueue("Frontend");

        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        Mentor jessiePerez = new Mentor("Jessie Perez");

        queue1.registerObserver(johnSmith);
        queue1.registerObserver(ivoneEscobar);
        queue2.registerObserver(ivoneEscobar);
        queue2.registerObserver(jessiePerez);

        //when
        queue1.addHomework("22.1");
        queue1.addHomework("2.2");
        queue2.addHomework("14.3");
        queue1.addHomework("33.4");
        queue2.addHomework("9.5");
        queue2.addHomework("29.6");
        queue2.addHomework("19.7");

        //then
        assertEquals(2, queue1.getObservers().size());
        assertEquals(4, queue2.getHomeworks().size());
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(7, ivoneEscobar.getUpdateCount());
        assertEquals(4, jessiePerez.getUpdateCount());
    }

}