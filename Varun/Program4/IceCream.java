import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    private static void getFlavours(int[] cost,int money){
          
      HashMap<Integer,Integer> costs= new HashMap<>();
         for (int i = 1; i <= cost.length; i++) {
            int iceCreamID = i;
            int currentCost       = cost[i-1];
            int otherCost  = money - currentCost;
             if(costs.containsKey(otherCost)){
                 System.out.println(costs.get(otherCost)+" " +iceCreamID);
                 
             }
            if ( ! costs.containsKey(currentCost)) {
                costs.put(currentCost,iceCreamID);
            }
    }
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int m = in.nextInt();
            int n = in.nextInt();
            int cost[] = new int[n];
            for(int j=0; j < n; j++) {
                cost[j] = in.nextInt();
            }
            
            getFlavours(cost, m);
        }
      
   }
}
