package com.nare.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nare.entity.CurrencyEntity;
@Repository
public interface CurrencyExchangedao   extends CrudRepository<CurrencyEntity, Integer>{
	@Query(value="from CurrencyEntity where cfrom=:f and to=:t")
	public CurrencyEntity exchange(String f, String t);

}
