package application;

import java.util.Scanner;

import util.PalindromeChecker;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Palindrome tester");
		System.out.println("Enter a word or phrase");
		String texto = sc.nextLine();
		
		System.out.println(texto + ". Is a palidrome? " 
		+ PalindromeChecker.isPalindrome(texto));
		
		sc.close();

	}
}
