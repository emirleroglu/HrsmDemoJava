package com.emirleroglu.Hrms.Core.Utilities;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(String message, T data) {
		super(false, message, data);
		// TODO Auto-generated constructor stub
	}
	public ErrorDataResult(String message) {
		super(false,message,null);
	}
	public ErrorDataResult(T data) {
		super(data,false);
	}
	public ErrorDataResult() {
		super(null , false);
	}

}
