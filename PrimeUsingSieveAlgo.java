package Practice;

public class PrimeUsingSieveAlgo {

	static void PrimeorNot(int n) {
		
	boolean b[] = new boolean[n+1];
	
	for(int p=0;p<n;p++)
	{ b[p]=true;// marking all values as true initially
     }
	
	for(int c=2;c<=(n/2);c++) {
		if(b[c])
		{
			for(int j=c*c;j<n;j+=c)
			b[j]=false;
		}}	
		
		System.out.println("List of prime numbers upto given number are : ");  
	     
		for (int z = 2; z< b.length; z++) {  
	         if(b[z]) {  
	            System.out.print(z+" ,");  
	         } 
		}
	}
	
	
	
	public static void main(String[] args) {
		
		PrimeorNot(100);

	}

}
