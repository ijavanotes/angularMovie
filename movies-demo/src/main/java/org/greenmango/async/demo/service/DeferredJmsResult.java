package org.greenmango.async.demo.service;

import org.springframework.web.context.request.async.DeferredResult;

public class DeferredJmsResult<T> extends DeferredResult<T> {
	private final  Integer messageId;
    public DeferredJmsResult(Integer messageId) {
        this.messageId=messageId;
    }
	public Integer getMessageId() {
		return messageId;
	}
    
}
