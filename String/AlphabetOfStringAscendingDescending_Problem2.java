package com.yash.java.string_problem2;

public class AlphabetOfStringAscendingDescending_Problem2 {

	
	    public static void main(String[] args) {
	        String s="aditya";
	        char[] ch=s.toCharArray();
	        System.out.println("Ascending order:");
	        for(int i=0;i<ch.length;i++)
	        {
	            for(int j=0;j<ch.length;j++)
	            {
	                if(ch[i]<ch[j])
	                {
	                    char temp = ch[i];
	                    ch[i]=ch[j];
	                    ch[j]=temp;
	                    
	                }
	            }
	        }
	        for(int k=0;k<ch.length;k++)
	        {
	            System.out.println(ch[k]);
	        }
	        
	        System.out.println("Descending order:");
	        for(int i=0;i<ch.length;i++)
	        {
	            for(int j=0;j<ch.length;j++)
	            {
	                if(ch[i]>ch[j])
	                {
	                    char temp = ch[i];
	                    ch[i]=ch[j];
	                    ch[j]=temp;
	                    
	                }
	            }
	        }
	        for(int k=0;k<ch.length;k++)
	        {
	            System.out.println(ch[k]);
	        }
	    }  
	}

