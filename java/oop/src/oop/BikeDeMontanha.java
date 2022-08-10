package oop;

public class BikeDeMontanha extends CerejaBicicletas {
    public byte getMarcha() {
        return marcha;
    }
    public void setMarcha(byte novaMarcha) {
        mudaMarcha(novaMarcha);
        this.marcha = marcha;
    }
    public byte mudaMarcha(byte novaMarcha){
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
