package com.example.harmonicnumfinderwitharray;

public class HarmonicNumber {
    public static void main(String[] args) {

        //Find avarage numbers in array
        /*int[] list = {1,5,9,4,5};
        double sum = 0.0;
        for (int numbers : list) {
            sum += numbers;
        }
        System.out.println(sum / list.length);*/

        int [] list = {1,5,7,4,8};

        double sum = 0.0;

        for(int numbers : list){

            sum += 1.0 / numbers;
        }
         double harmonicNumber =  list.length / sum;

        System.out.println("Harmonic numbers : " + harmonicNumber);
    }
}
