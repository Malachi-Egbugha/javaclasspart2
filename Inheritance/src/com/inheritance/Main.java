package com.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter score");
       int score = scanner.nextInt();
        System.out.println("Please enter Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter Type(Graduate/Postgraduate");
        String type = scanner.nextLine();
        Student s;
        System.out.print(score);

        if(type == "Graduate"){
            s = new Graduate(score, name);
        }
        else {
            s = new Undergraduate(score, name);
        }
        String result = s.Pass();
        System.out.println(result);

        }



}
