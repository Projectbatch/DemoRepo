package test;

import java.util.Scanner;

public class ListOfStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name:");
		String s1=sc.nextLine();
		while(true){
		if(s1.equals("amar") && s1.endsWith("r")) {
			System.out.println("You are Student!!");
		}
		else {
			System.out.println("You are not student..");
		}
		break;
		}
	}
		
}
