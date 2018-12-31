package com.ankita.main.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyUtil {

	@Value("${user.post-user-url}")
	private String getCreateUserURL;

	public String getGetCreateUserURL() {
		return getCreateUserURL;
	}

	public void setGetCreateUserURL(String getCreateUserURL) {
		this.getCreateUserURL = getCreateUserURL;
	}

	@Override
	public String toString() {
		return "PropertyUtil [getCreateUserURL=" + getCreateUserURL + "]";
	}
	
	
}
