package com.product.ProductMS.validator;

import com.product.ProductMS.entity.Product;

public class ProductValidator {
	public static void ValidateProductForAdding(Product product) throws Exception{
		if(!isValidProductName(product.getProductName())) {
			throw new Exception("Product Name is not Valid! It should contain words with spaces");	
		}
		if(! isValidProductDescription(product.getDescription())) {
			throw new Exception("Description should be below 500 characters");
		}
		if(!isValidQuantity(product.getStock())) {
			throw new Exception("Quantity should be more than 10");
		}
		if(!isValidImage(product.getImage())) {
			throw new Exception("Image format is not in jpeg or png");	
		}
	}
	public static Boolean isValidProductName(String productName){
		Boolean flag = false;
		if(!productName.matches("[ ]*") && productName.matches("[a-zA-Z ]*"))
			flag=true;
		return flag;
		
	}
	public static Boolean isValidProductDescription(String description){
		Boolean flag = false;
		if(! description.matches("[ ]*") && description.length()<500)
			flag=true;
		return flag;
		
	}
	public static Boolean isValidQuantity(Integer quantity){
		Boolean flag = false;
		if(quantity>=10)
			flag = true;
		return flag;
		
	}
	public static Boolean isValidImage(String image){
		Boolean flag = false;
		if(image.matches("^https?://(?:[a-z0-9\\-]+\\.)+[a-z]{2,6}(?:/[^/#?]+)+\\.(?:jpeg|png)$"))
			flag=true;
		return flag;
		
	}
}