package com.yash.bank_application.sbi;
import java.util.Scanner;

import com.yash.bank_application.account.Account;
import com.yash.bank_application.rbi.Rbi;

public class Sbi implements Rbi{

	Scanner s=new Scanner(System.in);	
	int cnt=0;	
	int i2=s.nextInt();
	Account array[]=new Account[i2];	
	@Override
	public void createAccount() {		
		for(int i1=0;i1<array.length;i1++)
		{
			Account a=new Account();
		System.out.print("Enter your age for validation : ");
		int x=s.nextInt();
		if(x>=18 && x<=100)
		{
			System.out.print("\n~~~~~~Congratulation~~~~~~");
			System.out.println("\nYou are eligible for account creation\nPlease fill the details");
			System.out.println("************************");
			System.out.print("Enter Account No: ");
			a.setAccNo(s.nextInt());
			System.out.print("Enter Name      : ");
			Scanner s1=new Scanner(System.in);
			String a1=s1.next(); String a2=s1.next(); String a3=s1.next();
			String a4=a1+" "+a2+" "+a3;
			a.setName(a4);
			
			for(int i3=1;i3>0;i3++)
			{
				System.out.print("Enter Mobile No : ");
				String m=s.next();
			if(m.length()==10)
			{
				l1:
			{
			a.setMobNo(m);
			break;
			}
			}
			else
			{
			System.out.println("Please Enter 10 digit no only");	
			}
			}
			System.out.print("Enter Adhar No  : ");
			a.setAdharNo(s.next());
			System.out.print("Enter Gender (M/F/G) : ");
			a.setGender(s.next());	
			a.setAge(x);
			System.out.println("Please submit your details with minimum amount INR 600 ");
			int count=0;
			for(int i=1;i<=3;i++)
			{
			System.out.print("Enter Amount : ");
			double d=s.nextDouble();
					
			if(d>=600)
			{
				System.out.println("~~~~~~~~~~~~Congratulation..!~~~~~~~~~~~~~~~~~\nYour account is successfully created");
				a.setBalance(d);
				cnt++;
				break;
			}
			else if(d<600)
			{
				System.out.println("Please submit the valid amount\n");
				count++;
				if(count==2)
				{
					System.out.println("This is your last chance of trial");
				}
				else if(count==3)
				{
					System.out.println("You cross the limit of trials\nTry again by creating new account");
					break;
				}				
			}
			}
			}		
		else if(x<18)
		{
			System.out.println("You are not eligible for account creation\n(Note :- You should be minimum 18 years old for creating an account");
			x=18-x;
			System.out.println("You can create your account after "+x+" Years");
		}
		else
		{
			System.out.println("You are not able to create account");
		}
		array[i1]=a;
		}		
		}
	
	//@Override
	public void displayAllDetails() {
		System.out.print("Enter Password : ");		
		int p=s.nextInt();	
		for(int i1=0;i1<array.length;i1++)
		{ 
			if(cnt>=1)
			{
				if(p==array[i1].getAge())
				{
		System.out.println("Account Number : "+array[i1].getAccNo());
		System.out.println("Name           : "+array[i1].getName());
		System.out.println("Mobile No      : "+array[i1].getMobNo());
		System.out.println("Adhar No       : "+array[i1].getAdharNo());
		System.out.println("Gender         : "+array[i1].getGender());
		System.out.println("Age            : "+array[i1].getAge());
		System.out.println("Balance        : "+array[i1].getBalance());
		
				}
			}
			else
			{
				System.out.println("You are not created any account");
				break;
			}		
		}
	}
	
	//@Override
	public void depositeMoney() 
	{
		System.out.print("Enter Password : ");		
		int p=s.nextInt();		
		for(int i1=0;i1<array.length;i1++)
		{ 				
			if(cnt>=1)
			{				
				if(p==array[i1].getAge())
				{
		double CB=array[i1].getBalance();
		System.out.print("Enter Deposit Amount : ");
		double d=s.nextDouble();
		array[i1].setBalance(d);
		CB=CB+d;
		array[i1].setBalance(CB);
			}
			}
			else
			{
			System.out.println("You are not created any account");	
			break;
			}
			}
		}
	
	@Override
	public void withdrawal() {		
		System.out.print("Enter Password : ");		
		int p=s.nextInt();		
		for(int i1=0;i1<array.length;i1++)
		{ 
			if(cnt>=1)
			{				
				if(p==array[i1].getAge())
				{
		double CB=array[i1].getBalance();
		System.out.print("Enter Withdrawal Amount : ");
		double d=s.nextDouble();
		array[i1].setBalance(d);
		CB=CB-d;
		array[i1].setBalance(CB);
			}
			}
			else
			{				
			System.out.println("You are not created any account");
			break;
			}			
			}
		}
	
	@Override
	public void balanceCheck() {		
		System.out.print("Enter Password : ");		
		int p=s.nextInt();
		for(int i1=0;i1<array.length;i1++)
		{ 
			if(cnt>=1)
			{				
				if(p==array[i1].getAge())
				{
		System.out.println("Your Current Balance is "+array[i1].getBalance());
			}
			}
			else
			{
				System.out.println("You are not created any account");
				break;
			}
		}
	}
}
