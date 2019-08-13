package com.cg.editor;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.MessageSource;

public class MessageClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("message.xml");
		MessageSource messageSource = (MessageSource) ctx.getBean("messageSource");
		Locale locale = new Locale("in", "HN");
		String msg = messageSource.getMessage("welcome.message", null, locale);
		System.out.println(msg);
	}
}