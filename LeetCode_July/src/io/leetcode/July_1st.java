package io.leetcode;


public class July_1st {

	public static void main(String[] args) {
		
	int n = 10;
	int result = arrangeCoins(n);	
	
	System.out.println(result);
	
	}

	public static int arrangeCoins(int n) {
        
		long k = (long) Math.sqrt(2*(long)n);
		
		long sum = (k*(k+1))/2;
		
		if(sum>n) return (int)(k-1);
		
		return (int)k;
        
    }
}
