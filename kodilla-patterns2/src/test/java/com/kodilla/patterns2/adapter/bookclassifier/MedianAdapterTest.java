package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MedianAdapterTest {

    @Test
    void publicationYearMedianTest() {
        //given
        MedianAdapter  medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Antoine de Saint-Exupery", "The Martian", 1996, "123456789"));
        books.add(new Book("Olivette Titcom", "Allnighter",  2011, "345367654"));
        books.add(new Book("Dorise Scotchmore", "Bandslam",  2006, "235476756"));
        books.add(new Book("Dulcea Peizer", "Tarzan and the Lost City",  2000, "2346475673"));
        books.add(new Book("Fernanda Stockton", "Table 7",  1997, "1232353452"));

        //when then
        assertEquals(2000, medianAdapter.publicationYearMedian(books));

    }
}
