import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        long max=0,x=0;
        Scanner scan=new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        long[] A = new long[N+1];
        for(int i = 0;i<M;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt(); 
            A[a] += k;
            if((b+1) <= N){
                A[b+1] -= k;
            }
        }
        for(int i=1;i<=N;i++){
            x += A[i];
            if(max<x){
                max=x;
            }
        }
        System.out.println(max);
    }
}