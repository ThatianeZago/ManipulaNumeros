package manipulanumeros;

class Carro {
    
    static void calculaValorFinal() {
        double custoFab,custoFinal;
    System.out.println("Insira o valor do veículo: ");
    custoFab = ManipulaNumeros.ler.nextDouble();
    custoFinal = custoFab+(custoFab*0.28)+(custoFab*0.45);
    System.out.println("Custo final do veículo: "+custoFinal);
}
}