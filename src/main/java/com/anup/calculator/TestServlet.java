package com.anup.calculator;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double num1=Double.parseDouble(request.getParameter("txt1"));
		double num2=Double.parseDouble(request.getParameter("txt2"));
		Calculator calc=new Calculator();
		
		double result;
		String operation=request.getParameter("op");
		//String op =request.getParameter("op");
		switch(operation) {
		case "Addition":
			result=calc.addition(num1, num2);
			break;
		case "Subtraction":
			result=calc.subtraction(num1,num2);
			break;
		case "multiplication":
			result=calc.multiply(num1, num2);
			break;
		case "division":
			result=calc.division(num1, num2);
			break;
			default:
				result=0.00;
		}
				
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>Calculator</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"      \r\n" + 
				"        <form action='test' method='get' name='frm'>\r\n" + 
				"        \r\n" + 
				"               Enter num1:\r\n" + 
				"               <input name='txt1' type='text' value='"+(num1)+"' /></br>\r\n" + 
				"            \r\n" + 
				"\r\n" + 
				"                Enter num2:\r\n" + 
				"               <input name='txt2' type='text'  value='"+(num2)+"' /></br>\r\n" + 
				"            \r\n" + 
				"           \r\n" + 
				"               Operator\r\n" + 
				"                \r\n" + 
				"                <select name='op'>\r\n" + 
				"                   \r\n" + 
				"                    <option value='Addition'>Addition</option>\r\n" + 
				"                    <option value='Subtraction'>Subtraction</option>\r\n" + 
				"                    <option value='multiplication'>multiplication</option>\r\n" + 
				"                    <option value='division'>division</option>\r\n" + 
				"                </select>\r\n</br>" + 
				"            \r\n" + 
				"                Result:\r\n" + 
				"               <input name='txt3' type='text'value='"+(result)+"' /></br>\r\n" + 
				"\r\n" + 
				"                <input type='submit' value='submit' />\r\n" + 
				"            \r\n" + 
				"        </form>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
