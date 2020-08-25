package com.cnpm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter;

import com.cnpm.service.UserService;

@EnableWebSecurity
@Configuration

public class CustomerSecurity extends WebSecurityConfigurerAdapter{
	@Autowired
	private UserService userService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable();
		http.antMatcher("/user/**")
			.authorizeRequests()
			.antMatchers("/user/**").access("hasRole('ROLE_USER')")
			.and()
			.formLogin().loginPage("/user-panel")
			.loginProcessingUrl("/user/login")
			.defaultSuccessUrl("/user-panel/welcome")
			.failureUrl("/user-panel/login?error")
			.usernameParameter("username").passwordParameter("password")
			.and()
			.logout()
			.logoutUrl("/user-panel/process-logout")
			.logoutSuccessUrl("index/login?logout")
			.deleteCookies("JSESSIONID")
			.and()
			.exceptionHandling().accessDeniedPage("user-panel/accessDenied");
			
	}
	
	@Autowired
	public void configGlobal(AuthenticationManagerBuilder builder) throws Exception{
		builder.userDetailsService(userService);
		
	}
	@Bean
	public BCryptPasswordEncoder encode() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SecurityContextHolderAwareRequestFilter awareRequestFilter() {
		return new SecurityContextHolderAwareRequestFilter();
	}
	@Bean
	public SecurityContextPersistenceFilter persistenceFilter() {
		return new SecurityContextPersistenceFilter();
	}
	

}
