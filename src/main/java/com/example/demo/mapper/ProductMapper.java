package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;

@Mapper
public interface ProductMapper {
	ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    Product mapToEntity(ProductDto dto);
    
    Optional<ProductDto> mapToDto(Optional<Product> optional);
    	
    List<ProductDto> mapToDto(List<Product> entity);
}
