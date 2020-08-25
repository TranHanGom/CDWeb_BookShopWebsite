package com.cdweb.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cdweb.model.User;
import com.cdweb.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
