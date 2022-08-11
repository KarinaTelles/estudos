package oop;
public class CerejaBicicletas implements BicicletaInterface {
    byte cadencia = 0;
    byte marcha = 0;
    short velocidade = 0;
    public CerejaBicicletas() {
        this.cadencia = 0;
        this.marcha = 1;
        this.velocidade = 0;
    }
    public byte getMarcha() {
        return marcha;
    }
    public void setMarcha(byte novaMarcha){
        if (novaMarcha > 6){
            novaMarcha = 6;
            marcha = novaMarcha;
            System.out.println("Cereja Bicicletas: A marcha máxima é 6");
        }
        else if (novaMarcha < 1){
            novaMarcha = 1;
            marcha = novaMarcha;
            System.out.println("Cereja Bicicletas: A marcha mínima é 1");
        }
        else{
            marcha = novaMarcha;
        }
    }
    public byte getCadencia() {
        return cadencia;
    }
    public void setCadencia(byte cadencia) {
        this.cadencia = cadencia;
    }

    public short getVelocidade() {
        return velocidade;
    }
    public void aumentaAVelocidade(short aumentoDeVelocidade){
        velocidade = (short)(velocidade + aumentoDeVelocidade);
    }
    public void freia(short perdaDeVelocidade){
        velocidade = (short)(velocidade - perdaDeVelocidade);
    }
    public void imprimeValores() {
        System.out.println("Cereja Bicicletas: Cadência: " +
                cadencia + " Cereja Bicicletas: Velocidade: " +
                velocidade + " Cereja Bicicletas: Marcha: " + marcha);
    }
}
