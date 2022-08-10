package oop;

public interface BicicletaInterface {
    byte getMarcha();
    void setMarcha(byte novaMarcha);
    byte mudaMarcha(byte novaMarcha);
    byte getCadencia();
    void setCadencia(byte cadencia);
    int getVelocidade();
    void aumentaAVelocidade(int aumentoDeVelocidade);
    void freia(int perdaDeVelocidade);
    void imprimeValores();
}
