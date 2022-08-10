package oop;

public interface BicicletaInterface {
    byte getMarcha();
    void setMarcha(byte novaMarcha);
    byte mudaMarcha(byte novaMarcha);
    byte getCadencia();
    void setCadencia(byte cadencia);
    short getVelocidade();
    void aumentaAVelocidade(short aumentoDeVelocidade);
    void freia(short perdaDeVelocidade);
    void imprimeValores();
}
