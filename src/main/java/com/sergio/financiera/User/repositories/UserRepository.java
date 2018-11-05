package com.sergio.financiera.User.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergio.financiera.User.models.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
