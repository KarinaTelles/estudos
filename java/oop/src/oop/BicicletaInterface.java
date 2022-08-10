package oop;

public interface BicicletaInterface {
    int getMarcha();
    void setMarcha(int novaMarcha);
    int mudaMarcha(int novaMarcha);
    int getCadencia();
    void setCadencia(int cadencia);
    int getVelocidade();
    void aumentaAVelocidade(int aumentoDeVelocidade);
    void freia(int perdaDeVelocidade);
    void imprimeValores();
}
