package com.product.ProductMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribedproduct")
public class SubscribedProduct {
	@Id
	@Column(name = "subid", nullable = false)
	private Integer subscribedId;
	@Column(name = "buyerid", nullable = false)
	private Integer buyerId;
	@Column(name = "prodid", nullable = false)
	private Integer productId;
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
	public Integer getSubscribedId() {
		return subscribedId;
	}
	public void setSubscribedId(Integer subscribedId) {
		this.subscribedId = subscribedId;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public SubscribedProduct() {
		super();
	}
	

}
