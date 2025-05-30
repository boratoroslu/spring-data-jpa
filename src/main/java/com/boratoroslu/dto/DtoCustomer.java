package com.boratoroslu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoCustomer {

	private Long id;
	
	private String name;
	
	private DtoAddress address;
}
