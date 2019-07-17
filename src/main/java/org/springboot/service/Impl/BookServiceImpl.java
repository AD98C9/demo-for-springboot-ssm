package org.springboot.service.Impl;

import org.springboot.dao.novel_system.BookDao;
import org.springboot.domain.Book;
import org.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public Book findAllById(Long id) {
		return bookDao.findAllById(id);
	}
}
