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
    public void setMarcha(byte novaMarcha) {
        mudaMarcha(novaMarcha);
        this.marcha = marcha;
    }
    public byte mudaMarcha(byte novaMarcha){
        if (novaMarcha > 6){
            novaMarcha = 6;
            marcha = novaMarcha;
            System.out.println("A marcha máxima é 6");
            return novaMarcha;
        }
        else if (novaMarcha < 1){
            novaMarcha = 1;
            marcha = novaMarcha;
            System.out.println("A marcha mínima é 1");
            return novaMarcha;
        }
        else{
            return novaMarcha;
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
        System.out.println("cadência:" +
                cadencia + " velocidade:" +
                velocidade + " marcha:" + marcha);
    }
}
