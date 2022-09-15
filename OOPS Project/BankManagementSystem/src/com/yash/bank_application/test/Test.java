package com.yash.bank_application.test;

import java.util.Scanner;

import com.yash.bank_application.rbi.Rbi;
import com.yash.bank_application.sbi.Sbi;
public class Test {
	
	public static void main(String[] args) {
		System.out.println("Enter no. of account you want to create");
		Scanner s=new Scanner(System.in);
		Rbi bank=new Sbi();
		while(true)
		{
		System.out.println("Enter Your Choice :");
		System.out.println("Press 1 for Account Creation");
		System.out.println("Press 2 for Display All Account Details");
		System.out.println("Press 3 for Deposite of Money");
		System.out.println("Press 4 for Withdrawal of Money");
		System.out.println("Press 5 for Balance Check");
		System.out.println("Press 6 for exit");
		int n=s.nextInt();
		switch(n)
		{
		case 1 :bank.createAccount();
		System.out.println("/////////////////////////\n");
		break;
		case 2 :bank.displayAllDetails();
		System.out.println("/////////////////////////\n");
		break;
		case 3 :bank.depositeMoney();
		System.out.println("/////////////////////////\n");
		break;
		case 4 :bank.withdrawal();
		System.out.println("/////////////////////////\n");
		break;
		case 5 :bank.balanceCheck();
		System.out.println("/////////////////////////\n");
		break;
		case 6 :System.exit(n);
		}
		}
	}
}
