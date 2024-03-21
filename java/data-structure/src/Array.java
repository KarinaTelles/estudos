import java.util.Arrays;
import java.util.List;

public class Array {
    String twentyOneArray[] = new String[21];
    String[] names = new String[10];
    String phantomsOfHighSeas[]=
            {"Dead Men Tell No Tales", "The High Seas", "Edge of World", "Pirates", "The Gallows Jig", "Crossfire", "Oblivion"};
    int[] numbers = new int[5];
    int three = 3;
    String karina = "Karina";
    String fouth = names[4];
    int[] arrayDeInteiro;
    int[] arrayDeVinte = new int[20];
    Integer[] arrayPreDef = {1,2,3, 4, 5, 6, 7, 8,9,10};
    int arraySize = arrayPreDef.length;
    public void fillArrayWithZero(){
        Arrays.fill(numbers, 0);
    }
    public void fillArrayWithBlank(){
        Arrays.fill(names, " ");
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
    public void percorreArray(){
        List<Integer> itens = Arrays.asList(arrayPreDef);
        itens.forEach(System.out::println);
        System.out.println("Bio == Ø.");
    }

}
