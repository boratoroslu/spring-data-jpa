package com.boratoroslu.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DtoStudentIU {
	
	@NotEmpty(message = "Firstname alanı boş Bırakılamaz!")
	private String firstName;
	
	@NotEmpty(message = "Lastname alanı boş Bırakılamaz!")
	private String lastName;
	
	@NotEmpty(message = "Doğumtarihi alanı boş Bırakılamaz!")
	private Date birthOfDate;
	
	

}
