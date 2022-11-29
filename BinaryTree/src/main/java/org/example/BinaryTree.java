package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }
        else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        //value already exists
        else {
            return current;
        }

        return current;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    private BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    private boolean containsNodeRecursive(Node current, int value){
        if(current == null){
            return false;
        }
        if(value == current.value){
            return  true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            //case1 node is a leaf node with no children
            if (current.left == null && current.right == null) {
                return null;
            }
            //case two one child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            //case three two children
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    //Traversing the tree
    //Depth first - Goes as deep as possible in every child before moving to next sibling
    //in order - left subtree, root, right subtree
    //preorder - root, left subtree, right subtree
    //postorder - left subtree, right subtree, root

    //depth in order
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    //depth preorder
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    //depth postorder
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    //breadth first
    //visits all nodes of a level before going to next level
    //also called level order
    //starts from root, then left to right

    //Implementation:
    //use a queue to hold nodes from each level in order
    //extract each node from list
    //print value
    //add children to the queue

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    private static int getNumberOfNodes(Node node) {
        if (node == null) {
            return 0;
        }

        return 1 + getNumberOfNodes(node.left) + getNumberOfNodes(node.right);
    }
}