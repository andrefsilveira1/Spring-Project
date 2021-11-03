package com.devsuperior.afanalises.dto;

import java.io.Serializable;

import com.devsuperior.afanalises.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String SellerName;
	private Long visited;
	private Long deals;
	private Double sum;
	
	public SaleSuccessDTO() {
	}
	

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		super();
		SellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}


	public SaleSuccessDTO(Seller seller, Double sum) {
		SellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}


	public Long getVisited() {
		return visited;
	}


	public void setVisited(Long visited) {
		this.visited = visited;
	}


	public Long getDeals() {
		return deals;
	}


	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
}
