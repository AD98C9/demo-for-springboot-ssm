package org.springboot.dao.novel_system;

import org.springboot.domain.Book;

public interface BookDao {
	Book findAllById(Long id);
}
