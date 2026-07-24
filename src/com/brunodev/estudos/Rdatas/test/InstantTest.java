package com.brunodev.estudos.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    static void main(String[] args) {
        //Bem parecida com a date, a diferença é que a Instant trabalha com nanossegundos de 1970 até agora com zulo time.
        Instant now = Instant.now();
        System.out.println(now); //Z de zulo time.
        System.out.println(LocalDateTime.now());
    }
}
