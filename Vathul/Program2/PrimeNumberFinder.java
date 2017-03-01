/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static boolean isPrimeNumber(int number){
		
		//Filtering non-primes
		if( number <= 0 ){
			return false;
		}
		
		//1,2,3 are all prime
		if( number < 4 ){
			return true;
		}
		
		double tempNumber = number;
		double result = 0;
		double squareRoot = Math.sqrt((double) number); 
	
		for(int i=2; i<= (int) squareRoot; i++){
			tempNumber = (double)number / i;
			if((tempNumber-(int)tempNumber) == 0)
				return false;
		}
		
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(isPrimeNumber(27));
	}
}
