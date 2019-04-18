package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Laptop  {
	   
	    
	    
	    public static void main(String args[] ) throws Exception {
	     
	    	 Scanner rad = new Scanner(System.in);
	         String ar[] = rad.nextLine().toString().split(" ");
	         Integer l = Integer.parseInt(ar[0]);
	         Integer r = Integer.parseInt(ar[1]);
	         
	         int itr = r-l;
	         
	         int n= (int) Math.sqrt(r);
	         int count=0;
	         Set st = new HashSet();
	         for (int i =0;i<=itr;i++) {
	         
	        	 for ( int j =0,pow=2; j <=i; j++) {
	                
	        		 for ( int k =0,pp=2; k<=n/2;k++) {
	        			 int x = (int) (Math.pow(i, pow)+ Math.pow(k, pp));
	        			 pp++;
	        			 if ( x<=r && x >=l) {
	        				 System.out.println(x +"="+ j +"+"+k);
	        				 
	        				 st.add(x);
	        				 
	        			 }
	        		 }
	        		 pow++;
	        	 }
	        	 
	        	 
	         }
	         
	         System.out.println(st.size());
	        
	    }
	
}
