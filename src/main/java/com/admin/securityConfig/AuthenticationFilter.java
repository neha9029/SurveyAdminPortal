package com.admin.securityConfig;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.modelRequest.Login;




public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter{

	private final AuthenticationManager authenticationManager;
	
	public AuthenticationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}
	
	
//	@Override
//	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res ) throws AuthenticationException {
//		
//		try {
//			Login creds = new ObjectMapper()
//					.readValue(req.getInputStream(), Login.class);
//			
//			return authenticationManager.authenticate(
//					new UsernamePasswordAuthenticationToken(
//							creds.getEmail(),
//							creds.getPassword()));
//		}
//		catch(IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, 
			FilterChain chain, Authentication auth) throws IOException, ServletException{
		
		String userName = ((User) auth.getPrincipal()).getUsername();


	}
}
