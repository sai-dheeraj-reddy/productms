package com.product.ProductMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.ProductMS.entity.SubscribedProduct;

@Repository
public interface SubscribedProductRepository extends JpaRepository<SubscribedProduct, Integer>{

	List<SubscribedProduct> findByBuyerId(Integer buyerId);
	
}
