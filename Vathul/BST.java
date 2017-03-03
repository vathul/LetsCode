import java.io.*;
import java.util.*;
import java.math.*;

class IceCream implements Comparable{
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
        this.flavor = flavor;
        this.index = index;
    }
   
    @Override
    public int compareTo(Object o) {
        IceCream i = (IceCream) o;
        return flavor - i.flavor;
    }

    @Override
    public boolean equals(Object o){
       IceCream i = (IceCream) o;
       if(flavor == i.flavor)
           return true;
       return false;
    }
        
}

public class Solution {
   
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
         if(first > last)
            return -1;
        int mid = first + ((last - first)/2);
        if(arr[mid].flavor == search)
            return arr[mid].index;
        if(arr[mid].flavor < search){
            return binarySearch(mid+1,last,arr,search);
        }
        else{
            return binarySearch(first,mid-1,arr,search);
        }
    }

    public static void main(String[] args) {
        
        int t;
        int n, m;
 
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
       for(int test = 0; test < t; test++) {       
            
            m = in.nextInt();
            n = in.nextInt(); 
            IceCream[] arr = new IceCream[n];
    
            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);
            
            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < n - 1 ; i++) {
                int search = m - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, n - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            } 
            
        }
        
    }
                        
}
