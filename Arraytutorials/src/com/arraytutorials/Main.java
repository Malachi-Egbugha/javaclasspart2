package com.arraytutorials;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        //datatype []  arrayname
        /*
        declaring and initializing an array
        to declare an array
        datatype []  arrayname
        */
        int[] numbers = {1,9,6,2,7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //System.out.println(sumofarray(numbers));
        //in the above method you decalred and initialize the array in a sngle line
        int[] numbers2 = new int[6];
        numbers2[0] = 6;
        //looping through an array
        /*
        there ways to loop through an array
         */
        //for loop
        //enhance for loop
        //looping through an array using for loop
        /*
        for(initializer; condition; increment){
        }
         */
        for(int i =0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);
        }
        }
        public static int sumofarray(int[] ar){
        //complete this function to calculate the sum of an array (ar) passed as a parameter
           //initialize a sum variable to 0-
            int sum =0;
           //loop throught the elements of the array and add it to the sum
            for(int i =0; i < ar.length; i++){
                sum=sum + ar[i];
                //sum+=ar[i];

            }
            return  sum;

        }
        //classwort
        //i can rerite the larget number methods
        public static int largestnumners(int[] ar){
            int[] input = ar;
            Arrays.sort(input);
            return input[input.length - 1];

        }
    public static int largestnumberofanaaar(int[] ar){
        int max = ar[0];
        // return the largest element of the array passed as parameter
        for(int i = 1; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        //example: {3,8,9,2}
        return max;
    }


}
