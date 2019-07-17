package org.springboot.domain;

import lombok.Data;

@Data
public class Text {
//	章节ID，章节标题，章节内容
	private Long id;
	private String title;
	private String value;
}
