package com.arrays;

import java.sql.*;
import java.util.Arrays;

public class Workingwitharrays {
    int a;
    int b;


    public static void main(String[] args) {
        Child a = new Child();
        a.show();
        /*
        try{
            String url = "jdbc:mysql://ekedc-nerc-sbt-db.mysql.database.azure.com/ekosbt";
            String username = "ZoneDev";
            String password = "NotABadPass785@#";
            Databaseoperations conndefination = new Databaseoperations(url,username,password);
            Connection conn = conndefination.Databaseconnection();
            Statement state = conn.createStatement();
            System.out.println("Database Connected Successfully");
            String getResult = "SELECT * FROM basefeeder";
            ResultSet resultSet =  state.executeQuery(getResult);
            //ResultSet resultSet = state.getResultSet();
            while (resultSet.next()){
                String VoltageLevel = resultSet.getString("VoltageLevel");
                System.out.println(VoltageLevel);
            }


        }
        catch (SQLException e){
            e.printStackTrace();

        }

         */



        System.out.println("Welcome");
        int[] numbers = {3, 1, 4, 5, 2};
        // Sort the array

        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


        for(int number : numbers){
            System.out.println(number);
        }


        WorkingArrayclass arrayoperations = new WorkingArrayclass(numbers);
        int maximum = arrayoperations.maximumval();
        int sum =arrayoperations.sumofarray();
        int[] sorted = arrayoperations.sortarray();
        System.out.println(Arrays.toString(sorted));
    }
}
