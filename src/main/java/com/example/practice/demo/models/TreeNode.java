package com.example.practice.demo.models;

import java.util.Optional;


public class TreeNode{

    int value;
    Optional<TreeNode> left;
    Optional<TreeNode> right;

    public TreeNode(int value, Optional<TreeNode> left, Optional<TreeNode> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Optional<TreeNode> getLeft() {
        return left;
    }

    public void setLeft(Optional<TreeNode> left) {
        this.left = left;
    }

    public Optional<TreeNode> getRight() {
        return right;
    }

    public void setRight(Optional<TreeNode> right) {
        this.right = right;
    }


    public static TreeNode getBinarySearchTreeRoot(){
                /*
                *
              *   *
            *  * *  *

                1
              2   3
            4  5 6  7
        */

        TreeNode node7 = new TreeNode(7, Optional.empty(), Optional.empty());
        TreeNode node6 = new TreeNode(6, Optional.empty(), Optional.empty());
        TreeNode node5 = new TreeNode(5, Optional.empty(), Optional.empty());
        TreeNode node4 = new TreeNode(4, Optional.empty(), Optional.empty());

        TreeNode node3 = new TreeNode(3, Optional.of(node6), Optional.of(node7));
        TreeNode node2 = new TreeNode(2, Optional.of(node4), Optional.of(node5));

        TreeNode root = new TreeNode(1, Optional.of(node2), Optional.of(node3));

        return root;
    }
}