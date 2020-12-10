package com.product.ProductMS.dto;

import com.product.ProductMS.entity.SubscribedProduct;

public class SubscribedProductDTO {
	private Integer subscribedId;
	private Integer buyerId;
	private Integer productId;
	private ProductDTO productDTO;
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
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
	public SubscribedProductDTO() {
		super();
	}
	
	@Override
	public String toString() {
		return "SubscribedProductDTO [subscribedId=" + subscribedId + ", buyerId=" + buyerId + ", productId="
				+ productId + ", productDTO=" + productDTO + ", quantity=" + quantity + "]";
	}
	public static SubscribedProductDTO valueOf(SubscribedProduct subscribedProduct) {
		SubscribedProductDTO subscribeProductDTO = new SubscribedProductDTO();
		subscribeProductDTO.setBuyerId(subscribedProduct.getBuyerId());
		subscribeProductDTO.setProductId(subscribedProduct.getProductId());
		subscribeProductDTO.setQuantity(subscribedProduct.getQuantity());
		subscribeProductDTO.setSubscribedId(subscribedProduct.getSubscribedId());
		return subscribeProductDTO;
	}
	public SubscribedProduct createEntity() {
		SubscribedProduct scrbProduct = new SubscribedProduct();
		scrbProduct.setBuyerId(this.getBuyerId());
		scrbProduct.setProductId(this.getProductId());
		scrbProduct.setQuantity(this.getQuantity());
		scrbProduct.setSubscribedId(this.getSubscribedId());
		return scrbProduct;
	}

}
