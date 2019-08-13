package com.cg.list;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("collection.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		CurrencyList list = (CurrencyList) factory.getBean("currencyList");
		List result = list.getCurrList();
		System.out.println(result);
	}
}