package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.WaterBillApp;
public class WaterBillTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WaterBillApp obj = new WaterBillApp();
		
		System.out.println("WELCOME TO WATER BILL CALCULATOR ! ");
		System.out.println("enter your units : ");
		int units1 = sc.nextInt();
		
		int totalbill = obj.waterBillCalculator(units1);
		System.out.println("total water bill is :"+totalbill);
	}

}