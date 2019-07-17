package org.springboot.service;

import java.util.HashMap;
import java.util.List;

public interface TextService {
	public String findValueById(Long bookId,Long id);
	public List<HashMap<Long,String> > findIdAndTitleByBookId(Long bookId);
}
