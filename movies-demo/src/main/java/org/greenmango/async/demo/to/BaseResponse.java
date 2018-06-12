package org.greenmango.async.demo.to;

public class BaseResponse<T> implements IResponse<T> {
private T response;
private StatusTO status;
	

	public T getResponse() {
		return response;
	}

	

	public StatusTO getStatus() {
		return status;
	}

	
	public BaseResponse(T response, StatusTO status) {
		this.response = response;
		this.status = status;
	}
	
	

}
