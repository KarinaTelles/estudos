package oop;

public class Main {
    public static void main(String[] args) {
        CerejaBicicletas cerejaBicicletas = new CerejaBicicletas();
        cerejaBicicletas.setMarcha((byte) 7);
        cerejaBicicletas.getMarcha();
        cerejaBicicletas.getVelocidade();
        cerejaBicicletas.aumentaAVelocidade((short) 8);
        cerejaBicicletas.getVelocidade();
        cerejaBicicletas.aumentaAVelocidade((short) 8);
        cerejaBicicletas.getVelocidade();
        BikeDeMontanha bikeDeMontanha = new BikeDeMontanha();
        bikeDeMontanha.setMarcha((byte) 8);
        cerejaBicicletas.imprimeValores();
        bikeDeMontanha.imprimeValores();
    }
}