package oop;

public class Bicicleta {
    int cadencia = 0;
    int marcha = 0;
    int velocidade = 0;
    public Bicicleta() {
        this.cadencia = 0;
        this.marcha = 1;
        this.velocidade = 0;
    }
//    public Bicicleta (int cadencia, int marcha, int velocidade)
//    {
//        this.cadencia = cadencia;
//        this.marcha = marcha;
//        this.velocidade = velocidade;
//    }
    public void mudaACadencia(int novaCadencia){
        this.cadencia = novaCadencia;
    }
    public void mudaMarcha(int novaMarcha){
        if (novaMarcha > 6){
            this.marcha = 6;
        }
        else if (novaMarcha < 1){
            this.marcha = 1;
        }
        else{
            this.marcha = novaMarcha;
        }
    }
}
