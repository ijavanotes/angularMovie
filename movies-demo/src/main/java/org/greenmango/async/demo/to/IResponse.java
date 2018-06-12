package org.greenmango.async.demo.to;

public interface IResponse<T> {
 T getResponse();
 StatusTO getStatus();
}
