package com;
import com.Reader;
public class Conversion {
	
	static float convert(int averageIncome,String currency,float convertAvgIncome) {
	
		if(currency.equals("INR"))
		{
		convertAvgIncome=averageIncome/66;
		
		}
	else if(currency.equals("GBP"))
	{
		convertAvgIncome=(float) (averageIncome/0.67);
		
	}
	else if(currency.equals("SGD"))
	{
		convertAvgIncome=(float) (averageIncome/1.5);
	
	}
	else if(currency.equals("HKD"))
	{
		convertAvgIncome=averageIncome/8;
		
	}
	else if(currency.equals("USD"))
	{
		convertAvgIncome=averageIncome;
		
	}
		return convertAvgIncome;
	}
}
