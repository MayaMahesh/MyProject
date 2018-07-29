package com;

class MyToyTreeNode {
    private int id;
    private MyToyTreeNode left;
    private MyToyTreeNode right;
    
    public MyToyTreeNode(int id,MyToyTreeNode left,MyToyTreeNode right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }
    public void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }
    public void setLeft(MyToyTreeNode left) {
        this.left = left;
    }
    public MyToyTreeNode getLeft() {
        return left;
    }
    public void setRight(MyToyTreeNode right) {
        this.right = right;
    }
    public MyToyTreeNode getRight() {
        return right;
    }
}
public class MyToysB {
    /*
     * returns the nearest common root of the child nodes a,b
     */
	@SuppressWarnings("unused")
	private static MyToyTreeNode nearestCommonCategoryRecurssive(MyToyTreeNode root,MyToyTreeNode a,MyToyTreeNode b) {
    	MyToyTreeNode left,right;
        if(root==null)
            return null;
        if(root==a||root==b)
            return root;
        left=nearestCommonCategoryRecurssive(root.getLeft(), a, b);
        right=nearestCommonCategoryRecurssive(root.getRight(), a, b);
        
        if(left!=null&&right!=null) return root;
        else return (left!=null)?left:right;
    }
    

}
