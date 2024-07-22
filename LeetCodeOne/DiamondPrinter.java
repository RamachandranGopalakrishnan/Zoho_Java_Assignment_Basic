package LeetCodeOne;

import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {

        List<String> ans=new ArrayList<>();
         int n=(a-'A');
	     int start=n+1;
	     int end=n+1;
	     char val='A';
        String s="";
	     for(int i=1;i<=2*n+1;i++){
          s="";
	    	 for(int j=1;j<=2*n+1;j++) {
	    		 if(j==start || j==end) {
	    			// System.out.print(val+" ");
                     s+=val;
	    		 }
	    		 else {
	    			 //System.out.print(" ");
                     s+=" ";
	    		 }
	    	 }
	    	  if(i<=n) {
	    		  start--;
	    		  end++;
	    		  val++;
	    	  }
	    	  else {
	    		  start++;
	    		  end--;
	    		  val--;
	    	  }
	    	 //System.out.println();
        ans.add(s);
    
}
    return ans;
        
    }

}
