package com;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    StringBuffer strbTest = new StringBuffer();
        long len = 0;
        try {
            System.out.println("Wait.... til number not generated.");

            while(true) {
                strbTest.append("a");
                len++;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Max length on your system is "+len);
            System.out.println("Error");
        }
        System.out.println("End");
	}

}
