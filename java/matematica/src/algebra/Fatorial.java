package algebra;

public class Fatorial implements AnaliseCombinatoria {
    public int calculaFatorial(int n){
        int fator = 1;
        if (n==0 || n==1){
            System.out.println("Resultado do fatorial pedido = " + 1);
        }
        else{
            while (n > 1){
                fator = fator * n;
                n--;
            }
            System.out.println("Resultado do fatorial pedido = " + fator);
        }
    return fator;
    }

}
