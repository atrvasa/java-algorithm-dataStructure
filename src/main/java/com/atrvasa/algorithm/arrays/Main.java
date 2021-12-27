package com.atrvasa.algorithm.arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 70;
        intArray[1] = -35;
        intArray[2] = 5;
        intArray[3] = 16;
        intArray[4] = -9;
        intArray[5] = 1;
        intArray[6] = -43;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 16) {
                index = i;
                break;
            }
        }

        System.out.println("---------------------");
        System.out.println(String.format("index of '16' is %s", index));
    }
}
