package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static void process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		System.out.println(req.getPathInfo());
		
		if(req.getPathInfo().equals("/demo")) {
			DemoController.demo(req, res);
		}else {
			System.out.println("ERROR");
		}
		

	}

}
