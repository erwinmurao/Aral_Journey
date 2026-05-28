package com.crud.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.springboot_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    //all crud database methods are implemented by JpaRepository

}
