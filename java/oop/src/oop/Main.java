package oop;

public class Main {
    public static void main(String[] args) {
        Bicicleta bikeBase = new Bicicleta();
        bikeBase.setMarcha(7);
        bikeBase.getMarcha();
        bikeBase.getVelocidade();
        bikeBase.aumentaAVelocidade(8);
        bikeBase.getVelocidade();
        bikeBase.aumentaAVelocidade(8);
        bikeBase.getVelocidade();
        BikeDeMontanha bikeDeMontanha = new BikeDeMontanha();
        bikeDeMontanha.setMarcha(8);
    }
}