import java.util.Scanner;
import java.util.*;

public class ParenthesisCheck {

	public static boolean Solution(String str) {
		
		int len = str.length();
		
		Stack<Integer> open = new Stack<Integer>();
		Stack<Integer> star = new Stack<Integer>();
		
		for(int i=0; i<len; i++) {
			
			if(str.charAt(i)=='(') {
				open.push(i);
			}
			else if(str.charAt(i)=='*') {
					star.push(i);
			}
			else {
				if(!open.isEmpty()) {
					open.pop();
				}
				else if(!star.isEmpty()){
					star.pop();
				}
				else {
					return false;
				}
			}
		}
		
		
		while(!open.isEmpty()) {
			
			 if(star.isEmpty()) {
				return false;
			}
			 else {
				 if(open.peek() < star.peek()) {
			 
					open.pop();
					star.pop();
				}
				 else {
					 return false;
				 }
			 }
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please provide the string");
		Scanner sc = new Scanner(System.in);
		String  str = sc.next();
		
		if(Solution(str)==true) {
		
		System.out.println("string is valid");
		}
		else {
			System.out.println("string is invalid");
		}
	}

}
