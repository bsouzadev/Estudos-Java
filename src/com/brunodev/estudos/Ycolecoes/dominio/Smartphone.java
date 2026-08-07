package com.brunodev.estudos.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca){
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Sobre escrevendo o equals de ‘Smartphone’ para ele não comparar mais a referência das variáveis, e sim um conteúdo (atributo) especifico.

    //Tem algumas regras para fazer isso:
    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    //Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true.
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null.
    //Para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        //this é o objeto que chamou o método.
        if(this == obj) return true; //compara se as duas variáveis apontam para o mesmo end de memória.

        if(this.getClass() != obj.getClass()) return false; //verifica se os objetos são de classes diferentes.

        //O nosso critério de comparação está sendo o número do serial.
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smartphone.serialNumber);//Esse equals é o da string, pois serialNumber é uma! Então comparamos se o número do serial é igual.

    }
}
