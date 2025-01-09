package com.arrays;
import java.util.Arrays;




public class WorkingArrayclass {
    private  int[] number;

    public WorkingArrayclass(int[] number) {
        this.number = number;
    }

//maximum value of an array
    public int maximumval(){
        int max = this.number[0];

        for(int i =0; i < this.number.length; i++){

            if(this.number[i] > max){
                max=this.number[i];
            }
        }
         return max;

    }
    //sum of array
    public int sumofarray(){
        int sum = this.number[0];
        for(int i=1; i < this.number.length; i++){
            sum+=this.number[i];
        }
        return sum;
    }
    //sort array
    public int[] sortarray(){
        Arrays.sort(this.number);
        return this.number;
    }


}
