package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library One");

        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(1984, 1, 1));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(2001, 2, 2));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(2022, 3, 3));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Set<Book> books = library.getBooks();
        //When
        Set<Book> expectedBooks = new HashSet<>();
        expectedBooks.add(book1);
        expectedBooks.add(book2);
        expectedBooks.add(book3);
        //Then
        assertEquals(expectedBooks, books);
    }

    @Test
    public void testShallowCopy() {
        //Given
        Library library = new Library("Library Two");

        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(1987, 1, 1));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(2001, 2, 2));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(2023, 3, 3));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        //When
        Library shallowCopy = library.shallowCopy();
        //Then
        assertEquals(library.getBooks(), shallowCopy.getBooks());
        assertNotSame(library, shallowCopy);
        assertSame(library.getBooks(), shallowCopy.getBooks());
    }

    @Test
    public void testDeepCopy() {
        //Given
        Library library = new Library("Library Three");

        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(1992, 1, 1));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(2001, 2, 2));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(2017, 3, 3));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        //When
        Library deepCopy = library.deepCopy();
        //Then
        assertEquals(library.getBooks(), deepCopy.getBooks());
        assertNotSame(library, deepCopy);
        assertNotSame(library.getBooks(), deepCopy.getBooks());
    }

    @Test
    public void removeBookTest() {
        //Given
        Library library = new Library("Library Three");

        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(1992, 1, 1));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(2001, 2, 2));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(2017, 3, 3));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Library deepClone, shallowClone;

        shallowClone = library.shallowCopy();
        deepClone = library.deepCopy();

        //When
        library.books.remove(book1);

        //Then
        assertEquals(2, library.books.size());
        assertEquals(2, shallowClone.books.size());
        assertEquals(3, deepClone.books.size());
    }
}