package com.ingramcontent.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Request implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String method;
	private java.lang.String response;

	public Request() {
	}

	public java.lang.String getMethod() {
		return this.method;
	}

	public void setMethod(java.lang.String method) {
		this.method = method;
	}

	public java.lang.String getResponse() {
		return this.response;
	}

	public void setResponse(java.lang.String response) {
		this.response = response;
	}

	public Request(java.lang.String method, java.lang.String response) {
		this.method = method;
		this.response = response;
	}

}