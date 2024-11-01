package com.Catering.ServiceImp;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.Catering.Dto.CateringDto;
import com.Catering.Entity.Catering;
import com.Catering.mapper.CateringMapper;
import com.Catering.repository.CateringRepository;
import com.Catering.service.CateringService;
@Service
public class CateringServiceImp implements CateringService{

	@Autowired
	private CateringRepository getcateringRepository;
	@Override
	public CateringDto createCatering(CateringDto cateringdto) {
		
		Catering catering=CateringMapper.maptoCatering(cateringdto);
		Catering savecatering=getcateringRepository.save(catering);
		return CateringMapper.maptoCateringDto(savecatering);
	}
	@Override
	public CateringDto getCateringbyid(Long id) {
	Catering catering=	getcateringRepository.findById(id).orElseThrow(()->
		new RuntimeException("The Catering id"+id+" is not avalilable "));
		return CateringMapper.maptoCateringDto(catering);
	}
	@Override
	public List<CateringDto> getAllCatering() {
		return getcateringRepository.findAll()
				.stream().map((catering)->CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
		
	}
	@Override
	public CateringDto updateCatering(Long id,CateringDto cateringdto) {
		Catering exestingCatering=getcateringRepository.findById(id).orElseThrow(()->
		new RuntimeException("The catering id"+id+" is not available "));
		
		exestingCatering.setContactNo(cateringdto.getContactNo());
		exestingCatering.setFoodType(cateringdto.getFoodType());
		exestingCatering.setId(id);
		exestingCatering.setName(cateringdto.getName());
		exestingCatering.setLocation(cateringdto.getLocation());
		
		Catering saveCatering=getcateringRepository.save(exestingCatering);
		return CateringMapper.maptoCateringDto(saveCatering);
		
		
	}
	@Override
	public void DeleteCatering(Long id) {
		getcateringRepository.findById(id).orElseThrow(()->
		new RuntimeException("The Catering id "+id+" is not available in the database"));
		
		 getcateringRepository.deleteById(id);
		
	}
	@Override
	public List<CateringDto> getCateringByLocation(String loc) {
		
		return getcateringRepository.findByLocation(loc)
				.stream().map((catering)-> CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getCateringByFoodType(String type) {
		
		return getcateringRepository.findByFoodType(type)
				.stream().map((catering)-> CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getCateringByName(String name) {
		
		return getcateringRepository.findByName(name)
				.stream().map((catering)-> CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getCateringByNameAndLocation(String name, String loc) {
		return getcateringRepository.findByNameAndLocation(name, loc)
				.stream().map((catering)->CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getCateringByPartialName(String partialName) {
		
		return getcateringRepository.findByNameContaining(partialName)
				.stream().map((catering)->CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getAllCatering(int pageNo, int pageSize) {
		
	 
				Pageable pages= PageRequest.of(pageNo, pageSize);
				return getcateringRepository.findAll(pages).stream().map((catering)->CateringMapper.maptoCateringDto(catering))
						.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getAllCatering(int pageNo, int pageSize, String columnName) {
		Sort sort=Sort.by(Direction.ASC,columnName);
		Pageable page =PageRequest.of(pageNo, pageSize,sort);
		return getcateringRepository.findAll(page).stream().map((catering)->CateringMapper.maptoCateringDto(catering))
				.collect(Collectors.toList());
		
		
	}
	
	

}
