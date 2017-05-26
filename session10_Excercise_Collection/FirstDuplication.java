/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10_Excercise_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ASUS
 */
public class FirstDuplication {

    public static void main(String[] args) {
        int[] array = {2, 3, 3, 1, 5, 2};
        test(array);
    }

    public static void test(int[] arr) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();

        for (int item : arr) {
            list1.add(item);
        }
        int length = list1.size();
        int i = 0;
        while (length != 0) {
            int current = list1.get(i);
            list1.remove(i);
            if (list1.contains(current)) {
                int index = list1.lastIndexOf(current);
                index++;
                if (index > i) {
                    list2.add(index);
                    System.out.println(current + " - " + index);
                }
                boolean check = true;
            }
            list1.add(i, current);
            i++;
            System.out.println(current);
            length--;
        }
        Object[] indexs = (Object[]) list2.toArray();
        Arrays.sort(indexs);
        int index = Integer.parseInt(String.valueOf(indexs[0]));
        System.out.println("Mix duplicate number: "+list1.get(index));
    }

}
