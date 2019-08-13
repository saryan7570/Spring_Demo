package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exchangeService")
public class ExchangeServiceImpl implements ExchangeService {

	@Value("45.0")
	private double exchangeRate;
	
//	public ExchangeServiceImpl(double exchangeRate) {
//		super();
//		this.exchangeRate = exchangeRate;
//		System.out.println("ExchnageServiceImpl constructor invoked");
//	}
	
	public ExchangeServiceImpl() {
		super();
		System.out.println("Exchange Service Impl Invoked");
	}
	
	@Override
	public double getExchangeRate() {
		System.out.println("Get Exchange Rate Invoked");
		return exchangeRate;
	}
}