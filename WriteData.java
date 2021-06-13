package com.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;

public class WriteData {
	
	public static void main(String[] args) throws IOException {

		List<String[]> csvData = createCsvDataSimple();

		try (CSVWriter writer = new CSVWriter(new FileWriter("D:\\Bridgelab\\Data\\address.csv"))) {
			writer.writeAll(csvData);
		}
	}

	private static List<String[]> createCsvDataSimple() {
		String[] header = {"FirstName", "LastName", "City", "Pin", "State", "PhoneNumber"};
		String[] line1 = {"Nagesh", "Kolhe", "Nanded", "431602", "Maharashtra", "8007705205"};
		String[] line2 = {"Sumedh", "Neharkar", "Mumbai", "400708", "Maharashtra", "9923105462"};

		List<String[]> list = new ArrayList<>();
		list.add(header);
		list.add(line1);
		list.add(line2);
		System.out.println("Welcome to Csv file");
		return list;
	}
}
