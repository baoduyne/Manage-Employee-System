package com.mycompany.app.week2.code1;

public class Recursion {
        public static int sum(int[] array, int n) {
            if (n == 1)
                return array[0];
            else
                return array[n - 1] + sum(array, n - 1);
        }
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int result = sum(numbers, numbers.length);
            System.out.println("Tổng của dãy số là: " + result);
        }
    }
    
