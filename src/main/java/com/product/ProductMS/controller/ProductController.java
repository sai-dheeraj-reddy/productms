package com.product.ProductMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.ProductMS.dto.ProductDTO;
import com.product.ProductMS.dto.SubscribedProductDTO;
import com.product.ProductMS.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value = "/product/addproduct")
	public String addProduct(@RequestBody ProductDTO productDTO) throws Exception {
		return productService.addProduct(productDTO);
	}
	@GetMapping(value = "/product/productId/{productId}")
	public String removeProduct(@PathVariable Integer productId) {
		return productService.removeProduct(productId);
	}
	@GetMapping(value = "/product/viewallproducts")
	public List<ProductDTO> viewAllProducts() {
		return productService.totalProductList();
	}
	@GetMapping(value = "/product/category/{category}/prodname/{productName}")
	public List<ProductDTO> viewProductsByCategoryAndProductName(@PathVariable("category") String category, @PathVariable("productName") String productName) {
		return productService.productListByCategoryAndName(category, productName);
	}
	@PostMapping(value = "/product/stockupdate")
	public String updateStockOfProduct(@RequestParam(name = "productid") Integer productId, @RequestParam(name = "stock") Integer stock) {
		return productService.updateStockForProduct(productId, stock);
	}
	@PostMapping(value = "/product/subscribedproducts")
	public String addSubscribedProduct(@RequestBody SubscribedProductDTO subscribedProductDTO) throws Exception {
		
		return productService.addSubscribedProduct(subscribedProductDTO);
	}
	@GetMapping(value = "/product/subscribedproducts/{buyerId}")
	public List<SubscribedProductDTO> viewSubscribedProductsOfBuyer(@PathVariable Integer buyerId){
		return productService.getSubscribeProducts(buyerId);
	}

}
