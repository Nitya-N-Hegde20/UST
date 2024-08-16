package learn;

public class maxFrequent{
	public static void main(String[] args) {
		int[] a= {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3};
		int count=1,maxCount=1,element=a[0];
		for(int i=0; i<a.length; i++) {
			count=1;
			for(int j=0; j<a.length; j++)
			{
				if(a[j]==a[i]) {
					count++;
					
				}
			}
			if(count>maxCount) {
				maxCount=count;
				element=a[i];
			}
		}
		System.out.println(element);
		System.out.println(maxCount);
	}
}