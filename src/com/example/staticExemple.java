package com.example;

//static é utilizada para criar membros(atributos e métodos) que pertencem a classe em vez de pertencerem a instâncias individuais da classe.

public class staticExemple {
    public static int staticCount = 0; //static variables
    public static int numero;

    static { //static block
        numero = 10;
        System.out.println("static block executado.");
    }
    public staticExemple() {
        staticCount++;
    }
    public static void staticOla() {
        System.out.println("Olá!"); //static methods
    }
    public static void main(String[] args) {
        // Acessando a static variables
        System.out.println(staticExemple.staticCount);
        // Acessando a static methods
        staticExemple.staticOla();
        // Acessando a static block
        System.out.println(staticExemple.numero);
    }

}
