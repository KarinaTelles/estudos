package input;

import numero.NumeroAleatorio;

import java.util.Scanner;

public class TentativaFacil {
    Scanner sc = new Scanner(System.in);
    int numeroChutado = 0;
    int numeroGerado = 0;
    NumeroAleatorio numeroAleatorio = new NumeroAleatorio();

    public void LeChute(){
        System.out.println("Digite um número:");
        numeroChutado = sc.nextInt();
        imprimeNumeroChutado(numeroChutado);
        geraNumero();
        setNumeroChutado(numeroChutado);
        sc.close();
    }
    public void imprimeNumeroChutado(int i){
        System.out.println("NÚMERO CHUTADO: " + i);
    }
    public void setNumeroChutado(int i){
        this.numeroChutado = i;
    }
    public int getNumeroChutado(){
        return numeroChutado;
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
        int comparaNumeroGerado = pegaNumeroGerado();
        System.out.println("CHEGOU AQUI: " + i);
        System.out.println("CHEGOU AQUI NUMERO GERADO: " + comparaNumeroGerado);
        if(i == comparaNumeroGerado){
            System.out.println("ACERTOU O NÚMERO");
        }
        else{
            System.out.println("ERROU O NÚMERO");
        }
    }
}
