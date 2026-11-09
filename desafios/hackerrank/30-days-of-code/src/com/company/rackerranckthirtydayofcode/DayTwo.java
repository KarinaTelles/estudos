package com.company.rackerranckthirtydayofcode;

import java.util.Locale;
import java.util.Scanner;

/*
* Complete the code in the editor below. The variables i,d and s are already declared and initialized for you. You must:
* Declare 3 variables: one of type int, one of type double, and one of type String.
* https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
* Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
* https://www.guj.com.br/t/nextdouble-nao-aceita-ponto/53803/2
 */

public class DayTwo {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    int typeInt = 0;
    double typeDouble = 0.0;
    String inputString = "";

    Scanner scan = new Scanner(System.in);

    public void StringScanner(){
        System.out.println("Digite aqui sua String: ");
        inputString = scan.nextLine();
    }
    public int IntScanner(){
        System.out.println("Digite aqui seu Int: ");
        typeInt = scan.nextInt();
        return typeInt;
    }

    public void DoubleScanner(){
        scan.useLocale(Locale.ENGLISH);
        System.out.println("Digite aqui seu Double: ");
        typeDouble = scan.nextDouble();
    }
    public void PrintSumInt(int typeInt){
        System.out.println(typeInt);
        this.typeInt = typeInt;

    }
}
