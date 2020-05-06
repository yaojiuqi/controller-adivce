package com.yjq.controlleradvice.controller;

import com.yjq.controlleradvice.Author;
import com.yjq.controlleradvice.Book;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @PostMapping("/book")
    public void addBook(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author){
        System.out.println(book);
        System.out.println(author);
    }
}
