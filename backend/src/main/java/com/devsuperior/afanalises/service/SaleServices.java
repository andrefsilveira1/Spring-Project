package com.devsuperior.afanalises.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.afanalises.dto.SaleDTO;
import com.devsuperior.afanalises.dto.SaleSuccessDTO;
import com.devsuperior.afanalises.dto.SaleSumDTO;
import com.devsuperior.afanalises.entities.Sale;
import com.devsuperior.afanalises.repositories.SaleRepository;
import com.devsuperior.afanalises.repositories.SellerRepository;

@Service
public class SaleServices {
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	@Transactional(readOnly = true)
	public List<SaleSumDTO> AmountGroupedBySeller(){
		return repository.AmountGroupedBySeller();
	}
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
}
