package com.epam.LambdaAndSteams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Palindrome_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> A2 = new ArrayList<String>();
		System.out.println("enter the size of array:");
		int len = sc.nextInt();
		System.out.println("enter the values:");
		for(int i = 0; i < len; i++) {
			A1.add(sc.next());
		}
		A2 = palindromeList(A1);
		System.out.println("The palindrome strings are:");
		System.out.println(A2);
	}
 
	private static ArrayList<String> palindromeList(ArrayList<String> A1) {
		return (ArrayList<String>) A1.stream().filter(str -> str.equals(ReverseString(str))).collect(Collectors.toList());
	}

	public static String ReverseString(String str) {
		String s = "";
		for(int i = str.length()-1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}
}