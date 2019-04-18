package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Examples {
	
	
	public static class Sheet  {
		String sheetName;
		String f1;
		String b1;
		String b2;
		String f2;
		public String getSheetName() {
			return sheetName;
		}
		public void setSheetName(String sheetName) {
			this.sheetName = sheetName;
		}
		public String getF1() {
			return f1;
		}
		public void setF1(String f1) {
			this.f1 = f1;
		}
		public String getB1() {
			return b1;
		}
		public void setB1(String b1) {
			this.b1 = b1;
		}
		public String getB2() {
			return b2;
		}
		public void setB2(String b2) {
			this.b2 = b2;
		}
		public String getF2() {
			return f2;
		}
		public void setF2(String f2) {
			this.f2 = f2;
		}
		
		
	}


	public static void main(String[] args) throws IOException {
		
		
Scanner reader = new Scanner(System.in);
        
        Integer pagenum= reader.nextInt();
        
        Integer sheet= 0;
        if (pagenum%4!=0){
            sheet=pagenum/4 +1;
        }else {
            sheet=pagenum/4;
        } 
       
      Integer count=1;
      int sheetName=1;
      List <Sheet>l = new ArrayList<Sheet>();
       
       for (int run=1; run <=sheet;run++) {
    	
    	   Sheet s = new Sheet();
    	   s.setSheetName("s"+sheetName);
    	   s.setF2(count.toString());
    	   count++;
    	   s.setB1(count.toString());
    	   count++;
    	   sheetName++;
    	   l.add(s);
 
       }
        
    for (int i=l.size()-1 ;i>=0;i--) { 	
    	String fl;
    	if (count>pagenum) {
    		fl="blank";
    	}else {
    		fl=count.toString();
    	}
    	Sheet s = l.get(i);
    	s.setB2(fl);
    	count++;
    	if (count>pagenum) {
    		fl="blank";
    	}else {
    		fl=count.toString();
    	}
    	s.setF1(fl);
    	count++;
    	l.set(i, s);
    }
    	  
       for ( Sheet s : l)
       {
    	   System.out.println(s.getSheetName()+",front"+","+s.getF1()+","+s.getF2());
    	   System.out.println(s.getSheetName()+",back"+","+s.getB1()+","+s.getB2());
       }
        
        reader.close();
	}

}
