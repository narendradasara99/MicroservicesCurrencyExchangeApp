package com.nare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Entity
@Table(name="CURRENCYEXCHANGE")
public class CurrencyEntity {

		@Id
		@Column(name="id")
		private int id;
		@Column(name="currencyfrom")
		private String cfrom;
		@Column(name="currencytto")
		private String to;
		@Column(name="value")
		private int value;
		public CurrencyEntity() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCfrom() {
			return cfrom;
		}
		public void setCfrom(String cfrom) {
			this.cfrom = cfrom;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "CurrencyEntity [id=" + id + ", cfrom=" + cfrom + ", to=" + to + ", value=" + value + "]";
		}
		
	}

