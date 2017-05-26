/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10_Excercise_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ASUS
 */
public class Anagram {
    public static final int MAXARRAYLENGTH = 105;
    public static final int MINARRAYLENGTH = 1;
    public static final int MAXWORDLENGTH = 10;
    public static final int MINWORDLENGTH = 1;
    
    public static void main(String[] args) {
       String[] words = {"tea", "eat", "apple", "ate", "vaja", "cut", "java", "utc"};
       long startMs = System.currentTimeMillis();
       String[] sortedArr = toSortedArr(words);
       Set set = getSet(sortedArr);
       System.out.println("Size :"+set.size());
       getResult(set,sortedArr,words);
       long endMs = System.currentTimeMillis();
        System.out.println("Long :"+(endMs-startMs));
    }
    
    public static boolean isValidString(String[] words){
        boolean result = true;
        if(words.length < MINARRAYLENGTH && words.length >MAXARRAYLENGTH){
            result = false;
            System.out.print("invalid String!");
        }else
        for (int i = 0; i < words.length; i++) {
           if(words[i].length() < MINWORDLENGTH && words[i].length() > MAXWORDLENGTH ){
               result = false;
               System.out.print("Invalid String");
           } 
        }
        return result;
    }
    
    public static String[] toSortedArr(String[] arr){
        String[] temp = new String[arr.length];
        if(isValidString(arr)){
            for (int i = 0; i < arr.length; i++) {
                String currentStr = toSortedStr(arr[i]);
                temp[i] = currentStr;
            }
        }else{
            System.exit(0);
        }
        return temp;
    }
    public static String toSortedStr(String originalStr){
       char[] orginArr = originalStr.toCharArray();
       Arrays.sort(orginArr);
       originalStr =  String.valueOf(orginArr);
       System.out.println(originalStr);
       return originalStr;
    }
    
    public static Set<String> getSet(String[] sortedArr){
        Set<String> set = new TreeSet();
        for(String item : sortedArr){
            set.add(item);
        }
        return set;
    }
    
    public static List getResult(Set<String> set,String[] sortedArr,String[] originalArr){
        List results = new  ArrayList();
        for(String item : set){
            List items = new ArrayList();
            for (int i = 0; i < sortedArr.length; i++) {
                String currentStr = sortedArr[i];
                if(item.equals(currentStr)){
                    items.add(originalArr[i]);
                }
            }
            results.add(items);
        }
        System.out.println(results);
        return results;
    }
    
     
    
}
