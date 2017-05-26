/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10_Excercise_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author ASUS
 */
public class CountedArray {
    public static void main(String[] args) {
        int[] nums = {3, 8, 4, 1};
        getResult(nums);
    }
    
    public static void getResult(int[] arr){
        List<Integer> list = new LinkedList();
        List<Integer> subList = new LinkedList();
        Comparator<Integer> c =  (s1,s2) -> s1.compareTo(s2);
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        Arrays.sort(arr);
        int minValue = arr[0];
        
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int current = list.get(i);
            current--;
            int number = 0;
            subList = list.subList(i,size);
            
            while(current>=minValue){
                if(subList.contains(current)){
                   number++; 
                }
            }
            arr[i] = number;
        }

        System.out.println(arr);
    }
    

    
}
