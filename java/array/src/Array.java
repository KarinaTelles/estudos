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
        anArrayOfInt[0] = 100;
        anArrayOfInt[1] = 200;
        anArrayOfInt[2] = 300;
        anArrayOfInt[3] = 400;
        anArrayOfInt[4] = 500;
        anArrayOfInt[5] = 600;
        anArrayOfInt[6] = 700;
        anArrayOfInt[7] = 800;
        anArrayOfInt[8] = 900;
        anArrayOfInt[9] = 1000;
        System.out.println("Element at index 0: " + anArrayOfInt[0]);
        System.out.println("Element at index 1: " + anArrayOfInt[1]);
        System.out.println("Element at index 2: " + anArrayOfInt[2]);
        System.out.println("Element at index 3: " + anArrayOfInt[3]);
        System.out.println("Element at index 4: " + anArrayOfInt[4]);
        System.out.println("Element at index 5: " + anArrayOfInt[5]);
        System.out.println("Element at index 6: " + anArrayOfInt[6]);
        System.out.println("Element at index 7: " + anArrayOfInt[7]);
        System.out.println("Element at index 8: " + anArrayOfInt[8]);
        System.out.println("Element at index 9: " + anArrayOfInt[9]);
    }
}
