package com.leetcode.romantointeger;

public class EfficientSolutionRomanToInteger {

    public static void main(String[] args) {

        //sample entry
        String romanNr = "XVI";

        int prev = 0;
        int sum = 0;
        int number = 0;

        for ( int i = romanNr.length() - 1 ; i >= 0 ; i--){
            switch ( romanNr.charAt(i) ){
                case 'I': number = 1;break;
                case 'X': number = 10;break;
                case 'C': number = 100;break;
                case 'V': number = 5;break;
                case 'L': number = 50;break;
                case 'D': number = 500;break;
                case 'M': number = 1000;break;
            }
            if ( number < prev){
                sum -= number;
            }else{
                sum += number;
            }

            prev = number;

        }

        System.out.println("Roman Number: " + romanNr + " = " + sum );






    }

}
