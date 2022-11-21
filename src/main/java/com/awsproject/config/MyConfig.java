package com.awsproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter  {
	
//	@Bean
//	public UserDetailsService getUserDetailsService() {
//		return new UserDetailsServiceImpl();
//	}
//	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
//	
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider daoauthenticationProvider= new DaoAuthenticationProvider();
//		daoauthenticationProvider.setUserDetailsService(this.getUserDetailsService());
//		daoauthenticationProvider.setPasswordEncoder(passwordEncoder());
//		
//		return  daoauthenticationProvider;
//	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//	//	auth.inMemoryAuthentication(inMemo);
//
//	}
	



	protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().antMatchers("/user/**", "/login/**", "/js/**","/css/**", "/img/**","/base/**").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.permitAll()
			.and()
			.logout()
			.invalidateHttpSession(true)
			.clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login?logout")
			.permitAll();
		
	}
	
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//	      auth
//	         .inMemoryAuthentication()
//	         .withUser("username").password("password").roles("USER");
//	   }
	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//	    http.csrf()
//	      .disable()
//	      .authorizeRequests()
//	      .antMatchers("/admin/**")
//	      .hasAnyRole("ADMIN")
//	      .antMatchers("/user/**")
//	      .hasAnyRole("USER", "ADMIN")
//	      .antMatchers("/login/**")
//	      .anonymous()
//	      .anyRequest()
//	      .authenticated()
//	      .and()
//	      .httpBasic()
//	      .and()
//	      .sessionManagement()
//	      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//	    return http.build();
//	}
//	
	
	//configure method
	

}
