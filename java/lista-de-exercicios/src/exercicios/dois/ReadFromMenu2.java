package exercicios.dois;

import java.util.Scanner;

public class ReadFromMenu2 {
    public String readFromMenu2(){
        int option = 0;
        Scanner inputFromMenu2 = new Scanner(System.in);
        option = inputFromMenu2.nextInt();
        return "Opção selecionada menu 2: " +option;
    }
}
