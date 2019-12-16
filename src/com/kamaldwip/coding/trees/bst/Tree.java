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

    public void delete(int value){
        root = delete(root,value);
    }

    public TreeNode delete(TreeNode subTreeRoot, int value){
        if(subTreeRoot == null) {
            return null;
        }
        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
        }
        else if(value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),value));
        }
        else {
            //Case 1 and Case 2 : Leaf Node and ONE child
            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }
            else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            }
            // Case 3 : TWO children
            // Traversing along right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),subTreeRoot.getData()));

            /*
            Traversing along left subtree
            subTreeRoot.setData(subTreeRoot.getLeftChild().max());
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),subTreeRoot.getData()));
             */

        }
        return subTreeRoot;
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
