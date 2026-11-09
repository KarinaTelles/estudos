package exercicios.dois;

import java.util.Scanner;

public class ReadFromMainMenu {

    public void readInputFromMainMenu() {
        int option = 0;
        double qualquerCoisa = 0.0;
        do {
            Scanner inputFromMainMenu = new Scanner(System.in);
            System.out.println("\t\t\t\t\t\tPESQUISA DE QUEM VAI GANHAR O JOGO NO PRÓXIMO FIM DE SEMANA");
            System.out.println("DIGITE 1, 2 OU 9: ");
            System.out.println("1 - Aplicar pesquisa");
            System.out.println("2 - mostrar resultado");
            System.out.println("9 - fim");
            option = inputFromMainMenu.nextInt();
            SetMenuLayout setMenuLayout = new SetMenuLayout();
            setMenuLayout.createLayoutMainMenu(option);
            if(option != 1 && option != 2 && option != 9){
                System.out.println("Respeite as regras!! Digite os número pedidos. (⋋▂⋌)");
            }
        }while (option != 9);
    }
}
