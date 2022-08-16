public class Array {
    int[] anArrayOfInt;
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;
    String[][]  names = {
        {"Mr. ", "Mrs. ", "Ms. "},
        {"Smith", "Jones"}
    };
    int[] anArray = {
            100, 200, 300,
            400, 500, 600,
            700, 800, 900, 1000
    };
    public Array() {
        anArrayOfInt = new int[10];
        anArrayOfBytes = new byte[10];
        anArrayOfShorts = new short[10];
        anArrayOfLongs = new long[10];
        anArrayOfFloats = new float[10];
        anArrayOfDoubles = new double[10];
        anArrayOfBooleans = new boolean[10];
        anArrayOfChars = new char[10];
        anArrayOfStrings = new String[10];
        /**Array Copy**/
        /**Exemplo de uso do método arrayCopy especificado na classe padrão do java System**/
        /** public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);**/
        /**The two Object arguments specify the array to copy from and the array to copy to.
        The three int arguments specify the starting position in the source array, the starting position in the destination array, and the number of array elements to copy.**/
        /**The following code declares an array of String elements. It uses the System.arraycopy() method to copy a subsequence of array components into a second array**/
        String [] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String [] copyTo = new String[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        for (String coffee: copyTo){
            System.out.println(coffee);
        }
    }
}
