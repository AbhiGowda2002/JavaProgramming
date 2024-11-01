package com.Catering.tests;




import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.Catering.Dto.CateringDto;
import com.Catering.Entity.Catering;
import com.Catering.repository.CateringRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CateringUnitTestCases {
	
	
	@LocalServerPort
	private int port;
	
	private String baseURL="http://localhost";
	
	private static RestTemplate restTeamplate;
	
	@Autowired
	private CateringRepository cateringRepository;
	
	@BeforeAll
	public  static void initilization()
	{
		restTeamplate=new RestTemplate();
	}
	
	@BeforeEach
	public void Setup()
	{
		baseURL=baseURL+":"+port+"/v1/api/Catering";
	}
	
	@AfterEach
	public void tearDown()
	{
		cateringRepository.deleteAll();
	}
	@Test
	public void shouldcreateCateringtest()
	{
		Catering cat=new Catering();
		cat.setName("MadeshwaraCatering");
		cat.setFoodType("NonVeg");
		cat.setContactNo(Long.valueOf(998021));
		cat.setLocation("Bangalore");
				
		Catering newcatering=restTeamplate.postForObject(baseURL, cat, Catering.class);
		
		//Validation
		assertNotNull(newcatering);
		assertEquals("MadeshwaraCatering", newcatering.getName());
	}
	@Test
	public void ShouldDisplayAllCatering()
	{
		Catering cat=new Catering();
		cat.setName("MadeshwaraCatering");
		cat.setFoodType("NonVeg");
		cat.setContactNo(Long.valueOf(998021));
		cat.setLocation("Bangalore");
		
		Catering cat1=new Catering();
		cat1.setName("VenkateshwaraCatering");
		cat1.setFoodType("Veg");
		cat1.setContactNo(Long.valueOf(99802111));
		cat1.setLocation("BangaloreSouth");
		
		Catering newcatering=restTeamplate.postForObject(baseURL, cat, Catering.class);
		Catering newcatering1=restTeamplate.postForObject(baseURL, cat1, Catering.class);
		
		List<Catering> list=restTeamplate.getForObject(baseURL, List.class);
		
		//Validation
		assertNotNull(list);
		assertThat(list.size()).isEqualTo(2);
	}
	@Test
	public void SholudDisplayOneCatering()
	{
		Catering cat=new Catering();
		cat.setName("MadeshwaraCatering");
		cat.setFoodType("NonVeg");
		cat.setContactNo(Long.valueOf(998021));
		cat.setLocation("Bangalore");
		Catering MadeshwaraCatering=restTeamplate.postForObject(baseURL, cat, Catering.class);
		
		Catering exestingcatering=restTeamplate.getForObject(baseURL+"/"+MadeshwaraCatering.getId(), Catering.class);
		
		//Validation
		assertNotNull(exestingcatering);
		assertEquals("MadeshwaraCatering", exestingcatering.getName());
		
	}
	@Test
	public void SholudUpdateCatering()
	{
		Catering cat=new Catering();
		cat.setName("MadeshwaraCatering");
		cat.setFoodType("NonVeg");
		cat.setContactNo(Long.valueOf(998021));
		cat.setLocation("Bangalore");
		Catering MadeshwaraCatering=restTeamplate.postForObject(baseURL, cat, Catering.class);
		
		MadeshwaraCatering.setName("MM Caterings");
		
		restTeamplate.put(baseURL+"/"+MadeshwaraCatering.getId(), MadeshwaraCatering, Catering.class);
		
		//validation
		assertEquals("MM Caterings",MadeshwaraCatering.getName());
	}
	@Test
	public void SholudDeleteCatering()
	{
		Catering cat=new Catering();
		cat.setName("MadeshwaraCatering");
		cat.setFoodType("NonVeg");
		cat.setContactNo(Long.valueOf(998021));
		cat.setLocation("Bangalore");
		Catering MadeshwaraCatering=restTeamplate.postForObject(baseURL, cat, Catering.class);
		
		restTeamplate.delete(baseURL+"/"+MadeshwaraCatering.getId());
		//validation
		assertThat(cateringRepository.findAll().size()).isEqualTo(0);
	}

}
