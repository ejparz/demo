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

    @Before
    public void setUp(){
        h = new Helper();
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
    public void testDepthFirstSearch(){
        /*
                *
              *   *
            *  * *  *
        */

        
        TreeNode node7 = new TreeNode(7, Optional.empty(), Optional.empty());
        TreeNode node6 = new TreeNode(6, Optional.empty(), Optional.empty());
        TreeNode node5 = new TreeNode(5, Optional.empty(), Optional.empty());
        TreeNode node4 = new TreeNode(4, Optional.empty(), Optional.empty());

        TreeNode node3 = new TreeNode(3, Optional.of(node4), Optional.of(node5));
        TreeNode node2 = new TreeNode(2, Optional.of(node6), Optional.of(node7));

        TreeNode node1 = new TreeNode(1, Optional.of(node2), Optional.of(node3));

        boolean result = h.depthFirstSearch(node1, 7);

        //TODO: Need to fix this test
        Assert.assertEquals(false, result);

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
    

}