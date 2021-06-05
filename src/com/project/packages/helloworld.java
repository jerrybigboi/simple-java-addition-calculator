package com.project.packages;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
         int num01;
         int num02;

         System.out.println("This is a addition calculator");
         System.out.println("Num01: ");

         Scanner userInput;
         userInput = new Scanner(System.in);
         num01 = userInput.nextInt();

         System.out.println("Num02: ");

         userInput = new Scanner(System.in);
         num02 = userInput.nextInt();

         int result = num01 + num02;

         System.out.println("The result is... " + result + "!");



    }

}
