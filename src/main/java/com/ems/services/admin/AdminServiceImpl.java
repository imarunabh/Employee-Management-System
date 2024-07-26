package com.ems.services.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ems.entities.User;
import com.ems.enums.UserRole;
import com.ems.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Service
public class AdminServiceImpl {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostConstruct
	public void createUserAccount() {
		User user = new User();
		user.setEmail("admin@test.com");
		user.setName("admin");
		user.setRole(UserRole.ADMIN);
		user.setPassword(new BCryptPasswordEncoder().encode("admin"));
		userRepository.save(user);
	}

}
