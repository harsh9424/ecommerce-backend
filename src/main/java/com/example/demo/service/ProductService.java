package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;

public interface ProductService {
	List<Product> getAllProduct();

}
