package com.devsuperior.afanalises.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.afanalises.dto.SaleSuccessDTO;
import com.devsuperior.afanalises.dto.SaleSumDTO;
import com.devsuperior.afanalises.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	@Query("SELECT new com.devsuperior.afanalises.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+"FROM Sale AS obj GROUP  BY obj.seller")
	List<SaleSumDTO> AmountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.afanalises.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+"FROM Sale AS obj GROUP  BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
