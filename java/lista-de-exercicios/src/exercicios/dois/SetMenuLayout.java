package exercicios.dois;

import java.util.Scanner;

public class SetMenuLayout {
    public void createLayoutMainMenu(int option){
        switch (option) {
            case 1:
                createLayoutMenu2();
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                break;
            case 9:
                System.out.println("Fim");
                System.out.println("\n");
        }
    }
    public void createLayoutMenu2() {
        System.out.println("\t\t\t\t\t\tESCOLHA QUEM SERÁ O VENCEDOR");
        System.out.println("DIGITE 1, 2, 3 OU 9: ");
        System.out.println("1 – Vencedor será o time A");
        System.out.println("2 – Vencedor será o time B");
        System.out.println("3 – Será um empate");
        System.out.println("9 – Sair da pesquisa");
        int option = 0;
        Scanner inputFromMainMenu = new Scanner(System.in);
        option = inputFromMainMenu.nextInt();
        int voto = 0;
        TestSelectedOptionMainMenu testSelectedOptionMainMenu = new TestSelectedOptionMainMenu();
            switch (option) {
                case 1:
                    System.out.println("Voto realizado: 1 – Vencedor será o time A");
                    System.out.println("\n");
                    testSelectedOptionMainMenu.setTimeA(voto);
                    break;
                case 2:
                    System.out.println("Voto realizado: 2 – Vencedor será o time B");
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Voto realizado: 3 – Será um empate");
                    System.out.println("\n");
                case 9:
                    System.out.println("9 – Sair da pesquisa");
                    System.out.println("\n");
            }
        int a = testSelectedOptionMainMenu.getTimeA();
        System.out.println(a);
    }
}
