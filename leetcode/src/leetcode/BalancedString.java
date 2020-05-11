package leetcode;

public class BalancedString {

	  public int balancedStringSplit(String s) {
	        
	        char[] c = s.toCharArray();
	        int count = 0;
	        for(int i=0;i<c.length-1;i++){
	            char ch = c[i];
	            int j =i+1;
	            while(c[j] == ch){
	                j++;
	            }
	            i = (i+j)*2;
	            count++;
	            
	        }
	        return count;
	    }
}
