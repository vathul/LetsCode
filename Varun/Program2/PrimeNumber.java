import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(n == 1){
                System.out.println("Not prime");
            }
            else{
            int value=(int) Math.sqrt(n);
            boolean flag=true;
            
            for(int i=2;i<=(value);i++){
                if(n%i ==0)
                    {
                    System.out.println("Not prime");
                    flag=false;
                     break;
                }
                
            }
            if(flag == true)
                System.out.println("Prime");
            }
        }
    }
}
