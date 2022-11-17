package com.kodilla.testing.library.statistics;

import com.kodilla.testing.forum.statistics.StatisticCounter;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class StatisticsCounterTestSuit {

    @Mock
    private Statistics statistics;

    private List<String> listOfUsersNames(int number) {
        List<String> userNames = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String userName = "User " + i;
            userNames.add(userName);
        }
        return userNames;
    }

    private void mockStatistics(int usersCount, int postsCount, int commentsCount) {
        when(statistics.usersNames()).thenReturn(listOfUsersNames(usersCount));
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(commentsCount);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestsForPosts {
        @Test
        public void testIf0Posts() {
            //Given
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(5, 0, 0);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(0, statisticCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(0, statisticCounter.getAverageNumberOfPostsPerUser());

        }

        @Test
        public void testIf1000Post() {
            //Give
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(100, 1000, 2000);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(2, statisticCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(10, statisticCounter.getAverageNumberOfPostsPerUser());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestsForComments {
        @Test
        public void TestIf0Comments() {
            //Given
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(4, 40, 0);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(0, statisticCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(0, statisticCounter.getAverageNumberOfCommentsPerUser());
        }

        @Test
        public void TestIfCommentsLessThenPosts() {
            //Given
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(5, 30, 6);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(0.2, statisticCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(1.2, statisticCounter.getAverageNumberOfCommentsPerUser());
        }

        @Test
        public void TestIfCommentsMoreThenPosts() {
            //Given
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(5, 30, 60);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(2, statisticCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(12, statisticCounter.getAverageNumberOfCommentsPerUser());
        }
    }

    @Nested
    @DisplayName("Tests for Users")
    class TestForUsers {
        @Test
        public void testIf0Users() {
            //Given
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(0, 0, 0);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(0, statisticCounter.getAverageNumberOfPostsPerUser());
            assertEquals(0, statisticCounter.getAverageNumberOfCommentsPerUser());
        }

        @Test
        public void testIf100Users() {
            //Given
            StatisticCounter statisticCounter = new StatisticCounter();
            mockStatistics(100, 500, 1000);
            //When
            statisticCounter.calculateAdvStatistics(statistics);
            //Then
            assertEquals(5, statisticCounter.getAverageNumberOfPostsPerUser());
            assertEquals(10, statisticCounter.getAverageNumberOfCommentsPerUser());
        }
    }
}


