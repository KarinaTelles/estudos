package com.karina;

public class Main {

    public static void main(String[] args) {

    /*Código dos funcionários*/

    /*Tripulação técnica*/
    //0-Piloto,
    //1-Oficial,

    /*Tripulação cabine*/
    //2-Chefe de serviço de voo
    //3-Comissária


    /*Passageiros*/
    //4-Passageiro

	Voo voo = new Voo();

    String[] transporteDosTribulates0 = {"Maria"};
    voo.SmartFortwo(transporteDosTribulates0,0);

	String[] transporteDosTribulates1 = {"Ana"};
	voo.SmartFortwo(transporteDosTribulates1,1);

    String[] transporteDosTribulates2 = {"Luana","Nicoli","Joaquina"};
    voo.SmartFortwo(transporteDosTribulates2,2);

    voo.QuemEstaDirigindoOTransporteDeTripulantes(0);
    voo.QuemEstaDirigindoOTransporteDeTripulantes(1);
    voo.QuemEstaDirigindoOTransporteDeTripulantes(2);

    voo.SmartForTwoApenasFuncionário(2,3);

    }
}
