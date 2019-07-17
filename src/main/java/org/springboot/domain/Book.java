package org.springboot.domain;

import lombok.Data;

@Data
public class Book {
//	书目ID，书名，作者，简介，种类
	private Long id;
	private String bookName;
	private String author;
	private String brief;
	private Long kind;
}
