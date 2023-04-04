import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenaStrings {
    public List<String> OrdenaStringOrdemAlfabetica(){
        String palavra;
        Collections collections;
        List<String> palavras = new ArrayList<String>();

        palavras.add("testI");
        palavras.add("testA");
        palavras.add("testE");

        Collections.sort(palavras);

        return palavras;
    }
}
