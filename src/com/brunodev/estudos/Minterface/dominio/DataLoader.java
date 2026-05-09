package com.brunodev.estudos.Minterface.dominio;

//‘interface’ em Java é abstrata.

public interface DataLoader {
    //Os metodos são abstratos e públicos.
    void load();

    //Os atributos são sempre public static final.
    int MAX_DATA_SIZE = 10;

    default void checkPermission(){ //Em ‘interfaces’ também pode ter metodos que não sejam abstratos, cujo comportamento seja explicito.
        System.out.println("Acesso liberado ");
    }

    static void teste(){ //Em ‘interfaces’ se pode criar metodos estáticos também. Eles nunca são sobrescritos
        System.out.println("Dentro da interface");
    }
}