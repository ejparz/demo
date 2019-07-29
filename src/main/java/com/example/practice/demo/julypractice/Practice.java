package com.example.practice.demo.julypractice;

import java.util.Stack;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

import com.example.practice.demo.models.TreeNode;


public class Practice {

    public Practice(){

    }


    public int depthFirstSearch(TreeNode root, int value){
        int count=0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);
        while(!stack.isEmpty()){
            count++;
            TreeNode node = stack.pop();
            System.out.println(node.getValue());
            if(node.getValue() == value){
                return count;
            }
            node.getRight().ifPresent(e -> stack.add(e));
            node.getLeft().ifPresent(e -> stack.add(e));
        }
        
        return 0;
    }


    public int breadthFirstSearch(TreeNode root, int value){
        int count = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            count++;
            TreeNode node = q.poll();
            System.out.println(node.getValue());
            if(node.getValue() == value){
                return count;
            }

            node.getLeft().ifPresent(e-> q.add(e));
            node.getRight().ifPresent(e-> q.add(e));
        }

        return count;
    }



//Example: ("banana") ---> "aaannb"
    public String preferredOrder(String word){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : word.toCharArray()){
            int count = 1;
            if(map.containsKey(c)){
                count = map.get(c);
                count++;
                
            }
            map.put(c, count);
        }

        String pref = "";
        //Now we need to order map by key value desc
        Map<Character, Integer> sortedMap = map.entrySet().stream()
        .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for(char k : sortedMap.keySet()){
            int count = sortedMap.get(k);
            for(int i=0; i< count; i++){
                pref += k;
            }
        }
        System.out.println(pref);
        return pref;
    }


}

public class TestOrder {
    static {
        for(0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.00000000)
    }
}