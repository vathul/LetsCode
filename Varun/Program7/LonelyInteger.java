import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static int lonelyInteger(int[] a) { //the function finds out the lonely integer 
        Arrays.sort(a);
        int output=0;
        for(int i=0;i<a.length;i++){
            if(i==(a.length -1))
                {
                output=a[i];
                break;
            }
            if(a[i]==a[i+1]){
                i=i+1;
            }
            else
                {
                output=a[i];
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
