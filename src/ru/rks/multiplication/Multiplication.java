package ru.rks.multiplication;

import java.util.Scanner;

public class Multiplication {


    public static void main(String[] args) {
        int firstFactor = input();
        int secondFactor = input();
        System.out.println("Произведение чисел " + firstFactor + " и " + secondFactor + "= " +
                calculate(firstFactor, secondFactor));

    }



    private static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        return scanner.nextInt();
    }

    private static int calculate(int firstFactor, int secondFactor) {
        int result = 0;

        if(firstFactor>secondFactor&&secondFactor>0) {

            int tmp;
            tmp = secondFactor;
            secondFactor = firstFactor;
            firstFactor = tmp;

        }

        if(firstFactor>secondFactor&&firstFactor<0){
            int tmp;
            tmp = secondFactor;
            secondFactor = firstFactor;
            firstFactor = tmp;
        }

        if (firstFactor > 0) {

            result = sum(firstFactor, secondFactor);

        }

        if (firstFactor < 0 && secondFactor > 0) {

            result = sum(firstFactor, secondFactor);

        }

        if (firstFactor < 0 && secondFactor < 0) {

            firstFactor = -firstFactor;
            secondFactor = -secondFactor;

            result = sum(firstFactor, secondFactor);

        }

        if (firstFactor == 0 || secondFactor == 0) {
            result = 0;
        }

        return result;
    }

    private static int sum(int first, int second) {
        int result = 0;

        for (int i = 0; i < first; i++) {
            result += second;
        }

        return result;
    }

}


