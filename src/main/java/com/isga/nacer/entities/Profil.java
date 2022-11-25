package com.isga.nacer.entities;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;

import com.isga.nacer.model.Adress;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @Builder
public class Profil {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ElementCollection
	@OrderColumn
	private String[] noms;
	
	private String password, email, photo;
	
	@Embedded
	private Adress adress;
	
	private Sexe sexe;
	
	@OneToOne(mappedBy = "profil")//Profile Owned By user
	private User user;
}
