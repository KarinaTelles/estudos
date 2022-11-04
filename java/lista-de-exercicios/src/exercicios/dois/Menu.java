package exercicios.dois;

import java.util.Scanner;

public class Menu {
    private void criaLayoutMenuPrincipal(){
        System.out.println("1 - Aplicar pesquisa");
        System.out.println("2 - mostrar resultado");
        System.out.println("9 - fim");
    }
    private void criaLayoutMenu2() {
        System.out.println("Quem ganhou o jogo?");
        System.out.println("1 – Vencedor Time A");
        System.out.println("2 – Vencedor Time B");
        System.out.println("3 – Empate");
        System.out.println("9 – Sair");
        leEntradaMenu2();
    }
    public String leEntradaMenuPrincipal() {
        int opcaoMenuPrincipal = 0;
        do {
            criaLayoutMenuPrincipal();
            Scanner entradaMenuPrincipal = new Scanner(System.in);
            opcaoMenuPrincipal = entradaMenuPrincipal.nextInt();
            testaOpcaoSelecionadaMenuPrincipal(opcaoMenuPrincipal);
        } while (opcaoMenuPrincipal != 9);

        return "Opção selecionada menu principal: " + opcaoMenuPrincipal;
    }
    public String leEntradaMenu2(){
        int opcaoMenu2 = 0;
        Scanner entradaMenu2 = new Scanner(System.in);
        opcaoMenu2 = entradaMenu2.nextInt();
        testaOpcaoSelecionadaMenu2(opcaoMenu2);
        return "Opção selecionada menu 2: " +opcaoMenu2;
    }

    private int testaOpcaoSelecionadaMenu2(int opcaoMenu2) {
        int soma = 0;
        for(int timeA = 0;opcaoMenu2 != 1;timeA++){
            if(opcaoMenu2 == 1){
                soma = timeA+1;
                System.out.println("Quantidade votos time A: " + timeA);
            }
        }
//        if(opcaoMenu2 == 2){
//
//            timeB = timeB+1;
//            System.out.println(timeB);
//        }
//        if(opcaoMenu2 == 3){
//            timeC = timeC+1;
//            System.out.println(timeC);
//        }
        return soma;
    }

    public void testaOpcaoSelecionadaMenuPrincipal(int opcaoMenuPrincipal){
        if(opcaoMenuPrincipal == 1){
            criaLayoutMenu2();
            leEntradaMenu2();
        }
    }
}
