package Practice;

public class SumChecker {

	//solve to index of position whose sum adds upto target (target =8 then sol is (0,2) as 7+1=8))
	
   
	
	static void Logic(int arr[], int target) {
		int sum;
		for (int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++) {
			sum=arr[i]+arr[j];
			if(sum == target ) 
			System.out.println("\nSolution for target "+target+" is "+i+","+j);  }
			
			
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("Given Numbers-");
	    int arr[]=new int[] {1,3,7,2,9,4};
	    for(int val:arr)
	    System.out.print(val+",");
	    Logic(arr, 10);// give target as second argument here

	}

}
