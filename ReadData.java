package com.csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args){

		String path = "D:\\Bridgelabz\\Data\\address.csv";
		String line = " ";
		{
			try 
			{
				BufferedReader Reader = new BufferedReader(new FileReader(path));

				while((line = Reader.readLine()) != null) {
					System.out.println(line);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
}
