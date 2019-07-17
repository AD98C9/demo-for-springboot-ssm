package org.springboot.service;

import org.springboot.domain.Book;

public interface BookService {
	Book findAllById(Long id);
}
