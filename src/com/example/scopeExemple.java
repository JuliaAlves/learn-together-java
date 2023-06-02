package com.example;

//scope é referente a visibilidade / acesso a variáveis, métodos e classes em diferentes partes do código. 

public class scopeExemple {

    int value; // Class Scope

    public void blockScope() {
        int x = 10; 
    
        if (x > 5) {
            int y = 20; // Block Scope dentro do if
    
            System.out.println(x); // OK
            System.out.println(y); // OK
        }
    
        System.out.println(x); // OK
        System.out.println(y); // ERRO: y não está visível aqui
    }
    public void methodScope() {
        int x = 10; // Method Scope
    
        System.out.println(x); // OK
    
        // Outros códigos...
    
        System.out.println(x); // OK
    }
    
    public void outroMetodo() {
       // System.out.println(x); // ERRO: x não está visível aqui
    }
    public void parameterScope(int x) { // Parameter Scope
        System.out.println(x); // OK
    }
    public static void main(String[] args) {
        scopeExemple exemplo = new scopeExemple();
        exemplo.blockScope();
    }

}    