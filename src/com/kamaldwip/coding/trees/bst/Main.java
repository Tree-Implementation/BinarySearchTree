package com.kamaldwip.coding.trees.bst;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree demoTree = new Tree();

        demoTree.insert(25);
        demoTree.insert(20);
        demoTree.insert(27);
        demoTree.insert(15);
        demoTree.insert(22);
        demoTree.insert(26);
        demoTree.insert(30);
        demoTree.insert(29);
        demoTree.insert(32);
        demoTree.insert(17);


        System.out.println("Pre Order Traversal is : ");
        demoTree.preOrderTraversal();

        System.out.println();

        System.out.println("Post Order Traversal is : ");
        demoTree.postOrderTraversal();

        System.out.println();

        System.out.println(demoTree.get(22));
        System.out.println(demoTree.get(88));

        System.out.println("Min value in Tree : "+demoTree.min());
        System.out.println("Max value in Tree : "+demoTree.max());

        System.out.println("In Order Traversal is : ");
        demoTree.inOrderTraversal();

        System.out.println();

        demoTree.delete(15);
        System.out.println("In Order Traversal is : ");
        demoTree.inOrderTraversal();

        System.out.println();

        demoTree.delete(25);
        System.out.println("In Order Traversal is : ");
        demoTree.inOrderTraversal();

        System.out.println();

        demoTree.delete(22);
        System.out.println("In Order Traversal is : ");
        demoTree.inOrderTraversal();

        System.out.println();



    }
}
