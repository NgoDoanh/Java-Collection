/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10_Excercise_Collection;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class SortedSquare {
    public static void main(String[] args) {
        int[] array = {-6, -4, 1, 2, 3, 5};
        array = squareItems(array);
        array = toSortedArr(array);
        display(array);
    }
    
    public static  int[] squareItems(int[] originalArr){
        int length = originalArr.length;
        for (int i = 0; i < length; i++) {
            String currentStr = String.valueOf(originalArr[i]);
            double currentDouble = Double.parseDouble(currentStr);
            double squaredValue  = Math.pow(currentDouble,currentDouble);
            originalArr[i] = Integer.parseInt(String.valueOf(squaredValue));
        }
        return originalArr;
    }
    
    public static int[] toSortedArr(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    
    public static void display(int[] arr){
        for(int item : arr){
            System.out.print("Item :"+item);
        }
    }
    
}
