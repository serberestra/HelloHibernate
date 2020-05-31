package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.PlanetDao;
import com.example.model.Planet;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoController {

	
	public static void demo(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PlanetDao pdao = new PlanetDao();
		PrintWriter out = res.getWriter();
		
		ObjectMapper mapper = new ObjectMapper();
			
		pdao.insert(new Planet(0, "Earth", "Bit Blue"));
		pdao.insert(new Planet(0, "Mars", "Bit Red"));
		pdao.insert(new Planet(0, "Mercury", null));
		
		String json = "{\"status\":\"ok\", \"planet1\":" + mapper.writeValueAsString(pdao.selectByName("Earth")) + "}";
		System.out.println(json);
		
		out.write(json);
		
//		System.out.println(pdao.selectByName("Earth"));
//		System.out.println(pdao.selectByName("Mars"));
//		System.out.println(pdao.selectByName("Mercury"));
		
	}

}
