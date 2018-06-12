package org.greenmango.async.response;

public class ResponseTO {
private final String status;
private final String result;
public ResponseTO(String status, String result) {
	this.status = status;
	this.result = result;
}
public String getStatus() {
	return status;
}
public String getResult() {
	return result;
}


}
