/*
Name: Brian Gerhart
CSU ID: 2741107
CIS 265: Assignment 9
Description: In this assignment I created an arraylist and linkedlist and added 100,000 random integers into each list.  Then we use the .get() method to retrieve 
100,000 integers from both lists. And finally we insert 100,000 more integers into each list again. By using the .nanoTime() method we can calculate run times of 
these various operations. 
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.lang.*;

public class Assign9gerhart {
   public static void main(String[] args) {
      Random random = new Random();//creates random object to genterate numbers
      ArrayList<Integer> nums1 = new ArrayList<Integer>();//creates arraylist
         for(int i = 0; i <= 99999; i++) {//inserts 100,000 random integers 
             nums1.add(random.nextInt());
         }
      LinkedList<Integer> nums2 = new LinkedList<Integer>();//creates linkedList
         for(int i = 0; i <= 99999; i++) {
            nums2.add(random.nextInt());//inserts 100,000 random integers 
         }
   
               long startTime1 = System.nanoTime();//start time        
        for (int j = 0; j <= 99999; j++) {//get numbers from arraylist
            nums1.get(random.nextInt(nums1.size()));//get random number from any position in list 
        }       
               long endTime1 = System.nanoTime();//end time      
               long startTime2 = System.nanoTime();         
         for (int k = 0; k <= 99999; k++) {
            nums2.get(random.nextInt(nums2.size()));//get random number from any position in list 
         }    
               long endTime2 = System.nanoTime();//end time
               long startTime3 = System.nanoTime();//start time               
         for (int i = 0; i <= 99999; i++) {
        nums1.add(0, random.nextInt());//adds 100,000 integers to beginning of the arraylist 
         }
               long endTime3 = System.nanoTime();//end time
               long startTime4 = System.nanoTime();//start time      
         for (int i = 0; i <= 99999; i++) {
        nums2.add(0, random.nextInt());//adds 100,000 integers to the beginning of the linkedlist
         }
               long endTime4 = System.nanoTime();//end time      
        
        //print statements calculate time to run by subtracting start time from end time, and result is divided by 1,000,000 to output time in milliseconds. 
        System.out.println("Time for get in ArrayList(ms) "+(endTime1 - startTime1)/1000000);
        System.out.println("Time for get in LinkedList(ms) "+(endTime2 - startTime2)/1000000);
        System.out.println("Time for insertion in ArrayList(ms) "+(endTime3 - startTime3)/1000000);
        System.out.println("Time for insertion in LinkedList(ms) "+(endTime4 - startTime4)/1000000);
        
   }
}  