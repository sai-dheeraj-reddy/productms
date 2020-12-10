package com.product.ProductMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.ProductMS.dto.ProductDTO;
import com.product.ProductMS.dto.SubscribedProductDTO;
import com.product.ProductMS.entity.Product;
import com.product.ProductMS.entity.SubscribedProduct;
import com.product.ProductMS.repository.ProductRepository;
import com.product.ProductMS.repository.SubscribedProductRepository;
import com.product.ProductMS.validator.ProductValidator;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
		
	@Autowired
	SubscribedProductRepository subscribedProductRepository;
	
	public String addProduct(ProductDTO productDTO) throws Exception {
		Product product = productDTO.createEntity();
		ProductValidator.ValidateProductForAdding(product);
		productRepository.save(product);
		return "Successfully added the product details";
	}
	public String removeProduct(Integer productId) {
		Optional<Product> optprod = productRepository.findById(productId);
		if (optprod.isPresent()) {
			productRepository.deleteById(productId);
			return "Successfully removed the product details";
		}
		return "Error while removing the product";
	}
	public List<ProductDTO> totalProductList(){
		List<Product> products = productRepository.findAll();
		List<ProductDTO> productDTOs = new ArrayList<>();
		for(Product product : products ) {
			ProductDTO productDTO = ProductDTO.valueOf(product);
			productDTOs.add(productDTO);
		}
		
		return productDTOs;
	}
	public List<ProductDTO> productListByCategoryAndName(String category, String productName){
		List<Product> products = productRepository.findByCategoryAndProductName(category, productName);
		List<ProductDTO> productDTOs = new ArrayList<>();
		for(Product product : products ) {
			ProductDTO productDTO = ProductDTO.valueOf(product);
			productDTOs.add(productDTO);
		}
		return productDTOs;
	}
	public String updateStockForProduct(Integer productId, Integer stock) {
		Optional<Product> optprod = productRepository.findById(productId);
		Product product = null;
		if (optprod.isPresent()) {
			product = optprod.get();
		}
		if(stock<10) {
			return "Stock should be more than 10 in quantity";
		}
		product.setStock(stock);
		productRepository.save(product);
		return "successful";
	}
	public List<SubscribedProductDTO> getSubscribeProducts(Integer buyerId){
		List<SubscribedProduct> subscribeProducts = subscribedProductRepository.findByBuyerId(buyerId);
		List<SubscribedProductDTO> subscribeProductDTOs = new ArrayList<>();
		for(SubscribedProduct subscribeProduct : subscribeProducts ) {
			SubscribedProductDTO subscribeProductDTO = SubscribedProductDTO.valueOf(subscribeProduct);
			subscribeProductDTOs.add(subscribeProductDTO);
		}
		return subscribeProductDTOs;
	}
	public String addSubscribedProduct(SubscribedProductDTO subscribedProductDTO) throws Exception {
		SubscribedProduct subscribedProduct = subscribedProductDTO.createEntity();
		subscribedProductRepository.save(subscribedProduct);
		return "Successfully added to subscribed products";
	}

}
