package com.Catering.service;

import java.util.List;

import com.Catering.Dto.CateringDto;

public interface CateringService {

	
	CateringDto createCatering(CateringDto cateringdto);
	
	CateringDto getCateringbyid(Long id);
	
	List<CateringDto> getAllCatering();
	
	
	
	CateringDto updateCatering(Long id,CateringDto cateringdto);
	
	void DeleteCatering (Long id);
	
	List<CateringDto> getCateringByLocation(String loc);
	
	List<CateringDto> getCateringByFoodType(String type);
	
	List<CateringDto> getCateringByName(String name);
	
	List<CateringDto> getCateringByNameAndLocation(String name,String loc);
	
	List<CateringDto> getCateringByPartialName(String partialName);
	
	List<CateringDto> getAllCatering(int pageNo,int pageSize);
	
	List<CateringDto> getAllCatering(int pageNo,int pageSize,String columnName);
	
	
	
}
