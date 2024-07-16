package Zoho;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String[] ones= {"","one","two","three","four","five","six",
            		 "seven","eight","nine",""};
             String[] tens= {"","ten","twenty","thirty","fourty","fifty",
            		 "sixty","seventy","eighty","ninety",""};
             String [] teens= {"","eleven","tweleve","theteen,fourteen",
            		 "fivety","sixteen","seveenten","eighteen","nineteen",""};
            
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value");
             String s=sc.nextLine();
             int l=s.length();
             String val;
             switch(l) {
             case 1:
            	  val=String.valueOf(s.charAt(0));
            	 System.out.println(ones[Integer.parseInt(val)]);
            	 break;
            	 
             case 2:
            	 if(s.charAt(0)=='1') {
            		  val=String.valueOf(s.charAt(1));
            		 System.out.println(teens[Integer.parseInt(val)]);
            	 }
            		 else {
            			 System.out.println(tens[Integer.parseInt(String.valueOf(s.charAt(0)))]+" "+ones[Integer.parseInt(String.valueOf(s.charAt(1)))]);
            		 }
            	 break;
            	 
             case 3:
            	 int i=Integer.parseInt(String.valueOf(s.charAt(0)));
            	 int j=Integer.parseInt(String.valueOf(s.charAt(1)));
            	 int k=Integer.parseInt(String.valueOf(s.charAt(2)));
            	 System.out.println(ones[i]+
            			 " Hundred and "+
            			 tens[j]+" "+ones[k]);
            	 break;
             case 4:
            	 int p=Integer.parseInt(String.valueOf(s.charAt(0)));
            	 int q=Integer.parseInt(String.valueOf(s.charAt(1)));
            	 int w=Integer.parseInt(String.valueOf(s.charAt(2)));
            	 int e=Integer.parseInt(String.valueOf(s.charAt(3)));
            	 if(q!=0) {
            	 System.out.println(ones[p]+" Thousand and"+ones[q]+
            			 " Hundred and"+
            			 tens[w]+" "+ones[e]);
            	 }
            	 else {
            		 System.out.println(ones[p]+" Thousand "+ones[q]+
                			 tens[w]+" "+ones[e]);
            	 }
            	 break;
            	
              
             }
             }
	}


