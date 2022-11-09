package exercicios.dois;

public class TestSelectedOptionMenu2 {
    private int testSelectedOptionFromMenu2(int option) {
        int soma = 0;
        for(int timeA = 0;option != 1;timeA++){
            if(option == 1){
                soma = timeA+1;
                System.out.println("Quantidade votos time A: " + timeA);
            }
        }
        return soma;
    }
}
