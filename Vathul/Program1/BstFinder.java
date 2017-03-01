/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node {
   	int data;
    Node left;
   	Node right;
   
   public Node(int value){
   	data = value;
   	left = null;
   	right = null;
   }
   
   public void InsertLeft(Node parent, Node left){
   	parent.left = left;
   }
   
   public void InsertRight(Node parent, Node right){
   	parent.right = right;
   }
   
   private boolean checkIsBstHelper(Node root, int min, int max){
   	
   	if(root == null)
   		return true;
   		
   	return (root.data > min &&
   			root.data < max &&
   			checkIsBstHelper(root.left,min,root.data) &&
   			checkIsBstHelper(root.right,root.data,max)
   			);
   }
   
   public boolean checkIsTreeBst(Node root){
   
   if(root == null)
   {
   		return true;
   }
   
   return checkIsBstHelper(root,0,10000);
   }
   
   }

class Ideone
{	
	public static void main (String[] args) throws java.lang.Exception
	{
		//Invalid case
		Node node = new Node(20);
		Node right = new Node(10);
		Node left = new Node(5);
		node.InsertLeft(node,left);
		node.InsertRight(node,right);
		
		System.out.println(node.checkIsTreeBst(node));

		//Invalid case
		node = new Node(20);
		left = new Node(10);
	  right = new Node(22);
		Node leftRight = new Node(21);	
		node.InsertLeft(node,left);
		node.InsertRight(node,right);
		node.InsertRight(left,leftRight);
		
		System.out.println(node.checkIsTreeBst(node));
    
		//Valid Case
		node = new Node(20);
		left = new Node(10);
	  right = new Node(25);
	     
	  System.out.println(node.checkIsTreeBst(node));

	}
}
