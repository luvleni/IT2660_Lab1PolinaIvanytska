//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Polina Ivanytska
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  
    // makes the maximum of two integers 
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // creates the minimum of two integers
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // combine the sum of all elements
    public int sum(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total;
    }

    // the average number 
    public int average(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total / nums.length; 
    }

    // brings back the maximum value
    public int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // the same but with the minimum value
    public int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}