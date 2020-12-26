package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.entity.Product;
import com.example.demo.enums.ResponseType;
import com.example.demo.service.ProductService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	private ProductService productService;
	  
	public ProductController(ProductService productService) {
		  this.productService = productService;
	}
	
	@GetMapping("/products")
	public ResponseDto<List<Product>> getAllProducts() {
		List<Product> productList = new ArrayList<>();
		productList = productService.getAllProduct();
		ResponseDto<List<Product>> res = new ResponseDto<List<Product>>(productList);
		if(productList != null) {
			res.setResponseCode("200");
			res.setResponseType(ResponseType.SUCCESS);
		}
	    return res;
	  }

}
