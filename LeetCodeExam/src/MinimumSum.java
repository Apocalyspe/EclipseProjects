import java.util.Scanner;

public class MinimumSum {

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
	        int result = MinSum(grid,rows,columns);
	        System.out.printf("This is MinSum call result  : %d\n",result);
	       
		
	}

	public static int MinSum(int[][] grid, int rows, int columns) {
		
		int trace = grid[rows-1][columns-1];
		System.out.println(trace);
		
		int r = grid.length-1;
		int c = grid[r].length-1;
		System.out.printf("%d,%d\n", r,c);
		
		int result = addition(grid, trace, r, c);  
		System.out.printf("This is addition call resut : %d\n",result);
		
		return result;
	}

	public static int addition(int[][] grid, int trace, int r, int c) {
		
		if(r>0 && c>0 && r<=grid.length && c<=grid[r].length) {
			
			if(grid[r-1][c]<grid[r][c-1]) {
				trace += grid[r-1][c];
				return addition(grid, trace, r-1, c);  //1st trace =2 ; 2nd trace = 3
			}
			else{
				trace+= grid[r][c-1];
				return addition(grid, trace, r, (c-1));
			}
			
	
		}
		else if(r==0 || c==0){
			
			 if(r==0 && c!=0) {
				trace += grid[0][c-1];
				 return addition(grid,trace,0,c-1);  //3rd trace = 6 ; 4th trace = 7 ;0,0
				
			}
			else if(c==0 && r!=0) {
				trace += grid[r-1][0];
				return addition(grid,trace,r-1,0);
				
			}	
			else if(r==0 && c==0) {
				System.out.printf("The total sum is : %d\n",trace);
				return trace;
			}
		}
		else
		{
		return trace;
		}
		
		return trace;
	}
	
}


