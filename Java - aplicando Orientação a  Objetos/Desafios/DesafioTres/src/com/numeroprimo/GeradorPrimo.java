package com.numeroprimo;
public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int atual) {
        int proximo = atual + 1;
        while (true) {
            if (verificarPrimalidade(proximo)) {
                return proximo;
            }
            proximo++;
        }
    }
}
