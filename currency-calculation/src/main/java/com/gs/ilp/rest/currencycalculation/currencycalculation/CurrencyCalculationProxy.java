package com.gs.ilp.rest.currencycalculation.currencycalculation;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zuul-server" )
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyCalculationProxy {

	@GetMapping("/currency-exchange-service/currency-exchange/{from}/{to}")
	public CurrencyExchangeResponse getExchangeValue(@PathVariable(name = "from") String from,
			@PathVariable(name = "to") String to);
}
