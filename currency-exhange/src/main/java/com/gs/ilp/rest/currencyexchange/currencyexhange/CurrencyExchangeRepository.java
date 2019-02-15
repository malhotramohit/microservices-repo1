package com.gs.ilp.rest.currencyexchange.currencyexhange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {

	public CurrencyExchange findByCurrfromAndCurrto(String from, String to);


}
