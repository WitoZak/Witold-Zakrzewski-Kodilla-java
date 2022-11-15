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
            mockStatistics(5, 0,0);
            statisticCounter.calculateAdvStatistics(statistics);
            //When

            //????????

            //Then
            assertEquals(0, statisticCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(0, statisticCounter.getAverageNumberOfPostsPerUser());

        }
    }
}
