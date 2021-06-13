package com.csv;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVdata {
	
	public static void main(String args[]) throws Exception {
	    
	      CSVWriter writer = new CSVWriter(new FileWriter("D:\\Bridgelab\\Data\\address.csv"));

	      List<String[]> list = new ArrayList<String[]>();
	      String header[] = {"FirstName", "LastName", "City", "Pin", "State", "PhoneNumber"};
	      String line2[] = {"Nagesh", "Kolhe", "Nanded", "431602", "Maharashtra", "8007705205"};
	      String line3[] = {"Sumedh", "Neharkar", "Mumbai", "400708", "Maharashtra", "9923148462"};
	      String line4[] = {"Shruti", "Patil", "Nanded", "489708", "Maharashtra", "9923105463"};
	      String line5[] = {"Mahesh", "Niraja", "Mumbai", "400708", "Maharashtra", "9923105472"};
	      
	      list.add(header);
	      list.add(line2);
	      list.add(line3);
	      list.add(line4);
	      list.add(line5);
	    
	      writer.writeAll(list);
	      writer.flush();
	      System.out.println("Data entered");
	   }
}
