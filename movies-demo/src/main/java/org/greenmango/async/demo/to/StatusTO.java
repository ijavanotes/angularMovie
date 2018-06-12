package org.greenmango.async.demo.to;

public class StatusTO {
private int code;
private String descriptions;
public StatusTO(int code, String descriptions) {
	this.code = code;
	this.descriptions = descriptions;
}
public int getCode() {
	return code;
}
public String getDescriptions() {
	return descriptions;
}

}
