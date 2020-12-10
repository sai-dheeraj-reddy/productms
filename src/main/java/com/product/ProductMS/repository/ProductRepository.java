package com.product.ProductMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.ProductMS.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findBySellerId(Integer sellerId);

	List<Product> findByCategoryAndProductName(String category, String productName);

}

