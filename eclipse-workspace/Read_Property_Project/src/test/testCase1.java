package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testCase1 {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("\\Macintosh HD\\Users\\jdakshini\\eclipse-workspace\\Read_Property_Project\\src\\Config\\object.properties");
		//FileInputStream fis = new FileInputStream("/Users/jdakshini/eclipse-workspace/Read_Property_Project/src/Config/object.properties/");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/Config/object.properties/");
		prop.load(fis);
		
		
		
		System.out.println("name is "+ prop.getProperty("name"));
		System.out.println("age is "+prop.getProperty("age"));
		System.out.println(System.getProperty("user.dir"));
		
	}

}