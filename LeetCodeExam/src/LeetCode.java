import java.util.*;

class LeeCode {
    static public ArrayList<Integer> productExceptSelf(List<Integer> nums) {
    	
    	//checkpoint
    	System.out.println(nums.size());
    	
        ArrayList<Integer> temp = new ArrayList<>();
        int tp;
               
        for(int i=0; i<nums.size(); i++){
            
        	tp = nums.get(i);
        	nums.remove(i);
        	temp.add(result(nums));
        	nums.add(i, tp);
        	
        }
        return(temp);
    }
     
    
    public static int result(List<Integer> temp) {
    	
    	int pro = 1;
    	for(int i=0; i<temp.size(); i++) {
    		
    		pro = pro*temp.get(i);
    		
    	}
    
    	 return pro;
    }
    
    
	public static void main(String[] args){
        
    	List<Integer> arr = new ArrayList<>();
    	
    	System.out.println("Please input the numbers for list");
    	System.out.println(arr.size());
    	
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<4; i++) {
        	
        	int j = sc.nextInt();
        	arr.add(j);
        }
        
        //checkpoint
        System.out.println(arr);
        
        ArrayList<Integer> result = productExceptSelf(arr);
        
        System.out.println(result);
    }
}