package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("currencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {
	
	@Autowired
	private ExchangeServiceImpl exchangeService;
	
	public CurrencyConverterImpl() {
		super();
		System.out.println("CurrencyConverterImpl()");
	}
	
	@Autowired
	public CurrencyConverterImpl(ExchangeServiceImpl exchangeService) {
		super();
		this.exchangeService = exchangeService;
	}

//	public ExchangeService getExchangeService() {
//		return exchangeService;
//	}
//
//	@Autowired
//	public void setExchangeService(ExchangeServiceImpl exchangeService) {
//		this.exchangeService = exchangeService;
//	}

	@PostConstruct
	public void init() {
		System.out.println("In init() - Invoked by @PostConstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("In destroy() - Invoked by @PreDestroy");
	}

	@Override
	public double dollarToRupees(double dollars) {
		System.out.println("dollarToRupees() Invoked");
		return dollars*exchangeService.getExchangeRate();
	}
}
