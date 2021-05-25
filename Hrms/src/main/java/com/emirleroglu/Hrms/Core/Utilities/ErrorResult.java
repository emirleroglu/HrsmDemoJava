package com.emirleroglu.Hrms.Core.Utilities;

public class ErrorResult extends Result {

	public ErrorResult(String message) {
		super(false, message);
		
	}
	
	public ErrorResult() {
		super(false);
	}

}
