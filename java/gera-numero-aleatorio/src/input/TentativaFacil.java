package input;

import numero.NumeroAleatorio;

import java.util.Scanner;

public class TentativaFacil {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int numeroGerado = 0;
    NumeroAleatorio numeroAleatorio = new NumeroAleatorio();

    public void LeChute(){
        System.out.println("Digite um número:");
        i = sc.nextInt();
        imprimeNumeroChutado(i);
        geraNumero();
        setNumeroChutado(i);
        sc.close();
    }
    public void imprimeNumeroChutado(int i){
        System.out.println("NÚMERO CHUTADO: " + i);
    }
    public void setNumeroChutado(int i){
        this.i = i;
    }
    public int getNumeroChutado(){
        return i;
    }
    public void geraNumero(){
        int salvaNumeroGerado = numeroAleatorio.geraNumeroAleatorioDeUmAMil();
        numeroGerado =  salvaNumeroGerado;
    }
    public int pegaNumeroGerado(){
        return numeroGerado;
    }
    public void testaSeNumeroChutadoEhIgualAoGerado(){
        int i = getNumeroChutado();
        int numeroGerado = pegaNumeroGerado();
        System.out.println("CHEGOU AQUI: " + i);
        System.out.println("CHEGOU AQUI NUMERO GERADO: " + numeroGerado);
        if(i == numeroGerado){
            System.out.println("ACERTOU O NÚMERO");
        }
        else{
            System.out.println("ERROU O NÚMERO");
        }
    }
}
