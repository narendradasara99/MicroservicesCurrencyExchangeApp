package com.nare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nare.bean.Model;
import com.nare.dao.CurrencyExchangedao;
import com.nare.entity.CurrencyEntity;
@Service
public class CurrencyService {
	@Autowired
	private CurrencyExchangedao dao;
	public CurrencyEntity currencyexchange(String from,String to) {
	
		CurrencyEntity c=dao.exchange(from,to);

		return c;
	}
}
