package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.example.classAnimal;

public class Learning {
    public static void main(String[] args) throws IOException {
        classAnimal gato = new classAnimal("Miau", "gato");
        System.out.println("O " + gato.especie + " faz " + gato.som + "!");
        System.out.println("Digite um numero:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int number = Integer.parseInt(line);
        // String resultado = Integer.toString(incremento(number)); 
        // System.out.println("Seu resultado é: "+resultado);
        System.out.println(String.format("Seu resultado é: %x", incremento(number)));
    }

    private static int incremento(int number){
        return number + 1;
    }
}
