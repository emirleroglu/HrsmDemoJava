package com.emirleroglu.Hrms.Core.Utilities;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(String message, T data) {
		super(true, message, data);

	}

	public SuccessDataResult(T data) {
		super(data, true);

	}

	public SuccessDataResult() {
		super(null, true);
	}

	public SuccessDataResult(String message) {
		super(true, message, null);

	}

}
