package com.company.rackerranckthirtydayofcode;

import java.util.Scanner;

public class DayOne {
    public void standInput(){
        // write your code here
        System.out.println("Digite aqui:");
        //Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        //Read a full line of input from stdin and save it to our variable, inputString
        String inputString = scan.nextLine();
        //Clone the scanner object, because we've finished reading all the input stdin needed for this challenge.
        scan.close();
        //Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World");
        System.out.println(inputString);
    }
}
