package com.product.ProductMS.dto;

import com.product.ProductMS.entity.Product;

public class ProductDTO {
	private Integer productId;
	private String brand;
	private String category;
	private String description;
	private String image;
	private Double price;
	private String productName;
	private Integer rating;
	private Integer sellerId;
	private Integer stock;
	private String subcategory;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public ProductDTO() {
		super();
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", brand=" + brand + ", category=" + category + ", description="
				+ description + ", image=" + image + ", price=" + price + ", productName=" + productName + ", rating="
				+ rating + ", sellerId=" + sellerId + ", stock=" + stock + ", subcategory=" + subcategory + "]";
	}
	
	public static ProductDTO valueOf(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setBrand(product.getBrand());
		productDTO.setCategory(product.getCategory());
		productDTO.setDescription(product.getDescription());
		productDTO.setImage(product.getImage());
		productDTO.setPrice(product.getPrice());
		productDTO.setProductId(product.getProductId());
		productDTO.setProductName(product.getProductName());
		productDTO.setRating(product.getRating());
		productDTO.setSellerId(product.getSellerId());
		productDTO.setStock(product.getStock());
		productDTO.setSubcategory(product.getSubcategory());
		return productDTO;
	}
	
	public Product createEntity() {
		Product product = new Product();
		product.setBrand(this.getBrand());
		product.setCategory(this.getCategory());
		product.setDescription(this.getDescription());
		product.setImage(this.getImage());
		product.setPrice(this.getPrice());
		product.setProductId(this.getProductId());
		product.setProductName(this.getProductName());
		product.setRating(this.getRating());
		product.setSellerId(this.getSellerId());
		product.setStock(this.getStock());
		product.setSubcategory(this.getSubcategory());		
		return product;
	}

	
	

}