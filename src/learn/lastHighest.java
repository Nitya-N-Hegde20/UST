package learn;

public class lastHighest {
	

	    
	    public static char findLastRepeatingChar(String s) {
	        int[] frequency = new int[26]; 
	        
	       
	        for (char ch : s.toCharArray()) {
	            frequency[ch - 'a']++;
	        }
	        
	        
	        for (int i = s.length() - 1; i >= 0; i--) {
	            char ch = s.charAt(i);
	            if (frequency[ch - 'a'] > 1) {
	                return ch;
	            }
	        }
	        
	        throw new RuntimeException("No repeating characters found");
	    }
	  

	    public static void main(String[] args) {
	        String input = "language";
	        

	        char lastRepeating = findLastRepeatingChar(input);
	        
	        
	        System.out.println("Last repeating character: " + lastRepeating);
	    }
	}


