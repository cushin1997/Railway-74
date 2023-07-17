package com.vti.ultis;

import java.util.Scanner;

public class ScannerUltis {
	
	 
	    private static Scanner scanner = new Scanner(System.in);

	    public static String inputString() {
	        String name;
	        do {
	           
	            name = scanner.nextLine();
	            if (name.matches(".*\\d.*")) {
	                System.out.println("Vui lòng không nhập số. Hãy nhập lại.");
	            }
	        } while (name.matches(".*\\d.*"));
	        return name;
	    }
	

	    public static int inputInt() {
	      
	        while (!scanner.hasNextInt()) {
	            scanner.next();
	            System.out.println("Vui lòng nhập một số nguyên. Hãy nhập lại.");
	           
	        }
	        int number = scanner.nextInt();
	        scanner.nextLine(); // Đọc dòng trống sau khi nhập số
	        return number;
	    }
	}


