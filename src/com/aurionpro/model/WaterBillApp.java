package com.aurionpro.model;
import java.util.*;
public class WaterBillApp {
		
		private int units;
		private static int metercharge=75;
		private static int charge=0;
		private static int totalwaterbill;
		
		public int waterBillCalculator(int units)
		{
		if(units<=100)
		{
		 charge=units*5;
		 totalwaterbill=charge+metercharge;
		}
		if(units<=250)
		{
			charge=units*10;
			totalwaterbill=charge+metercharge;
		}
		else 
		{
			charge=units*20;
			totalwaterbill=charge+metercharge;
		}
		totalwaterbill=charge+metercharge;
		return totalwaterbill;

		}
}
	

