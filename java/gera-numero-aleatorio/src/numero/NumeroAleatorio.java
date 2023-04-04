package numero;

import java.util.Random;

public class NumeroAleatorio {
    Random rnd = new Random();
    public int geraNumeroAleatorioDeUmAMil(){
    int numero = rnd.nextInt(1000);
    System.out.println("NÚMERO GERADO: " + numero);
    return numero;
    }
    public void geraNumeroAleatorioDeUmACincoMil(){
    int numero = rnd.nextInt(5000);
    System.out.println("NÚMERO GERADO: " + numero);
    }
    public void geraNumeroAleatorioDeUmADezMil(){
    int numero = rnd.nextInt(10000);
    System.out.println("NÚMERO GERADO: "+ numero);
    }
}
