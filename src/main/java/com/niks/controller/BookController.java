package com.niks.controller;

import com.niks.entity.Book;
import com.niks.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
@RequiredArgsConstructor
public class BookController {

    @Autowired
    BookService bookService;

    @SchemaMapping(typeName = "Query", value = "allBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @QueryMapping
    public Book bookById(@Argument Integer id) {
        return bookService.bookById(id);
    }

    @MutationMapping
    public Book updateBook(@Argument Integer id, @Argument String title) {
        return bookService.updateBook(id, title);
    }
}
