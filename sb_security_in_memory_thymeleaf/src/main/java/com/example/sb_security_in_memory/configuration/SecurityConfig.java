package com.example.sb_security_in_memory.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("ansh").password("{noop}ansh").authorities("Employee");
		auth.inMemoryAuthentication().withUser("nikhil").password("{noop}nik").authorities("Teacher");
		auth.inMemoryAuthentication().withUser("rohini").password("{noop}roh").authorities("Management");
		auth.inMemoryAuthentication().withUser("shashank").password("{noop}sha").authorities("Admin");
	}

	protected void configure(HttpSecurity http) throws Exception {
		/* URL and access type */
		http.authorizeRequests().antMatchers("/home").permitAll().antMatchers("/welcome").authenticated()
				.antMatchers("/admin").hasAuthority("Admin").antMatchers("/emp").hasAuthority("Employee")
				.antMatchers("/teacher").hasAuthority("Teacher").antMatchers("/management").hasAuthority("Management")

				/* Login form details */
				.and().formLogin().defaultSuccessUrl("/welcome", true)

				/* Logout details */
				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

		/* Exception details */
		.and()
	}
}
