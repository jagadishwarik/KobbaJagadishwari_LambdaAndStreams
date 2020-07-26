package com.epam.LambdaAndSteams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;



public class StringA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		System.out.println("Enter the values:");
		List<String> strings  = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			strings.add(sc.next());
		}
		List<String> resultStrings  = find(strings, (String s) -> s.charAt(0) == 'a' && s.length() == 3);
		System.out.println("The Strings are:" + resultStrings);
	}
	public static List<String> find(List<String> strings, Predicate<String> predicate) {
		List<String> result = new ArrayList<String>();
		for(String s : strings) {
			if(predicate.test(s)) {
				result.add(s);
			}
		} return result;
	}

}

