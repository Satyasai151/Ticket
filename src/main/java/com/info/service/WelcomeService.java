package com.info.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String getMessage() {
		String msg="welcome to satyasai";
		return msg;
	}

}
