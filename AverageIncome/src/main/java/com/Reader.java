package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	 String city,country;
	static String currency;
	String gender;
	 static int averageIncome;
	float avgIncome;
	
    public List<Income> Read(String filename) {
    	List<Income> Data = new ArrayList<Income>();

        String csvFile = "src/main/resources/Sample_input.csv";
        String line = "";
        String csvSplitBy = ",";
        String[] data;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

               
                 data = line.split(csvSplitBy);
               
				 city=data[0];
				
				 country=data[1];
				 
				 gender=data[2];
				 
				 currency=data[3];
				 
				 averageIncome=Integer.parseInt(data[4]);
				 
				 avgIncome = Conversion.convert(averageIncome,currency,avgIncome);
			 
				 Data.add(new Income(city,country,gender,currency,avgIncome));
               //Data stores the converted average income and the whole data
//				 System.out.println(Data);
            }
           
            System.out.println(Data);
//			return Data;
 
        } catch (IOException e) {
            e.printStackTrace();
        }
       
		return Data;
	
}
}

