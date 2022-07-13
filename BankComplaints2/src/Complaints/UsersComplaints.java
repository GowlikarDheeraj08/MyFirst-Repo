package Complaints;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UsersComplaints {
	public static void main(String[] args) throws Exception  
	{ 
		try   
		{  
			
			
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\n 1 for complaints based on Date"
					+"\n 2 for complaints baded on branch");
			//int option=sc.nextInt();
			System.out.println("Enter details:");
			String in1=sc.nextLine();
			String line = "";  
			String splitBy = ",";  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader("D:\\eclipse java\\Demo data\\demo.csv"));  
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{  
		String[] employee = line.split(splitBy);    // use comma as separator  
		if(employee[2].equals(in1)) {
		System.out.println(" " + employee[0] + " " + employee[1] + " " + employee[2] + " " + employee[3] + " ");  
		} 
		}
		
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
		}  
//		
//		
		
	}


