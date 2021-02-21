package com.karina;

import java.net.SocketAddress;
import java.net.StandardSocketOptions;

public class Voo {
    private String [] tripulacaoTecnica = {"Piloto", "Oficial 1", "Oficial 2"};
    private String [] tripulacaoCabine = {"Chefe de serviço de voo", "Comissária 1", "Comissária 2"};
    /*Tripulação técnica*/
    //0-corresponde ao Piloto, 1-corresponde ao Oficial 1, 2-Corresponde ao Oficial 2
    private int [] tripulacaoTecnicaInt = {0, 1, 2};
    //3-corresponde ao Chefe de serviço de voo, 4-corresponde a Comissária 1 e 5-corresponde a Comissária 2
    private int [] tripulacaoCabineInt = {3, 4, 5};

    public void SmartFortwo(String [] pessoas){
        if(pessoas.length > 2) {
            System.out.println("Smart Fortwo cheio");
        }
        else{
            for (int i = 0; i <pessoas.length; i++){
                System.out.println(pessoas[i]);
            }
        }
    }
    //public void QuemEstaDirigindo()
}
