package algebra;

public class Termial {
    public int calculaTermial(int n){
        int termo = 0;
        if(n<=0 || n==1){
            System.out.println("Apenas números naturais, maiores que 1.");
        }
        while (n > 0){
            termo = termo + n;
            n--;
        }
        System.out.println("Resultado do termial pedido = " + termo);
        return termo;
    }
}
