package Zoho;

import java.util.HashMap;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		
	   String[][] map= { {"paari","karikalan"},
			             {"udhiran","sendhan"},
			             {"sendhan","arulmozhi"},
			             {"karikalan","sendhan"}
	   };
	   String grandfather="sendhan";
	   String son="";
	   for(int i=0;i<map.length;i++) {
		   if(map[i][1]==grandfather) {
			   son=map[i][0];
		   }
	   }
	  // System.out.println(son);
	   int count=0;
	   
	   for(int i=0;i<map.length;i++) {
		   if(map[i][1]==son) {
			  count++;
		   }
	   }
	   System.out.println(count);
	}

}
