package com.example.practice.demo.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.*;

import com.example.practice.demo.models.Vehicle;
import java.util.List;
import java.util.Optional;

import com.example.practice.demo.models.TreeNode;

public class HelperTest {

    Helper h;

    TreeNode root;

    @Before
    public void setUp(){
        h = new Helper();

        root = TreeNode.getBinarySearchTreeRoot();
    }


    @Test
    public void testHelloWorld(){
        h.helloWorld();
    }

    @Test
    public void testConcatenateMakes(){
        String result = h.concatenateMakes();
        Assert.assertEquals(result, "Tesla-Mercedes-Ford");
        System.out.println(result);
    }

    @Test
    public void testGetMapData(){
        String result = h.getMapData(1);
        Assert.assertEquals(result, "Tesla");
    }

    @Test
    public void testFilterTeslaVehicles(){
        List<Vehicle> teslaVehicles = h.filterVehiclesByMake("Tesla");
        Assert.assertEquals(3, teslaVehicles.size());
        Assert.assertEquals("Model S", teslaVehicles.get(0).getModel());
    }

    @Test
    public void testDepthFirstSearch_Deepest(){
        int result = h.depthFirstSearch(root, 7);

        //TODO: Need to fix this test
        Assert.assertEquals(7, result);
    }

    @Test
    public void testDepthFirstSearch_five(){
        int result = h.depthFirstSearch(root, 3);

        //TODO: Need to fix this test
        Assert.assertEquals(5, result);
    }

    @Test
    public void testBreadthFirstSearch_Deepest(){
        int result = h.breadthFirstSearch(root, 7);

        //TODO: Need to fix this test
        Assert.assertEquals(7, result);
    }

    @Test
    public void testBreadthFirstSearch_three(){
        int result = h.breadthFirstSearch(root, 3);

        //TODO: Need to fix this test
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMapPractice(){
        List<Integer> lengthList = h.mapPractice();
        Assert.assertEquals(3, lengthList.size());
        Assert.assertEquals(Integer.valueOf(5), lengthList.get(0));

    }


    @Test
    public void testFlatMapPractice(){
        List<Integer> flatMap = h.flatMapPractice();
        Assert.assertEquals(10, flatMap.size());
    }
    

    @Test
    public void testCalcPlus() throws Exception{
        String result = h.calc("1", "+", "2");
        Assert.assertEquals("3.0", result);
    }

}