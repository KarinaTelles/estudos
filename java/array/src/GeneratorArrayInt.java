public class GeneratorArrayInt {
    private int[] anArrayOf10Int;
    private int[] anArrayOf100Int;
    public GeneratorArrayInt(){
        anArrayOf10Int = new int[10];
        anArrayOf100Int = new int[10];
    }
    public int[] getAnArrayOf10Int() {
        return anArrayOf10Int;
    }

    public int[] getAnArrayOf100Int() {
        return anArrayOf100Int;
    }

    public void popular10ItensNoArrayDe1a10(){
        int incremento = 0;
        for(int index = 0; index< anArrayOf10Int.length; index++){
            anArrayOf10Int[index] = incremento+=1;
        }
    }
    public void popula10ItensNoArrayDe100a1000(){
        int incremento = 0;
        for(int index = 0; index< anArrayOf100Int.length; index++){
            anArrayOf100Int[index] = incremento+=100;
        }
    }
    public void impressaoBonitaDoArrayDe10(){
        for (int index = 0; index< anArrayOf10Int.length; index++) {
            System.out.println("Element at index " + index +": "  + anArrayOf10Int[index]);
        }
        System.out.println(anArrayOf10Int.length);
    }
}
