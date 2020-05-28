import java.util.Scanner;

public class MinimumSum2 {

	public static void main(String[] args) {
		System.out.print("Enter 2D array size : ");
	       
	       Scanner sc=new Scanner(System.in);
	       int rows=sc.nextInt();
	       int columns=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	       
	       
	       
	       int grid[][]=new int[rows][columns];
	       	         
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                grid[i][j] =sc.nextInt();
	              
	            }
	         }
	        
	    
	        System.out.print("\nData you entered : \n");
	        
	        for(int m=0; m<grid.length; m++) {
				for(int n=0; n<grid[m].length; n++) {
	            System.out.printf("%d\t",grid[m][n]);
	            }
	            System.out.println();
	        }
	        
	        int result = MinSum(grid);
	        System.out.println();
	        System.out.println(result);
	}
	
	public static int MinSum(int[][] grid) {
		
		int[][] dp = new int[grid.length][grid[0].length];
		
		System.out.print("\ndp matrix : \n");
        
        for(int m=0; m<grid.length; m++) {
			for(int n=0; n<grid[m].length; n++) {
            System.out.printf("%d\t",dp[m][n]);
            }
            System.out.println();
        }
			
        if(grid ==null || grid.length==0) {
        	return 0;
        }
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				
				dp[i][j] = grid[i][j];
				
				if(j>0 && i>0) {
					dp[i][j] += Math.min(dp[i][j-1], dp[i-1][j]);
				}
				else if(i==0 && j>0) {
					dp[i][j] += dp[i][j-1];
				}
				else if(j==0 && i>0) {
					dp[i][j] += dp[i-1][j];
				}
				
			}
		}
		
		System.out.print("\nNew dp matrix : \n");
        
        for(int m=0; m<grid.length; m++) {
			for(int n=0; n<grid[m].length; n++) {
            System.out.printf("%d\t",dp[m][n]);
            }
            System.out.println();
        }
		
		return dp[dp.length-1][dp[0].length-1];
		
	}
}
