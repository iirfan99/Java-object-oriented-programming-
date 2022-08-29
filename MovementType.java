package com.labs.lab10;

public enum MovementType {
	WALK("walk"),
	RUN("run"),
	SWIM("swim"),
	JUMP("jump"),
	CRAWL("crawl");

	private String stringValue;

	MovementType(String stringValue){
		this.stringValue = stringValue;
	}

	public String getStringValue(){
		return this.stringValue;
	}
}
