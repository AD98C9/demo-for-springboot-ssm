package org.springboot.controller;

import org.springboot.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
	@Autowired
	private TextService textServiceImpl;
	
	@RequestMapping(value = "/{bookId}/{Id}")
	public String index(@PathVariable("bookId") Long bookId,@PathVariable("Id") Long id) {
		return textServiceImpl.findValueById(bookId, id);
	}
}
