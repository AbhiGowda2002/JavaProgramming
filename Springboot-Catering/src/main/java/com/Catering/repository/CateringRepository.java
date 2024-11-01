package com.Catering.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.Catering.Entity.Catering;

public interface CateringRepository extends JpaRepository<Catering, Long>, PagingAndSortingRepository<Catering, Long>{
	
	List<Catering> findByLocation(String loc);
	
	List<Catering> findByFoodType(String type );
	
	List<Catering> findByName(String name);
	
	List<Catering> findByNameAndLocation(String name,String loc);
	
	List<Catering> findByNameContaining(String partialName);
	
	

}
