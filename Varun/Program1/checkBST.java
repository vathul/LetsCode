/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
public boolean checkBST(Node root) {
    if(root == null)
        return true;
    
    return BSTChecker(root,-1,10000); // In the problem statement 0 in the minimum value and 10000 is the maximum value
     
    
}
    private boolean BSTChecker(Node root,int min,int max) { // Here the left tree root is checked it is between the minimum and maximum range a tree can have
    
       if(root == null)
           return true;
       
        if(root.data <= min || root.data >= max)
            return false;
        return BSTChecker(root.left,min,root.data) && BSTChecker(root.right,root.data,max);
    }
  