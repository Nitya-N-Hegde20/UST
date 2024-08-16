package learn;

public class matrixMult {
   public static void main(String[] args) {
	   int[][] a= {
				{2,3},
				{1,2}
		};
	   int[][] b= {
				{2,4},
				{2,1}
		};  
	   int[][] c=new int[2][2];
       for(int i=0; i<2; i++) {
    	   for(int j=0; j<2; j++) {
    		   
    	       c[i][j]=0;
    		   for(int k=0; k<2; k++)
    		   {
    			   c[i][j]+=a[i][k]*b[k][j];
    		   }
    	   }
       }
       for(int m=0; m<2; m++) {
    	   for( int n=0; n<2; n++)
    	   {
    	    System.out.print(c[m][n]+" ");	   
    	   }
    	   System.out.println();
       }
	
}
}
