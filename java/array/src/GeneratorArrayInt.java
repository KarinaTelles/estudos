public class GeneratorArrayInt {
    int[] anArrayOfInt;

    public GeneratorArrayInt(){
        anArrayOfInt = new int[10];
    }
    public int[] getAnArrayOfInt() {
        return anArrayOfInt;
    }

    public void setAnArrayOfInt(int[] anArrayOfInt) {
        this.anArrayOfInt = anArrayOfInt;
    }
    public void popular10ItensArray(){
        for(int i = 0; i< anArrayOfInt.length; i++){
            anArrayOfInt[i] = i+1;
        }
    }
}
