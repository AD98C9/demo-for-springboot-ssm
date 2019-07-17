package org.springboot.dao.library;

import java.util.HashMap;
import java.util.List;


public interface TextDao {
	public String findValueById(Long bookId,Long id);
	public List<HashMap<Long,String> > findIdAndTitleByBookId(Long bookId);
}
