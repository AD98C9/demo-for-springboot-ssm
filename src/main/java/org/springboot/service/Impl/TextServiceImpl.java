package org.springboot.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springboot.dao.library.TextDao;
import org.springboot.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService{
	@Autowired
	private TextDao textDao;

	@Override
	public String findValueById(Long bookId, Long id) {
		return textDao.findValueById(bookId, id);
	}

	@Override
	public List<HashMap<Long, String>> findIdAndTitleByBookId(Long bookId) {
		return textDao.findIdAndTitleByBookId(bookId);
	}
	
	
}
