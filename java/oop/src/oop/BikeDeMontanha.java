package oop;

public class BikeDeMontanha extends Bicicleta{
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int novaMarcha) {
        mudaMarcha(novaMarcha);
        this.marcha = marcha;
    }
    private int mudaMarcha(int novaMarcha){
        if (novaMarcha > 7){
            novaMarcha = 7;
            this.marcha = novaMarcha;
            System.out.println("A marcha máxima é 7");
            return novaMarcha;
        }
        else if (novaMarcha < 1){
            novaMarcha = 1;
            this.marcha = novaMarcha;
            System.out.println("A marcha mínima é 1");
            return novaMarcha;
        }
        else{
            return novaMarcha;
        }
    }
}
