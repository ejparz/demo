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
}