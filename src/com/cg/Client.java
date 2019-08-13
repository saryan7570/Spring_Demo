package com.cg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("currencyConverter.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("annotation.xml");
		
		CurrencyConverter currency = (CurrencyConverter) factory.getBean("currencyConverter");
		double result = currency.dollarToRupees(14.0);
		System.out.println("14 Dollar is " +result+ " Rs");
	}
}