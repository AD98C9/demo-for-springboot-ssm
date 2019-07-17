package org.springboot.controller;

import org.springboot.domain.Book;
import org.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/{bookId}")
	public Book index(@PathVariable("bookId") Long id) {
		return bookService.findAllById(id);
	}
}
