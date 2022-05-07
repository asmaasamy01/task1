package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Users, Double> {

	Users findByUserName(String userName);
}
