package com.devsuperior.afanalises.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.afanalises.dto.SellerDTO;
import com.devsuperior.afanalises.entities.Seller;
import com.devsuperior.afanalises.repositories.SellerRepository;

@Service
public class SellerServices {
	@Autowired
	private SellerRepository repository;
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
