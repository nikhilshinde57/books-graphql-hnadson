package com.niks.repository;

import com.niks.entity.Author;
import com.niks.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {

    private static List<Book> books;

    static {
        Book book1 = new Book(101, "GraphQL Overview 1", 500, new Author("BestAuthor_123"));
        Book book2 = new Book(102, "Spring Overview 2", 200, new Author("BestAuthor_432"));
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
    }

    public List<Book> allBooks() {
        return books;
    }

    public Book bookById(Integer id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }

    public Book updateBook(Integer id, String title) {
        Book book = bookById(id);
        if (book != null) {
            book.setTitle(title);
        }
        return book;
    }
}