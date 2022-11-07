package exercicios.dois;

import java.util.Scanner;

public class readFromMainMenu {
    public String readInputFromMainMenu() {
        int option = 0;
        do {
            Scanner inputFromMainMenu = new Scanner(System.in);
            option = inputFromMainMenu.nextInt();
        } while (option != 9);

        return "Opção selecionada menu principal: " + option;
    }

}
