import java.util.*;

public class IslandCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter 2D array size : ");
	       
	       Scanner sc=new Scanner(System.in);
	       int rows=sc.nextInt();
	       int columns=sc.nextInt();
	       
	       String str;
	       System.out.println("Enter array elements : ");    
	       
	       str=sc.next();
	       
	       char grid[][]=new char[rows][columns];
	       int k = 0; 
	         
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                grid[i][j] =str.charAt(k);
	                k++;
	            }
	         }
	        
	        System.out.print("\nData you entered : \n");
	        
	        for(int m=0; m<grid.length; m++) {
				for(int n=0; n<grid[m].length; n++) {
	            System.out.print(grid[m][n]+"        ");
	            }
	            System.out.println();
	        }    
	        
		
		int result = numIslands(grid);
		System.out.println(result);
	}

	// /**************************************************************************/ //
	
	public static int numIslands(char[][] grid) {
    
		int count = 0;
		
        System.out.println();
        
		for(int m=0; m<grid.length; m++) {
			for(int n=0; n<grid[m].length; n++) {
				
				if(grid[m][n]=='0' || grid[m][n] == 'I') {
					continue;
				}
				else {
					islandCount(grid, m, n);
					count++;
					System.out.println(count);
				}
				
			}
		}
		
		return count;
    }

	public static void islandCount(char[][] grid, int m, int n) {
		
		if(m>=0 && n>= 0 && m<grid.length && n<grid[m].length) {
			
			if(grid[m][n]=='0' || grid[m][n]=='I') {
			return;
			}
		}
		else {
			return;
		}
			
		grid[m][n] = 'I';
		
		islandCount(grid, m+1, n);		//down tracing
		islandCount(grid, m, n-1);		//left tracing
		islandCount(grid, m, n+1);		//right tracing
		islandCount(grid, m-1, n);	//up tracing
		
		return;
	}
}
