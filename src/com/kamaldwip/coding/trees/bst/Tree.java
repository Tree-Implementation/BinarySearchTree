package com.kamaldwip.coding.trees.bst;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void inOrderTraversal(){
        if(root != null){
            root.inOrderTraversal();
        }
    }

    public void preOrderTraversal(){
        if(root != null){
            root.preOrderTraversal();
        }
    }

    public void postOrderTraversal(){
        if(root != null){
            root.postOrderTraversal();
        }
    }

    public TreeNode get(int value){
        if(root !=null){
            return root.get(value);
        }
        else {
            return null;
        }
    }

    public int min(){
        if(root != null){
            return root.min();
        }
        else {
            return Integer.MIN_VALUE;
        }
    }

    public int max(){
        if(root != null){
            return root.max();
        }
        else {
            return Integer.MAX_VALUE;
        }
    }

}
