import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            int count = 0;
            int n = scan.nextInt();
            if(n < 2) 
                count++;
            if(n % 2 == 0 && n!=2) 
                count++;
            for(int j=3; (j*j)<=n; j+=2){
                if(n % j == 0 ){
                    count++;
                    break;
                }                    
            }
            if(count==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}