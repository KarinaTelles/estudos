package com.karina;

import java.net.SocketAddress;
import java.net.StandardSocketOptions;

public class Voo {
    private String [] tripulacaoTecnica = {"Piloto", "Oficial 1", "Oficial 2"};
    private String [] tripulacaoCabine = {"Chefe de serviço de voo", "Comissária 1", "Comissária 2"};

    public void SmartFortwo(String [] pessoas, int motorista){
        if(pessoas.length > 1) {
            System.out.println("Smart Fortwo cheio");
        }
        else if(motorista != 0 && motorista != 2){
            System.out.println("Essa pessoa não deveria estar aqui!");
        }
        else{
            for (int i = 0; i <pessoas.length; i++){
                System.out.println(pessoas[i]);
            }
        }
    }
    //aparentemente o chefe de serviço de voo e o chefe de serviço de bordo é a mesma pessoa pois nos integrantes totais do voo ele não é citado
    public void SmartForTwoApenasFuncionário(int motorista, int funcionário){
        if (motorista == 0 && funcionário !=3){
            System.out.println("Nenhum problema com essa viagem");
        }
        else if(motorista==2 &&funcionário!=1){
            System.out.println("Nenhum problema com essa viagem");
        }
        else if(motorista!=0 || motorista!=2){
            System.out.println("Essa viagem não pode acontecer");
        }
    }
    public void SmartForTwoEspecial(int motorista, int passageiro){
        if(motorista==5 && passageiro==6){
            System.out.println("Nenhum problema com essa viagem");
        }
        else{
            System.out.println("Presidiário tem que estar com o policial e não pode viajar sozinho");
        }
    }
    public void QuemEstaDirigindoOTransporteDeTripulantes(int motorista){
        if(motorista == 0){
            System.out.println(tripulacaoTecnica[0] + " dirigindo!");
        }
        else if(motorista == 2){
            System.out.println(tripulacaoCabine[0]+ " dirigindo!");
        }
        else{
            System.out.println("Essa pessoa não pode dirigir esse veículo!!");
        }
    }
    public void QuantasViagens(int numeroPassageiros){
        int resultado = numeroPassageiros/2;
        System.out.println("Serão necessárias "+ resultado+ " viagens");
    }

}
