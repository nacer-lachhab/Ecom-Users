package com.isga.nacer.dto.dtoRequests;

import java.util.Set;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
public class UserRequest {

	private String log;
	private int idProfile;
	private Set<Integer> listidRoles;
}
