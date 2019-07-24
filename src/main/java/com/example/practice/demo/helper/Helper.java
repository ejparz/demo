package com.example.practice.demo.helper;

import java.util.List;
import java.util.ArrayList;;


/*
    To Study:
    Streams - Map, Flatmap, collect, etc

*/
public class Helper{

    List<String> vehicleMakes;

    public Helper(){
        vehicleMakes = new ArrayList<String>();
        vehicleMakes.add("Tesla");
        vehicleMakes.add("Mercedes");
        vehicleMakes.add("Ford");
    }

    public void helloWorld(){
        System.out.println("Hello World");
    }

    public String concatenateMakes(){
        //return this.vehicleMakes.stream()
        return "hello world";
    }




}

