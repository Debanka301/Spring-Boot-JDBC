package com.springboothtml.springboothtml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboothtml.springboothtml.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>{

}
