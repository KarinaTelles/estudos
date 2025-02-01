import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";

        for(int i=1;scanner.hasNext()==true;i++){
            scanner.hasNext();
            line = scanner.nextLine();
            System.out.println(i + " " + line);
        }
    }
}