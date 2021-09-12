package com.andremottfernandez.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.andremottfernandez.dsvendas.dto.SaleSucessDTO;
import com.andremottfernandez.dsvendas.dto.SaleSumDTO;
import com.andremottfernandez.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepositoryImplementation<Sale, Long> {

	@Query("SELECT new com.andremottfernandez.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.andremottfernandez.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();
	
}
