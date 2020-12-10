package com.product.ProductMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name = "prodid", nullable = false)
	private Integer productId;
	@Column(name = "brand", nullable = false)
	private String brand;
	@Column(name = "category", nullable = false)
	private String category;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "image", nullable = false)
	private String image;
	@Column(name = "price", nullable = false)
	private Double price;
	@Column(name = "productname", nullable = false)
	private String productName;
	@Column(name = "rating", nullable = false)
	private Integer rating;
	@Column(name = "sellerid", nullable = false)
	private Integer sellerId;
	@Column(name = "stock", nullable = false)
	private Integer stock;
	@Column(name = "subcategory")
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
	public Product() {
		super();
	}
}