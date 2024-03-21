import java.util.Arrays;

public class Array {
    String twentyOneArray[] = new String[21];
    String[] names = new String[10];
    String phantomsOfHighSeas[]=
            {"Dead Men Tell No Tales", "The High Seas", "Edge of World", "Pirates", "The Gallows Jig", "Crossfire", "Oblivion"};
    int[] numbers = new int[5];
    int three = 3;
    String karina = "Karina";
    String nome = names[4]; // Acessa o quinto elemento do vetor "nomes"
    public void fillArrayWithZero(){
        Arrays.fill(numbers, 0); // Atribui o valor 0 a todos os elementos
    }
    public void fillArrayWithBlank(){
        Arrays.fill(names, " "); // Atribui a string vazia a todos os elementos
    }
    public void loopArrayHighSeas(){
        for (int i = 0; i < phantomsOfHighSeas.length; i++) {
            System.out.println(i+ " - " + phantomsOfHighSeas[i]);
        }
        for (String phs : phantomsOfHighSeas) {
            System.out.print(phs + ", ");
        }
    }
    public void loopArrayNumber(){
        fillArrayWithZero();
        numbers[2] = three;
        for (int nmb : numbers){
            System.out.println(nmb);
        }
    }
    public void loopArrayString(){
        fillArrayWithBlank();
        names[0] = karina;
        for(String nm : names){
            System.out.println(nm);
        }
    }

}
