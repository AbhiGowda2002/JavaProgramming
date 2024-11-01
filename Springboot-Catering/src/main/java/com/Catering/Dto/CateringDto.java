package com.Catering.Dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CateringDto {

	
	private Long id;
	private String name;
	private String foodType;
	private String location;
	private Long contactNo;
	private Date createAt;
	private Date updateAt;
}
