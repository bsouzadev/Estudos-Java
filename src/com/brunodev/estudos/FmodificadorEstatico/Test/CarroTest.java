package com.brunodev.estudos.FmodificadorEstatico.Test;

import com.brunodev.estudos.FmodificadorEstatico.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Bmw", 280);
        Carro carro2 = new Carro("Mustang", 275);
        Carro carro3 = new Carro("Camaro azul", 290);
        
        Carro.velocidadeLim = 200; //se acessa a variavél pela propia classe porque ela é static.

        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }    
}
