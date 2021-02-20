package com.karina;

public class Voo {
    private String [] tripulacaoTecnica = {"Piloto", "Oficial 1", "Oficial 2"};
    private String [] tripulacaoCabine = {"Chefe de serviço de voo", "Comissária 1", "Comissária 2"};
    /*Tripulação técnica*/
    //0-corresponde ao Piloto, 1-corresponde ao Oficial 1, 2-Corresponde ao Oficial 2
    private int [] tripulacaoTecnicaInt = {0, 1, 2};
    //3-corresponde ao Chefe de serviço de voo, 4-corresponde a Comissária 1 e 5-corresponde a Comissária 2
    private int [] tripulacaoCabineInt = {3, 4, 5};

    public String[] getTripulacaoTecnica() {
        return tripulacaoTecnica;
    }

    public void setTripulacaoTecnica(String[] tripulacaoTecnica) {
        this.tripulacaoTecnica = tripulacaoTecnica;
    }

    public String[] getTripulacaoCabine() {
        return tripulacaoCabine;
    }

    public void setTripulacaoCabine(String[] tripulacaoCabine) {
        this.tripulacaoCabine = tripulacaoCabine;
    }

    public int[] getTripulacaoTecnicaInt() {
        return tripulacaoTecnicaInt;
    }

    public void setTripulacaoTecnicaInt(int[] tripulacaoTecnicaInt) {
        this.tripulacaoTecnicaInt = tripulacaoTecnicaInt;
    }

    public int[] getTripulacaoCabineInt() {
        return tripulacaoCabineInt;
    }

    public void setTripulacaoCabineInt(int[] tripulacaoCabineInt) {
        this.tripulacaoCabineInt = tripulacaoCabineInt;
    }
}
