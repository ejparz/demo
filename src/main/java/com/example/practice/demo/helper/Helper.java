package com.example.practice.demo.helper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.*;
import com.example.practice.demo.models.Vehicle;
import com.example.practice.demo.models.TreeNode;
import java.util.stream.*;
import java.util.Queue;

/*
    To Study:
    Streams - Map, Flatmap, collect, etc
    optional

*/
public class Helper{
    List<String> vehicleMakes;

    Map<Integer, String> vehicleMap;

    List<Vehicle> vehicles; 

    public Helper(){
        vehicleMakes = new ArrayList<String>();
        vehicleMakes.add("Tesla");
        vehicleMakes.add("Mercedes");
        vehicleMakes.add("Ford");

        vehicleMap = new HashMap<Integer, String>();
        vehicleMap.put(1, "Tesla");
        vehicleMap.put(2, "Mercedes");
        vehicleMap.put(3, "Ford");

        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle(1, "Tesla", "Model S"));
        vehicles.add(new Vehicle(1, "Tesla", "Model 3"));
        vehicles.add(new Vehicle(1, "Tesla", "Model X"));

        vehicles.add(new Vehicle(1, "Ford", "Mustang"));
        vehicles.add(new Vehicle(1, "Ford", "Fiesta"));
    }

    public void helloWorld(){
        System.out.println("Hello World");
    }

    public String concatenateMakes(){
        return this.vehicleMakes.stream().map(s -> s).collect(Collectors.joining("-"));
    }

    public String getMapData(int id){
        return this.vehicleMap.get(id);
    }

    public List<Vehicle> filterVehiclesByMake(String make){
        return this.vehicles
        .stream()
        .filter(v -> v.getMake().equals(make))
        .collect(Collectors.toList());
    }


    //Depth first search we use a stack.
    public int depthFirstSearch(TreeNode treeNode, int value){
       int count = 1;
       Stack<TreeNode> stack = new Stack<TreeNode>();
       stack.add(treeNode);

       while(!stack.isEmpty()){
           TreeNode e = stack.pop();
           System.out.println(e.getValue());
           if(e.getValue() == value){
               return count;
           } else {
               count++;
              if(e.getRight().isPresent()){
                stack.add(e.getRight().get());
              }
              if(e.getLeft().isPresent()){
                stack.add(e.getLeft().get());
              }
           } 
       }

        return count;
    }

	//bfs we use a queue
    public int breadthFirstSearch(TreeNode treeNode, int value){
        int count = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(treeNode);
        while(!queue.isEmpty()){
            TreeNode e = queue.poll();
            System.out.println(e.getValue());
            if(e.getValue() == value){
                return count;
            } else {
                count++;
                if(e.getLeft().isPresent()){
                    queue.add(e.getLeft().get());
                }
                if(e.getRight().isPresent()){
                    queue.add(e.getRight().get());
                  }
            } 
        }
 
         return count;
     }

    public List<Integer> mapPractice(){
        return this.vehicleMakes.stream()
        .map(s -> s.length())
        .collect(Collectors.toList());
    }

    public List<Integer> flatMapPractice(){
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(1, 3, 5);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7);

        List<Integer> numbers = Stream.of(evens, odds, primes)
                                .flatMap(list -> list.stream())
                                .collect(Collectors.toList());
        return numbers;
    }

    public String calc(String o1, String op, String o2) throws Exception{
        double n1 = Double.parseDouble(o1);
        double n2 = Double.parseDouble(o2);

        Double result = 0.0;

        if(op.equals("+")){
            result = new Double(n1 + n2); 
        } 
        if(op.equals("-")){
            result = new Double(n1 - n2); 
        }
        if(op.equals("*")){
            result = new Double(n1 * n2); 
        }
        if(op.equals("/")){
            result = new Double(n1 / n2); 
        }

        return result.toString();
    }



}

