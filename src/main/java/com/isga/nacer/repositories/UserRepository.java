package com.isga.nacer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isga.nacer.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
