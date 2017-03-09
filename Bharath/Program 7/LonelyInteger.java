import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static int lonelyInteger(int[] a,int n) { //the function finds out the lonely integer 
        Arrays.sort(a);
        int result=0;
        for(int i=0;i<n;i++){
            if(i== n-1){
                 result = a[i];
            }else if(a[i]==a[i+1]){
                i++;
            }else{
                result = a[i];
            }
        }
        return result;        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a,n));
    }
}