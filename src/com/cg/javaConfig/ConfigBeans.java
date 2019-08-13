package com.cg.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

	@Bean
	public Author author() {
		return new Author("Kathy Sierra", "LA");
	}	
	
	@Bean
	public Book book() {
		Book book = new Book();
		book.setIsbn("A12345");
		book.setYear("2018");
		book.setAuthor(author());
		return book;
	}
}