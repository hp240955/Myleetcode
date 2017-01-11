package plusOne;

import java.util.Scanner;

public class plusOne {
	
	

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String digit = reader.nextLine();
		
		String[] digitString = digit.split("");
		System.out.println(digitString[0]);
		System.out.println("h"+ digit);
		
		int[] array = new int[digit.length()];
		for(int i = 0; i < array.length; i++){
			array[i] = Integer.parseInt(digitString[i]);
		}
		
		for(int i: array){
			System.out.print(i + " ");
		}
			
		System.out.println();
		
		plusOne hp = new plusOne();
		
		System.out.println(hp.plusOne(array)[0]);
		
		
	}
	
    public int[] plusOne(int[] digits) {
       StringBuffer s = new StringBuffer();
       for(int i: digits){
    	   s.append(i);
       }
       System.out.println(s);
       int digit = Integer.parseInt(s.toString());
       digit = digit + 1;
       String tempDigit = digit + "";
       String[] digitString = tempDigit.split("");
       int[] array = new int[tempDigit.length()];
       System.out.println(digit);
       
       for(int i = 0; i < array.length; i++){
			array[i] = Integer.parseInt(digitString[i]);
		}
       
       return array;
    }

}


