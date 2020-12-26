package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCT")
public class Product{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "PRODUCT_ID")
  private long productId;

  @Column(name = "PRODUCT_NAME")
  private String productNm;
  
  public long getProductId() {
	return productId;
}

public void setProductId(long productId) {
	this.productId = productId;
}

public String getProductNm() {
	return productNm;
}

public void setProductNm(String productNm) {
	this.productNm = productNm;
}

public String getProductDesc() {
	return productDesc;
}

public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}

@Column(name = "PRODUCT_DESCRIPTION")
  private String productDesc;

}
