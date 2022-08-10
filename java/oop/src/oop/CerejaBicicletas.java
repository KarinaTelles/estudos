package oop;
public class CerejaBicicletas implements BicicletaInterface {
    int cadencia = 0;
    int marcha = 0;
    int velocidade = 0;
    public CerejaBicicletas() {
        this.cadencia = 0;
        this.marcha = 1;
        this.velocidade = 0;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int novaMarcha) {
        mudaMarcha(novaMarcha);
        this.marcha = marcha;
    }
    public int mudaMarcha(int novaMarcha){
        if (novaMarcha > 6){
            novaMarcha = 6;
            this.marcha = novaMarcha;
            System.out.println("A marcha máxima é 6");
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
    public int getCadencia() {
        return cadencia;
    }
    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public void aumentaAVelocidade(int aumentoDeVelocidade){
        this.velocidade = this.velocidade + aumentoDeVelocidade;
    }
    public void freia(int perdaDeVelocidade){
        this.velocidade = this.velocidade - perdaDeVelocidade;
    }
    public void imprimeValores() {
        System.out.println("cadência:" +
                this.cadencia + " velocidade:" +
                this.velocidade + " marcha:" + this.marcha);
    }
}
