package learn;

public class secondHighest {
     public static void main(String[] args)
     {
    	 int[] a= {2,1,3,4,5,6,7,89,3,4};
    	 int highest=Integer.MIN_VALUE;
    	 int secondhighest=Integer.MIN_VALUE;
    	 
    	 for(int i=0; i<a.length; i++ ) {
    		 if(a[i]>highest)
    		 {
    			 secondhighest=highest;
    			 highest=a[i];
    			 
    		 }
    			 
    		 }
    	 System.out.println(secondhighest);
    			
    	 
     }
}
