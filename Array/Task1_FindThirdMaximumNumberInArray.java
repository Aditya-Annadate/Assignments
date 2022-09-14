package com.yash.Array.pratices;

//WAP to find third maximum number from list of numbers.

public class Task1_FindThirdMaximumNumberInArray 
{
	public static void main(String[] args) 
	{
		int array[]= {10,12,41,35,95,50,25};
		int sizeof = array.length;
		int temp;
		for(int i=0;i<sizeof;i++)
		{
			for(int j=i+1;j<sizeof;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Third Maximum Number Is :- "+array[sizeof-3]);
	}
}

