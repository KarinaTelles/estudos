import java.util.Random;
import java.util.Scanner;

public class AdivinhadorDeNumeroAleatorio {
    Random random = new Random();
    int numeroGerado = random.nextInt(100);
    int chute = 0;
    Scanner scanner = new Scanner(System.in);

    public void fazAdivinhacao(){
        //System.out.println("Número gerado: " +numeroGerado);
        boolean acerto = false;
        leNumeroChutado();
        imprimeNumeros();
        int limiteTentativas = 5;

        for(int i=1; i<limiteTentativas && !acerto; i++) {
            if (chute == numeroGerado) {
                System.out.println("Você acertou");
                System.out.println("Número gerado: " +numeroGerado);
                acerto = true;
            } else {
                leNumeroChutado();
                imprimeNumeros();
            }
        }
    }

    public int leNumeroChutado(){
        System.out.println("Digite um número de 1 a 100: ");
        chute = scanner.nextInt();
        return chute;
    }

    public void imprimeNumeros() {
        System.out.println("Número chutado: " + chute);
        if(chute > numeroGerado){
            System.out.println("O número chutado é maior que o gerado");
        }
        if(chute < numeroGerado){
            System.out.println("O número chutado é menor que o gerado");
        }
    }
}
