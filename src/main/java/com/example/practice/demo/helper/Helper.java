package com.example.practice.demo.helper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.*;
import com.example.practice.demo.models.Vehicle;
import com.example.practice.demo.models.TreeNode;
import java.util.stream.*;

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


    public boolean depthFirstSearch(TreeNode treeNode, int value){
        System.out.println("Current Value" + treeNode.getValue());
        if(treeNode.getValue() == value){
            return true;
        }
        if(treeNode.getLeft().isPresent()){
            return this.depthFirstSearch(treeNode.getLeft().get(), value);

        } else if(treeNode.getRight().isPresent()){
            return this.depthFirstSearch(treeNode.getRight().get(), value);
        }

        return false;
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



}

