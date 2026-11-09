public class ConversorDeTemperatura {
    public Integer converteDeCelsiusParaFahrenheit(int temperatura){
        int conversao = 0;
        conversao = (int) ((temperatura * 1.8) + 32);
        return conversao;
    }
}
