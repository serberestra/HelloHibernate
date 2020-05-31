package com.example.servlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.controller.RequestHelper;

@WebServlet("/api/*")
public class MasterServlet extends HttpServlet{

	private static final long serialVersionUID = 8843192743095604877L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServerException, IOException{
		RequestHelper.process(req, res);
	}

}
