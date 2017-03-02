import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
    private static long[] RangeAdder(int lowerLimit,int upperLimit,int value,long[] array){

        array[lowerLimit]=array[lowerLimit]+value;
        
        if( upperLimit < (array.length-1)){
        
            array[upperLimit+1]=array[upperLimit+1]-value;
        
        }
        
        return array;
    }
    
    private static void maxFinder(long[] array){
        
        long max=Integer.MIN_VALUE;
        
        for(int i=1;i<array.length;i++){
            
            array[i]=array[i]+array[i-1];
            
            if(array[i] > max){
        
                max=array[i];
            }
        }
        System.out.println(max);
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numberOfInputs=0,arraySize=0,lowerLimit,upperLimit,value;
        Scanner scan=new Scanner(System.in);
        arraySize=scan.nextInt();
        numberOfInputs=scan.nextInt();
        long array[] =new long[arraySize];
        for(int i=0;i<numberOfInputs;i++){
            lowerLimit=scan.nextInt()-1;
            upperLimit=scan.nextInt()-1;
            value=scan.nextInt();
            array=RangeAdder(lowerLimit,upperLimit,value,array);
        }
      maxFinder(array);
    }
}