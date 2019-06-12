package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number,degree;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        System.out.println("Enter a degree of this number: ");
        degree = input.nextInt();
        System.out.println(numDeg(number, degree) + " - result.");

        int[] arr = readArr();
        for(int i =0; i< arr.length; i++ ){
            System.out.println((i+1) +" item = " + arr[i]);
        }
    }

    public static int[] readArr() {
        int[] arr;
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of array: ");
        amount = input.nextInt();
        arr = new int[amount];
        for (int i = 0; i < amount; i++){
            System.out.println("Enter " + (i+1) + " item: ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int numDeg(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

}

