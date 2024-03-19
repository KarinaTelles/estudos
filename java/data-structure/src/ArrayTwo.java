import java.util.Arrays;
import java.util.List;

public class ArrayTwo {
    int[] arrayDeInteiro;
    int[] arrayDeVinte = new int[20];
    Integer[] arrayPreDef = {1,2,3, 4, 5, 6, 7, 8,9,10};
    int arraySize = arrayPreDef.length;
    public void percorreArray(){
        List<Integer> itens = Arrays.asList(arrayPreDef);
        itens.forEach(System.out::println);
    }

}
