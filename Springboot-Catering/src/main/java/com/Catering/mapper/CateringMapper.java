package com.Catering.mapper;

import com.Catering.Dto.CateringDto;
import com.Catering.Entity.Catering;

public class CateringMapper {
	
	public static Catering maptoCatering(CateringDto cateringdto)
	{
		Catering catering =new Catering(
				cateringdto.getId(),
				cateringdto.getName(),
				cateringdto.getFoodType(),
				cateringdto.getLocation(),
				cateringdto.getContactNo(),
				cateringdto.getCreateAt(),
				cateringdto.getUpdateAt());
		
		return catering;
				
	}
	public static CateringDto maptoCateringDto(Catering catering)
	{
		CateringDto cateringdto=new CateringDto(
				catering.getId(),
				catering.getName(),
				catering.getFoodType(),
				catering.getLocation(),
				catering.getContactNo(),
				catering.getCreateAt(),
				catering.getUpdateAt());
		
		return cateringdto;
	}

}
