package com.isga.nacer.dto.dtoRequests;

import com.isga.nacer.entities.Profil;
import com.isga.nacer.entities.Sexe;
import com.isga.nacer.entities.User;
import com.isga.nacer.model.Adress;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class ProfileRequest {
	
	private String[] noms;
	private String password, email, photo;
	private Adress adress;
	private Sexe sexe;
	private int idUser;
}
