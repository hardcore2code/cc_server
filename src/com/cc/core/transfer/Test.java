package com.cc.core.transfer;


import com.cc.core.transfer.TransferStub.ArrayOfstring;

public class Test {
	public static void main(String[] args) 
    {
		try {
    	java.lang.String coordinateX = "117.215232";
    	java.lang.String coordinateY = "39.111367";
    	TransferStub stub;
		
			stub = new TransferStub();
			 TransferStub.Transfer84To90 stubRv = new TransferStub.Transfer84To90();
		        System.out.println("coordinateX===="+coordinateX+"----coordinateY====="+coordinateY);
		        stubRv.setY(coordinateX);
		        stubRv.setX(coordinateY);
		        ArrayOfstring rv = stub.transfer84To90(stubRv).getTransfer84To90Result();
		        java.lang.String ldX = rv.getString()[1];
		        java.lang.String ldY = rv.getString()[0];
		        System.out.println("coordinateX2===="+ldX+"----coordinateY2====="+ldY);
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }
//	public static void main(String[] args) {
//		 TransferStub stub;
//		try {
//			stub = new TransferStub();
//			TransferStub.Transfer84To90 stubRv = new TransferStub.Transfer84To90();
//			stubRv.setY("117.215232");
//			stubRv.setX("39.111367");
//			ArrayOfstring rv = stub.transfer84To90(stubRv).getTransfer84To90Result();
//			java.lang.String ldX = rv.getString()[1];
//			java.lang.String ldY = rv.getString()[0];
//			System.out.println("coordinateX2===="+ldX+"----coordinateY2====="+ldY);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
