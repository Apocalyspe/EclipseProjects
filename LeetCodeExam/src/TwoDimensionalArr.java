import java.util.Scanner;

public class TwoDimensionalArr{
    
    public static void main(String args[]){
        
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
		
        
    }
}