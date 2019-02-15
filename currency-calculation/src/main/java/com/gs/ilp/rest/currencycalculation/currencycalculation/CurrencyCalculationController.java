 package com.gs.ilp.rest.currencycalculation.currencycalculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyCalculationController {
	
	@Autowired
	private CurrencyCalculationProxy currencyCalculationProxy;
	
	
	//private RestTemplate restTemplate = new RestTemplate();

	@Autowired
	private Environment env;

	// currency-calculation/from/{from}/to/{to}/{valueToConvert}
	@GetMapping("currency-calculation/from/{from}/to/{to}/{valueToConvert}")
	public CurrencyCalculation getFinalValue(@PathVariable(name = "from") String from,
			@PathVariable(name = "to") String to, @PathVariable(name = "valueToConvert") int valueToConvert) {
		
		
		/*
		Map<String, String>  uriMap  =  new HashMap<>();
		uriMap.put("from", from);
		uriMap.put("to", to);
		
		ResponseEntity<CurrencyExchangeResponse> response = restTemplate.getForEntity("http://localhost:8001/currency-exchange/{from}/{to}"
				, CurrencyExchangeResponse.class,uriMap);
		
		CurrencyExchangeResponse currencyExchangeResponse = response.getBody();*/
		
		CurrencyExchangeResponse currencyExchangeResponse  = currencyCalculationProxy.getExchangeValue(from, to);
		
		CurrencyCalculation currencyCalculation = new CurrencyCalculation(currencyExchangeResponse.getSeq(),
				from, to, currencyExchangeResponse.getConversionFactor(),
				(currencyExchangeResponse.getConversionFactor()*valueToConvert) , currencyExchangeResponse.getPort());
		//currencyCalculation.setPort(env.getProperty("server.port"));

		return currencyCalculation;
	}
}
