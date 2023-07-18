package com.book.bookstore.controller;

import com.book.bookstore.model.Book;
import com.book.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;
    @RequestMapping("/getAllBooks")
    @ResponseBody
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }
}
