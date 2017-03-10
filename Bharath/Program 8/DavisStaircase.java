import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int recursion(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 4;
        }else{
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for(int i=4;i<=n;i++){
                arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
            }
            return arr[n];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();           
            System.out.println(recursion(n));
        }
    }
}