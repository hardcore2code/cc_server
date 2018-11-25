package com.cc.core.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.core.transfer.TransferStub;
import com.cc.core.transfer.TransferStub.ArrayOfstring;

public class CcServlet extends HttpServlet {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 重写doGet方法 */
	     @Override
	     protected void doGet(HttpServletRequest request, HttpServletResponse response)
	             throws ServletException, IOException {
	         System.out.println("处理get请求。。。");
	         this.doPost(request, response);
	     }
	 
	     /** 重写doPost方法 */
	     @Override
	     protected void doPost(HttpServletRequest request, HttpServletResponse response)
	             throws ServletException, IOException {
	         System.out.println("处理post请求。。。");
	         String ldx="";
	         String ldy="";
	         try {
	        	 String coordinateX = request.getParameter("x");
	        	 String coordinateY = request.getParameter("y");
	         	TransferStub stub;
	     		
	     			stub = new TransferStub();
	     			 TransferStub.Transfer84To90 stubRv = new TransferStub.Transfer84To90();
	     		        System.out.println("coordinateX===="+coordinateX+"----coordinateY====="+coordinateY);
	     		        stubRv.setY(coordinateY);
	     		        stubRv.setX(coordinateX);
	     		        ArrayOfstring rv = stub.transfer84To90(stubRv).getTransfer84To90Result();
	     		        ldx = rv.getString()[1];
	     		        ldy = rv.getString()[0];
	     		        System.out.println("coordinateX2===="+ldx+"----coordinateY2====="+ldy);
	     		} catch (Exception e) {
	     			e.printStackTrace();
	     		}
	         PrintWriter out = response.getWriter();
	         out.println("{\"longitude\":"+ldy+",\"latitude\":"+ldx+"}");
	     }
}
