package com.estudo.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {
	
	
	@Bean
	public JwtAccessTokenConverter accesTokenConverter () {
		JwtAccessTokenConverter  tokenConverter = new JwtAccessTokenConverter(); 
		tokenConverter.setSigningKey("token");
		return tokenConverter;
	}
	
	@Bean
	public JwtTokenStore tokenStore () {
		return new JwtTokenStore(accesTokenConverter());
	}
	

}
