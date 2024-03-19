import java.util.Arrays;

public class Array {
    String twentyOneArray[] = new String[21];
    String phantomsOfHighSeas[]=
            {"Dead Men Tell No Tales", "The High Seas", "Edge of World", "Pirates", "The Gallows Jig", "Crossfire", "Oblivion"};
    int[] numeros = new int[5];
    String[] nomes = new String[10];
    int numero = numeros[2]; // Acessa o terceiro elemento do vetor "numeros"
    String nome = nomes[4]; // Acessa o quinto elemento do vetor "nomes"
    public void fillArray(){
        Arrays.fill(numeros, 0); // Atribui o valor 0 a todos os elementos
        Arrays.fill(nomes, " "); // Atribui a string vazia a todos os elementos
    }
    public void loopArray(){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
