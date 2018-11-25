package com.cc.core.transfer;

import javax.jws.*;
import javax.xml.ws.Endpoint;

import com.cc.core.transfer.TransferStub.ArrayOfstring;

@WebService
public class CoordinateConversionService {
		 
		public String[] CoordinateConversion(String coordinateX,String coordinateY){
			String[] result=null;
			try {
		    	TransferStub stub;
					stub = new TransferStub();
					 TransferStub.Transfer84To90 stubRv = new TransferStub.Transfer84To90();
				        stubRv.setY(coordinateX);
				        stubRv.setX(coordinateY);
				        ArrayOfstring rv = stub.transfer84To90(stubRv).getTransfer84To90Result();
				        result=rv.getString();
//				        java.lang.String ldX = rv.getString()[1];
//				        java.lang.String ldY = rv.getString()[0];
//				        System.out.println("coordinateX2===="+ldX+"----coordinateY2====="+ldY);
				} catch (Exception e) {
					e.printStackTrace();
				}
		return result;
		}
		public static void main(String[] args) {
			/**
			 *参数1：服务的发布地址
			 *参数2：服务的实现者
			 */
			Endpoint.publish("http://192.168.157.25:666/coordinateConversion",new CoordinateConversionService());
		}
		 
		}
