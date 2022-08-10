package oop;

public interface BicicletaInterface {
    int getMarcha();
    void setMarcha(int novaMarcha);
    int mudaMarcha(int novaMarcha);
    byte getCadencia();
    void setCadencia(byte cadencia);
    int getVelocidade();
    void aumentaAVelocidade(int aumentoDeVelocidade);
    void freia(int perdaDeVelocidade);
    void imprimeValores();
}
