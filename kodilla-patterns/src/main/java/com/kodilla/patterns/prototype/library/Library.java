package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable {

    public void setName(String name) {
        this.name = name;
    }

    public String name;
    public Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Library shallowCopy() {
        try {
            return (Library) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Library deepCopy() {
        Library library = shallowCopy();
        library.books = new HashSet<>(this.books);
        return library;
    }
}
