package exercicios.dois;

public class testSelectedOption {
    public void testSelectedOptionFromMainMenu(int option){
        if(option == 1){
        }
    }
    private int testSelectedOptionFromMenu2(int option) {
        int soma = 0;
        for(int timeA = 0;option != 1;timeA++){
            if(option == 1){
                soma = timeA+1;
                System.out.println("Quantidade votos time A: " + timeA);
            }
        }
//        if(option == 2){
//            timeB = timeB+1;
//            System.out.println(timeB);
//        }
//        if(option == 3){
//            timeC = timeC+1;
//            System.out.println(timeC);
//        }
        return soma;
    }
}
