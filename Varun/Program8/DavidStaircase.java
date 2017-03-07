import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static HashMap <Integer,Integer> memory=new HashMap<Integer,Integer>();

    private static int CheckStairCase(int n){

        if(n < 0){
            return 0;
        }
        if(memory.containsKey(n)){
            return memory.get(n);
        }

        int count=CheckStairCase(n-3)+CheckStairCase(n-2)+CheckStairCase(n-1);
        memory.put(n,count);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        memory.put(1,1);
        memory.put(2,2);
        memory.put(3,4);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
           System.out.println(CheckStairCase(n));
        }
    }
}
