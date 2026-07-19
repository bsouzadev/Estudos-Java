package com.brunodev.estudos.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasExcecoes04 {
    static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) { //As exceções mais genéricas sempre tem que estar no final.
            System.out.println("Dentro de RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (Exception e) {
            System.out.println("Dentro de Exception");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}