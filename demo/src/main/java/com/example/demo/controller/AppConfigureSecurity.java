package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
@EnableWebSecurity
public class AppConfigureSecurity extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authen() {
		DaoAuthenticationProvider daoProv=new DaoAuthenticationProvider();
		daoProv.setUserDetailsService(userDetailsService);
		daoProv.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return daoProv;
	}
	
	
	
	
	/*@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List <UserDetails> users=new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("asmaa").password("123").roles("USER").build());
		
		return new InMemoryUserDetailsManager(users);
	}*/


	
}
