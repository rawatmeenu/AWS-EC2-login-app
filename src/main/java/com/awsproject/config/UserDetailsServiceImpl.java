//package com.awsproject.config;
//
//import java.nio.file.attribute.UserPrincipalNotFoundException;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.awsproject.model.User;
//import com.awsproject.repository.UserRepository;
//
//public class UserDetailsServiceImpl  implements UserDetailsService{
//
//	
//	@Autowired
//	private UserRepository userrepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		//fetching user from DB
//	User user= 	userrepo.getUserbyUsername(username);
//	if(user==null)
//	{
//		throw  new UsernameNotFoundException("Username not found!");
//	}
//	
//CustomUserDetails customuserdetails= new CustomUserDetails(user);
//	return customuserdetails;
//
//	}
//	
//	
//
//}
