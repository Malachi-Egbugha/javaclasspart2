package com.inheritance;

public class Parent {
    /*
    int height;
    int weight;

    public Parent(int height, int weight) {
//        this.height = height;
//        this.weight = weight;
    }

     */


    public int Bmi(int height, int weight ){
        return weight/(height * height);


    }
    public void Test(){
        System.out.print("Test");
    }
}
