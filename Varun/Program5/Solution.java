import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int[] goDown(int i,int j,Character[][] map){
        int size=map[0].length;
        int[] value=new int[]{-1,-1};
            
        if(i >= (size-1) || map[i+1][j] == 'X'){
            return value;
        }  
        else{
           
            value[0]=i+1;
            value[1]=j;
            map[i+1][j]='X';
            return value;
        }
    }
    private static int[] goUp(int i,int j,Character[][] map){
        int size=map[0].length;
         int[] value=new int[]{-1,-1};
        if(i == 0 || map[i-1][j] == 'X'){
            return value;
        }  
        else{
           
             
            value[0]=i-1;
            value[1]=j;
            map[i-1][j]='X';
            return value;
        }
    }
    private static int[] goRight(int i,int j,Character[][] map){
        int size=map[0].length;
        int[] value=new int[]{-1,-1};
        if(j >= (size-1) || map[i][j+1] == 'X'){
            return value;
        }  
        else{
            
            
            value[0]=i;
            value[1]=j+1;
            map[i][j+1]='X';
            return value;
        }
    }
     private static int[] goLeft(int i,int j,Character[][] map){
        int size=map[0].length;
        int[] value=new int[]{-1,-1};
        if(j == 0 || map[i][j-1] == 'X'){
            return value;
        }  
        else{
           
         
            value[0]=i;
            value[1]=j-1;
            map[i][j-1]='X';
            return value;
        }
    }
    private static int Bfs(Character[][] map,int si,int sj,int di,int dj){ //di,dj represents destination of the row and column,si,sj represents the source of i row and column
        //I have used breadth first search to find the shortest distance between two points.
        Queue<Integer> BFS = new LinkedList();
        boolean flag= true;
        int distance=0;
        BFS.add(si);
        BFS.add(sj);
        while(flag==true){
            int temp1=BFS.remove();
            int temp2=BFS.remove();
            int count=0;
            int[] downValue=new int[2];
                downValue=goDown(temp1,temp2,map);
            int[] upValue=new int[2];
                upValue=goUp(temp1,temp2,map);
            int[] rightValue=new int[2];
                rightValue=goRight(temp1,temp2,map);
            int[] leftValue=new int[2];
                leftValue=goLeft(temp1,temp2,map);
                
            if(downValue[0] != -1){         // Returns the value -1 when it cannot Go Down. Applies to all other conditions below.
                BFS.add(downValue[0]);
                BFS.add(downValue[1]);
                count++;
                if(downValue[0] == di && downValue[1] == dj){
                    distance++;
                    flag=false;
                    break;
                }
            }
            if(upValue[0] != -1){
                BFS.add(upValue[0]);
                BFS.add(upValue[1]);
                count++;
                if(upValue[0] == di && upValue[1] == dj){
                    distance++;
                    flag=false;
                    break;
                }
                }
            if(rightValue[0] != -1){
                BFS.add(rightValue[0]);
                BFS.add(rightValue[1]);
                count++;
                if(rightValue[0] == di && rightValue[1] == dj){
                    distance++;
                    flag=false;
                    break;
                }
                }
            if(leftValue[0] != -1){
                BFS.add(leftValue[0]);
                BFS.add(leftValue[1]);
                count++;
                if(leftValue[0] == di && leftValue[1] == dj){
                    distance++;
                    flag=false;
                    break;
                }
                }
            
            if(BFS.isEmpty()){
                System.out.println("Sorry Cannot Find the destination");
                break;
            }
                               
            }
        return distance;
        }       
        
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
       
        int sourceI,sourceJ,destI,destJ,mapSize,distance;
        mapSize=scan.nextInt();
        Character[][] map=new Character[mapSize][mapSize];
        for(int i=0;i<mapSize;i++){
            String row=scan.next();
            for(int j=0;j<mapSize;j++){
                map[i][j]=row.charAt(j);
            }
        }
        sourceI=scan.nextInt();
        sourceJ=scan.nextInt();
        destI=scan.nextInt();
        destJ=scan.nextInt();
        distance=Bfs(map,sourceI,sourceJ,destI,destJ);
        System.out.println(distance);
            
        
        
        
    }
}