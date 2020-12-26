package com.example.demo.dto;

import com.example.demo.enums.ResponseType;

public class ResponseDto<T> {

  private ResponseType responseType;
  private String responseMsg;
  private String responseCode;
  private T data;
  private Object additionalData;

  public ResponseDto(T data) {
    this.data = data;
  }

  public ResponseDto(ResponseType responseType, String responseMsg, String responseCode) {
    this.responseType = responseType;
    this.responseMsg = responseMsg;
    this.responseCode = responseCode;
  }

public ResponseType getResponseType() {
	return responseType;
}

public void setResponseType(ResponseType responseType) {
	this.responseType = responseType;
}

public String getResponseMsg() {
	return responseMsg;
}

public void setResponseMsg(String responseMsg) {
	this.responseMsg = responseMsg;
}

public String getResponseCode() {
	return responseCode;
}

public void setResponseCode(String responseCode) {
	this.responseCode = responseCode;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

public Object getAdditionalData() {
	return additionalData;
}

public void setAdditionalData(Object additionalData) {
	this.additionalData = additionalData;
}
  
}
