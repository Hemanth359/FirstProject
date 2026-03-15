package com.practice.FirstProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.FirstProject.entity.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

	
}
