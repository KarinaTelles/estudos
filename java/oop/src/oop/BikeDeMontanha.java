package oop;

public class BikeDeMontanha extends CerejaBicicletas {
    public byte getMarcha() {
        return marcha;
    }
    public void setMarcha(byte novaMarcha){
        if (novaMarcha > 7){
            novaMarcha = 7;
            this.marcha = novaMarcha;
            System.out.println("A marcha máxima é 7");
        }
        else if (novaMarcha < 1){
            novaMarcha = 1;
            this.marcha = novaMarcha;
            System.out.println("A marcha mínima é 1");
        }
        else{
            this.marcha = novaMarcha;
        }
    }
    public void imprimeValores() {
        System.out.println("Bike de montanha: Cadência: " +
                cadencia + " Bike de montanha: Velocidade: " +
                velocidade + " Bike de montanha: Marcha: " + marcha);
    }

}
