package javaBasics;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

 CustomerDetails c = new
CustomerDetails("Sample","Sample",123456789,"Sample",12.00,13.00);
 System.out.println("Enter Customer Id");
 c.setCustomerId(sc.nextLine());
 System.out.println("Enter Customer Name");
 c.setCustomerName(sc.nextLine());
 System.out.println("Enter Phone Number");
 c.setPhoneNumber(sc.nextLong());
 System.out.println("Enter City");
 c.setCity(sc.next());
 System.out.println("Enter Units Consumed");
 c.setUnitsConsumed(sc.nextDouble());
 System.out.println("Enter Cost per Units");
 c.setCostPerUnit(sc.nextDouble());
 double amount=c.calculateElectricityBill();
 //System.out.printf("Amount to be paid is Rs.%.2f",amount);
 
 System.out.println("amount to be paid is"+amount);
 
}
}