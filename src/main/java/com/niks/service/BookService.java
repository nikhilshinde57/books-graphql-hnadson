package com.niks.service;

import com.niks.entity.Book;
import com.niks.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.allBooks();
    }

    public Book bookById(Integer id) {
        return bookRepository.bookById(id);
    }


    public Book updateBook(Integer id, String title) {
        return bookRepository.updateBook(id, title);
    }

}
