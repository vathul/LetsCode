import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static HashMap<Integer,Integer> memory = new HashMap<Integer,Integer>();
    static Queue<Integer> inputQ=new LinkedList<Integer>();
    static Stack<Integer> countStack=new Stack<Integer>();

      public static boolean checkPrime(int num){
    if ((num > 2 && num%2 == 0) ) {
        
        return false;
    }
    int top = (int)Math.sqrt(num) + 1;
    for(int i = 3; i < top; i+=2){
        if(num % i == 0){
            
            return false;
        }
    }
 
    return true; 
}
        static int biggestInt(int input){
        int squareRoot=(int) Math.ceil(Math.sqrt(input));
        while(input % squareRoot != 0){
            squareRoot=squareRoot+1;            
        }
        return squareRoot;
    }
    private static int DownToZero(int input){
        int count=0;
        if(memory.containsKey(input)){
            int returner=memory.get(input);
            return returner;
        }
        else{
            while(input != 0){
            if(checkPrime(input)){
                input=input-1; 
                
                inputQ.add(input);
                countStack.add(count);
                count++;
                
            }
            else{
                  input=biggestInt(input);
                   
                  inputQ.add(input);
                  countStack.add(count);
                  count++;
            }
               
            }
             while(!inputQ.isEmpty()){
               
                int inputA=inputQ.remove();
                int countA=countStack.pop();
                 if(!memory.containsKey(inputA))
                memory.put(inputA,countA);
            }
           
        }
        
            return count;
        }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int input,n;
        Scanner scan=new Scanner(System.in);
        int count=0;
        n=scan.nextInt();
        memory.put(0,0);
        memory.put(1,1);
        memory.put(2,2);
        memory.put(3,3);
        for(int i=0;i<(n);i++)
            {
                
                input=scan.nextInt();
                count=DownToZero(input);
                System.out.println(count);
            
        }
        
        }
    }