package learn;

public class reverseSentence {
	

	    
	    public static String reverseWords(String s) {
	        
	        String[] words = new String[100]; 
	        int wordCount = 0;
	        int start = 0;
	        
	        
	        for (int i = 0; i <= s.length(); i++) {
	            
	            if (i == s.length() || s.charAt(i) == ' ') {
	                
	                String word = s.substring(start, i);
	                words[wordCount++] = word;
	                start = i + 1; 
	            }
	        }
	        
	       
	        StringBuilder result = new StringBuilder();
	        for (int i = wordCount - 1; i >= 0; i--) {
	            result.append(words[i]);
	            if (i > 0) {
	                result.append(" "); 
	            }
	        }
	        
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "i love programming very much";
	        String reversed = reverseWords(input);
	        System.out.println("Reversed words: " + reversed);
	    }
	}


