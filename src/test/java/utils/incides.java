package utils;

import org.testng.annotations.DataProvider;

public class incides {
	//using dataprovider and parameters in same time data mismatch error will come
	//if both presents dataprovider will have higher precedence 
	
	
	
	//indices will help to run particular set like if we have 10 set of data 
	//we want to run only particular set we use indices 
	//pass the index in indices
	
	//parallel -true all set of data will run parallel -condition method should have browser launch code
	@DataProvider(name = "webapp" ,indices = {1},parallel = true )
	public String[][] provider() {

		// for 2 rows and 2 column
		String[][] data_pro = new String[2][2];

		// first row data
		data_pro[0][0] = "koushik350@gmail.com";    //index 0
		data_pro[0][1] = "pass123$";

		// second row data
		data_pro[0][0] = "koushik350@gmail.com";    //index 1
		data_pro[0][1] = "pass123$";

		return data_pro;
	}
}
