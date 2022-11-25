package com.isga.nacer.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Role {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String libelle;
	
	private Previlege previleges;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonManagedReference
	private Set<User> user;
}
