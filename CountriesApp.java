package com.readWriteProject;

import java.io.*;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp extends ReadandWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean wantToPlay = false;
		
		System.out.println("Welcome to the Country List Program.");
		
		do{
			wantToPlay = false;
		
		System.out.println("Please make a selection from the menu below \n"
				+ "1. Show the Countries List \n"
				+ "2. Add to the Countries List \n"
				+ "3. Delete a Country from the List \n"
				+ "4. Exit the Country List Application");	
		Scanner sc = new Scanner(System.in);
		
		String menuOption = sc.nextLine();
			if (menuOption.equals("1")){
				showCountry();
			}
			else if (menuOption.equals("2")){
				addCountry();
			}else if (menuOption.equals("3")){
	//			delete();
				System.out.println("You do not have the nuclear capabilities to delete a country, please make another selection");
			}else if(menuOption.equals("4")){
				System.out.println("Thank you for playing?");
				System.exit(0);
			}else 
				System.out.println("Please make a valid menu selection 1,2,3 or 4");
			wantToPlay = true;
			}while (wantToPlay);
			
	
			

		
		
			
			
			
			
			
			
			
			
			
			
			
		
	}  //main

	private static void deleteCountry() {
		// TODO Auto-generated method stub
		
	}

	private static void addcountry() {
		// TODO Auto-generated method stub
		
	}

	private static boolean menuOption(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	 
}  //class
