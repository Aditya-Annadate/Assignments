package com.yash.java.string_problem4;

public class RepeatedAlphabets_Problem4 {

	public static void main(String[] args) {

		String s = "Aditya Annadate is software engineer";
		int count;

		char string[] = s.toCharArray();

		System.out.println(" Repeated Alphabets in a given string: ");
		// Counts each Alphabets present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited Alphabets
					string[j] = '0';
				}
			}
			// A Alphabets is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}

}
