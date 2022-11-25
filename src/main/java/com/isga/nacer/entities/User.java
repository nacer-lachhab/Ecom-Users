package com.isga.nacer.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @Builder
@NoArgsConstructor @AllArgsConstructor
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String log;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profil_id")//User is the owner
	private Profil profil;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "user")
	@JsonBackReference
	private Set<Role> roles;
}
