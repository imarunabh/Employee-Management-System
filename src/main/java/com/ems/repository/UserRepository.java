package com.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findFirstByEmail(String email);

}
