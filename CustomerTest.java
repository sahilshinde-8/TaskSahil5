package com.aurionpro.test;

import com.aurionpro.model.Customer;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Customer[] customers = {
				new Customer(10, "Sahil ", "sahilshinde@gmail.com", "123"),
				new Customer(20, "Amol ", "amolshinde@gmail.com", "321"),
				new Customer(30, "Abhilasha ", "abhlashashinde@gmail.com", "431"),
				new Customer(40, "Umaid ", "umaid@gmail.com", "999"),
				new Customer(50, "Sarvesh ", "sarvesh@gmail.com", "000"),
				new Customer(60, "Rohan ", "rohan@gmail.com", "888"),
				new Customer(70, "Hemant ", "hemant@gmail.com", "777"),
				new Customer(80, "Siddhant ", "siddhant@gmail.com", "666"),
				new Customer(90, "Shraddha", "shraddha@gmail.com", "555"),
				new Customer(100, "Suswar ", "suswar@gmail.com", "441"),		
		};*/
		Scanner sc = new Scanner(System.in);
		Customer[] customers = new Customer[10];
		for(int i=0; i<customers.length; i++) {
			customers[i].setId(sc.nextInt());
			System.out.println("\n");
			customers[i].setName(sc.next());
			System.out.println("\n");
			 String emails = sc.next();
			customers[i].setEmail(emails);
			if (emails.equals("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			System.out.println("\n");
			customers[i].setPassword(sc.next());
			System.out.println("\n");
			 }
			else {
			System.out.println("Invalid email format! Please try again.");
        }
		}
		for(Customer c: customers) {
			System.out.println("ID " + c.getId() + " Name " + c.getName() + " Email " + c.getEmail() + " Password " + c.getPassword()); 
		}
	}
	private static void sortCustomerAsc(Customer[] customers) {
		Customer temp = null;
		for(int i=0; i < customers.length-1; i++) {
			for(int j=i+1; j < customers.length; j++) {
				if (customers[i].getName().compareToIgnoreCase(customers[j].getName()) > 0){
					temp = customers[i];
					customers[i] = customers[j];
					customers[j] = temp;
				}
			}
		}
		//System.out.println(accounts);
		//System.out.println("***************");
	
	for(Customer c: customers) {
		System.out.println("ID " + c.getId() + " Name " + c.getName() + " Email " + c.getEmail() + " Password " + c.getPassword()); 
	
	}
	}
}
