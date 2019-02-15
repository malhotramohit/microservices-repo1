package com.gs.ilp.rest.zuul.zuulserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyZoomLogginFilter extends ZuulFilter {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object run() throws ZuulException {

		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("Request details " + request + " request info " + request.getRequestURI());

		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
