package com.Catering.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Catering.Dto.CateringDto;
import com.Catering.service.CateringService;
@RestController
@RequestMapping("/v1/api")
public class CateringController {
	@Autowired
	private CateringService getCateringService;
	@PostMapping("/Catering")
	public ResponseEntity<CateringDto> createCatering(@RequestBody CateringDto cateringdto)
	{
		return new ResponseEntity<CateringDto>(getCateringService.createCatering(cateringdto),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/{id}")
	public ResponseEntity<CateringDto> getCAteringbyId(@PathVariable Long id)
	{
		return new ResponseEntity<CateringDto>(getCateringService.getCateringbyid(id),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering")
	public ResponseEntity<List<CateringDto>> getAllCaterings()
	{
		return new ResponseEntity<List<CateringDto>>(getCateringService.getAllCatering(),HttpStatusCode.valueOf(200));
	}
	@PutMapping("/Catering/{id}")
	public ResponseEntity<CateringDto> updateCatering(@PathVariable Long id,@RequestBody  CateringDto cateringdto)
	{
		return new ResponseEntity<CateringDto>(getCateringService.updateCatering(id, cateringdto),HttpStatusCode.valueOf(200));
	}
	@DeleteMapping("/Catering/{id}")
	public ResponseEntity<String> DeleteCateringbyId(@PathVariable Long id)
	{
		getCateringService.DeleteCatering(id);
		return new ResponseEntity<String>("The Catering id "+id+" is Successfully Deleted",HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/findbylocation")
	public ResponseEntity <List<CateringDto>> getCateringByLocation(@RequestParam String loc )
	{
		return new ResponseEntity<List<CateringDto>>(getCateringService.getCateringByLocation(loc),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/findbyfoodtype")
	public ResponseEntity <List<CateringDto>> getCateringByFoodType(@RequestParam String type)
	{
		return new ResponseEntity<List<CateringDto>>(getCateringService.getCateringByFoodType(type),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/findbyname")
	public ResponseEntity <List<CateringDto>> getCateringByName(@RequestParam String name)
	{
		return new ResponseEntity<List<CateringDto>>(getCateringService.getCateringByName(name),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/findbynameandlocation")
	public ResponseEntity <List<CateringDto>> getCateringByNameAndLocation(@RequestParam String name,@RequestParam String loc)
	{
		return new ResponseEntity<List<CateringDto>>(getCateringService.getCateringByNameAndLocation(name, loc),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/findbypartialmatching")
	public ResponseEntity<List<CateringDto>> getControllerByPartialName(@RequestParam String partialName)
	{
		return new  ResponseEntity<List<CateringDto>>(getCateringService.getCateringByPartialName(partialName),HttpStatus.OK);
	}
	@GetMapping("/Catering/pagination")
	public ResponseEntity<List<CateringDto>> getCateringBySinglePage(@RequestParam int pageNo,@RequestParam int pageSize)
	{
		return new  ResponseEntity<List<CateringDto>>(getCateringService.getAllCatering(pageNo, pageSize),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/Catering/pageandsort")
	public ResponseEntity<List<CateringDto>> getAllCateringinpage(@RequestParam int pageNo,@RequestParam int pageSize,@RequestParam String columnName)
	{
		return new ResponseEntity<List<CateringDto>>(getCateringService.getAllCatering(pageNo, pageSize, columnName),HttpStatusCode.valueOf(200));
	}
}
