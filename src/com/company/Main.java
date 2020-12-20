package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Возраст: " + generateRandomAge(1,100) + ", можно ли идти гулять?");
    }
        public static int generateRandomAge(int min, int max){

        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }


}


