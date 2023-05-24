public class Conversao {
    public Integer CelsiusToFahrenheit(int temperatura){
        int conversao = 0;
        conversao = (int) ((temperatura * 1.8) + 32);
        return conversao;
    }
}
