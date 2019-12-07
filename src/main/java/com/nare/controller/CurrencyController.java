package com.nare.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nare.bean.Model;
import com.nare.entity.CurrencyEntity;
import com.nare.service.CurrencyService;

@RestController
public class CurrencyController {
	@Autowired
	private CurrencyService s;
	@GetMapping(value="/exchange/from/{from}/to/{to}",produces= {"application/json"})
	public CurrencyEntity exchangem(@PathVariable("from")String from,@PathVariable("to")String to) {
		CurrencyEntity e=s.currencyexchange(from, to);
		return e;
	}

	
}
