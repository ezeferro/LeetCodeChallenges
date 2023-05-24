package com.leetcode.romantointeger;

/**
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 */
class Solution {

    public static void main(String[] args) {

        String input = "XXIV";
        int length   = input.length();
        int sum = 0;
        int modif = 1;
        boolean isIXC = false;
        boolean isLastCharacter = false;
        char nextChar;
        char c;
        char[] romanNumber = input.toCharArray();

        for ( int i = 0 ; i <= length - 1 ; i++ ) {
            
            modif = 1;
            c = romanNumber[i];
            isIXC = c == 'I' || c == 'X' || c == 'C';
            isLastCharacter = i == length - 1;


            if( isIXC && !isLastCharacter){
                    nextChar = romanNumber[i+1];
                    if( ( ( c == 'I' ) && ( nextChar == 'V' || nextChar == 'X') ) ||
                        ( ( c == 'X' ) && ( nextChar == 'L' || nextChar == 'C') ) ||
                        ( ( c == 'C' ) && ( nextChar == 'D' || nextChar == 'M') ) ) {
                        modif *= -1;
                    }
            }

            switch (c){
                case 'I': sum = sum + (1 * modif); break;
                case 'X': sum = sum + (10 * modif); break;
                case 'C': sum = sum + (100 * modif); break;
                case 'V': sum += 5; break;
                case 'L': sum += 50; break;
                case 'D': sum += 500; break;
                case 'M': sum += 1000; break;
            }

        }

        System.out.println(sum);

        }



    }