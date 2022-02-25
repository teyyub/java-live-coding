package com.live.coding.javas.collections.list.linkedlist;

public class BinaryTree {

    Node root;
    private String value;

    BinaryTree(String value)
    {
        root = new Node(value);
    }



    class Node {
        private String value;
        private Node left;
        private Node right;

        public Node(String value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                ", value='" + value + '\'' +
                '}';
    }

    public static void main(String[] args) {
            BinaryTree tree = new BinaryTree("A");
        System.out.println(tree);
    }
}
