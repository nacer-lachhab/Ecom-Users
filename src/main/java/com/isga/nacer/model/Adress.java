package com.isga.nacer.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
public class Adress {
	
	private String rue, ville, pays;
	private int codePostal;
}
