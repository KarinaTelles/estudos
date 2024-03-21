public class BidimensionalArray {
    //tipo_de_dado nome_da_matriz[][] = new tipo_de_dado[linhas][colunas];
    //Exemplo:
    int[][] matrizNumeros = new int[3][4]; // Declara uma matriz de 3 linhas e 4 colunas de inteiros
    String[][] matrizNomes = new String[2][5]; // Declara uma matriz de 2 linhas e 5 colunas de Strings

    public void inicializacao(){
        //Inicialização:
        matrizNumeros[0][0] = 10;
    }
    //Atribuição em bloco:
    //É possível inicializar todos os elementos de uma matriz com o mesmo valor:
    public void inicializaMatriz(){
        int[][] matrizNumeros = new int[3][4];
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                matrizNumeros[i][j] = 0;
            }
        }
        String[][] matrizNomes = new String[2][5];
        for (int i = 0; i < matrizNomes.length; i++) {
            for (int j = 0; j < matrizNomes[i].length; j++) {
                matrizNomes[i][j] = " ";
            }
        }
    }
    public void percorreMatriz(){
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.println(matrizNumeros[i][j]);
            }
        }
        for (String[] linha : matrizNomes) {
            for (String nome : linha) {
                System.out.println(nome);
            }
        }
    }
//            length: Retorna o número de linhas da matriz.
//            matriz[i].length: Retorna o número de colunas da linha i da matriz.
//            Arrays.toString(matriz): Converte a matriz em uma String para impressão.
//            Arrays.deepToString(matriz): Converte a matriz em uma String multidimensional para impressão.
//            Arrays.sort(matriz): Ordena os elementos da matriz em ordem crescente (ap
}
