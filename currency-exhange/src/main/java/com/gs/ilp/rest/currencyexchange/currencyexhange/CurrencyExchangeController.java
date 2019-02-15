package com.gs.ilp.rest.currencyexchange.currencyexhange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;

	@Autowired
	private Environment env;

	// currency-exchange/{from}/{to}
	@GetMapping("currency-exchange/{from}/{to}")
	public CurrencyExchange getExchangeConversionFactor(@PathVariable(name = "from") String from,
			@PathVariable(name = "to") String to) {
		CurrencyExchange currencyExchange = currencyExchangeRepository.findByCurrfromAndCurrto(from, to);
		currencyExchange.setPort(env.getProperty("server.port"));
		return currencyExchange;
	}

	@PostMapping("currency-exchange/exchangeMapping")
	public void createNewCurremncyExchange(@RequestBody CurrencyExchange currencyExchange) {
		currencyExchange.setPort(env.getProperty("server.port"));
		currencyExchangeRepository.save(currencyExchange);

	}
}
