package com.company;

import java.util.Random;

public class Main {
    public static String answer1 = "You may go out";
    public static String answer2 = "Better stay home";

    public static void main(String[] args) {
        System.out.println(option(46, 10));
        System.out.println(option(5, -10));
        System.out.println(option(32, 15));
        System.out.println(option(38, 0));
        System.out.println(option(10, 6));
        System.out.println(option(generateRandomAge(), 23));
    }

    public static String option(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return answer1;
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return answer1;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return answer1;
        } else {
            return answer2;
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();

        int Math = random.nextInt(35);
        return Math;

    }
}


