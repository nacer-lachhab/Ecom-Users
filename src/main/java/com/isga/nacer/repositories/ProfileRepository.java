package com.isga.nacer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isga.nacer.entities.Profil;

@Repository
public interface ProfileRepository extends JpaRepository<Profil, Integer> {

}
