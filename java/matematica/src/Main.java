import algebra.Fatorial;

public class Main {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        int recebeRetorno = 0;
        recebeRetorno = fatorial.calculaFatorial(6);
        recebeRetorno = fatorial.calculaFatorial(0);
        recebeRetorno = fatorial.calculaFatorial(1);

    }
}