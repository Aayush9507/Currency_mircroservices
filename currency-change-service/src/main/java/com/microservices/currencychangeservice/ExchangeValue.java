package com.microservices.currencychangeservice;

import java.math.BigDecimal;

public class ExchangeValue {

		private String from;
		private String to;
		private Long id;
		private BigDecimal conversionMultipleBigDecimal;
		private int port;
		

		public ExchangeValue() {
			
		}
		
		public ExchangeValue(String from, String to, Long id, BigDecimal conversionMultipleBigDecimal) {
			super();
			this.from = from;
			this.to = to;
			this.id = id;
			this.conversionMultipleBigDecimal = conversionMultipleBigDecimal;
		}
		
		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public BigDecimal getConversionMultipleBigDecimal() {
			return conversionMultipleBigDecimal;
		}

		public void setConversionMultipleBigDecimal(BigDecimal conversionMultipleBigDecimal) {
			this.conversionMultipleBigDecimal = conversionMultipleBigDecimal;
		}

		
		
		
}
