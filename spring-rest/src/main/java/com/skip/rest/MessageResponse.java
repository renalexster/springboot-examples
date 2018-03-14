package com.skip.rest;

public class MessageResponse {
	private String messageHeader;
	private String messageDetail;
	
	
	public MessageResponse() {
	}
	
	public MessageResponse(String messageHeader, String messageDetail) {
		super();
		this.messageHeader = messageHeader;
		this.messageDetail = messageDetail;
	}

	public MessageResponse(String messageHeader) {
		super();
		this.messageHeader = messageHeader;
	}
	public String getMessageHeader() {
		return messageHeader;
	}
	public void setMessageHeader(String messageHeader) {
		this.messageHeader = messageHeader;
	}
	public String getMessageDetail() {
		return messageDetail;
	}
	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}
}
