package com.example.practice.demo.julypractice;

import static org.mockito.Mockito.RETURNS_DEFAULTS;

import com.example.practice.demo.models.TreeNode;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class PracticeTest {

    TreeNode root;
    Practice practice;

    @Before
    public void setUp(){
        root = TreeNode.getBinarySearchTreeRoot();
        practice = new Practice();
    }


    @Test
    public void testDepthFirstSearch(){
        int count = practice.depthFirstSearch(root, 7);
        Assert.assertEquals(7, count);
    }

    @Test
    public void testBreadthFirstSearch(){
        int count = practice.breadthFirstSearch(root, 5);
        Assert.assertEquals(5, count);
    }

    @Test
    public void testPreferredOrder(){
        String pref =  practice.preferredOrder("banana");
        Assert.assertEquals("aaannb", pref);
    }

    @Test
    public void test(){
        Float f = new Float(3.1);
        Integer i = new Integer(1);
        long m = 2;
        System.out.println("Result is " + m+f+i);
    }

    @Test
    public void testTwo(){
       List<String> status = Arrays.asList("Open", "Closed", "Pending");
       Collections.sort(status, (String s1, String s2) -> {return s1.compareTo(s2);});
       Collections.sort(status, (( s1,  s2) -> - s1.compareTo(s2)));
    
       System.out.println(status);
    }



}