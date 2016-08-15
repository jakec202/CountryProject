package com.readWriteProject;

import java.io.*;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadandWrite {

	static ArrayList<String> countryList = new ArrayList<>();
	static Path countryPath = Paths.get("\\Users\\admin\\Desktop\\Countries Project\\countryList.txt");
	static File countryFile = countryPath.toFile();
	
	public static void showCountry() {

//		ArrayList<String> countryList = new ArrayList<>();
//		Path countryPath = Paths.get("\\Users\\admin\\Desktop\\Countries Project\\countryList.txt");
//		File countryFile = countryPath.toFile();

		try (BufferedReader in = new BufferedReader(new FileReader(countryFile))) {
			String aCountry = null;
			while ((aCountry = in.readLine()) != null) {
				countryList.add(aCountry);
				
				System.out.println(aCountry);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	} // read method

	public static void addCountry() {
		System.out.println("What Country would you like to add?");
//		ArrayList<String> countryList = new ArrayList<>();

//		Path writePath = Paths.get("\\Users\\admin\\Desktop\\Countries Project\\countryList.txt");
//		File updatedCountryList = writePath.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countryFile, true)))) {
			Scanner sc = new Scanner(System.in);
			String newCountry = sc.nextLine();
			countryList.add(newCountry);
			out.println(newCountry);
			System.out.println("You added " + newCountry);
			System.out.println(countryList);
			
			

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try(BufferedReader in = new BufferedReader(new FileReader(countryFile))){
			String printAfterUpdate;
			
			while ((printAfterUpdate = in.readLine()) != null){
				
				System.out.println(printAfterUpdate);}
				
			}catch (IOException ex){
				ex.printStackTrace();
			}
			
				
		}  //write method
	
	public static void delete()  {
		
		System.out.println("What Country would you like to remove?");
//		ArrayList<String> countryList = new ArrayList<>();

//		Path writePath = Paths.get("\\Users\\admin\\Desktop\\Countries Project\\countryList.txt");
//		File updatedCountryList = writePath.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countryFile, true)))) {
			Scanner sc = new Scanner(System.in);
			
			String removeCountry = sc.nextLine();
			countryList.remove(removeCountry);
			out.println(removeCountry);
			System.out.println("You removed " + removeCountry);
			System.out.println(countryList);
			
			

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try(BufferedReader in = new BufferedReader(new FileReader(countryFile))){
			String printAfterUpdate;
			
			while ((printAfterUpdate = in.readLine()) != null){
				
				System.out.println(printAfterUpdate);}
				
			}catch (IOException ex){
				ex.printStackTrace();
			}
			
				
		
	} // delete method
		
		
		

	
} // class
