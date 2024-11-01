package com.Catering.Entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name="tbl_Catering")
public class Catering {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="Catering_id")
	private Long id;
	
	@Column(name="Catering_name")
	private String name;
	
	@Column(name="FoodType")
	private String foodType;
	
	@Column(name="Catering_location")
	private String location;
	
	@Column(name="Cantactno")
	private Long contactNo;
	
	@CreationTimestamp
	@Column(name="CreateAt",nullable = false,updatable = false)
	private Date createAt;
	
	@UpdateTimestamp
	@Column(name="UpdateAt",nullable = false)
	private Date updateAt;

}
