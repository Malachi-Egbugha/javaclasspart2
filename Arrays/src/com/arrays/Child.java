package com.arrays;

import java.util.Scanner;

public class Child extends Parent {
    @Override
    public void show(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            int name = input.nextInt();
            System.out.println(name);
            System.out.println("Child");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
