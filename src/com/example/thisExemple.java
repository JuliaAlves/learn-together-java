package com.example;

//Class, this, object, scope, static

public class thisExemple {
    private int valor;
    private int numero;
    private String nome;

    public void setNumero(int numero) {
        this.valor = numero; // Utilizando "this" para referenciar o atributo "numero" da instância atual
    }
    public int getNumero(){
        return this.numero;
    }

    public void metodoA() {
        this.metodoB(); 
        // Chama o método "metodoB()" da instância atual
        //Internamente, o this é usado implicitamente para se referir à instância atual e chamar o método metodoB().
    }

    public void metodoB() {
        this.numero = 10; // Utilizando "this" para referenciar o atributo "numero" da instância atual
    }

    public void metodoC() {
        metodoD(this); // Passa a instância atual como argumento para o método "metodoD"
    }

    public void metodoD(thisExemple exemplo) {
        exemplo.numero = 90;
        exemplo.nome = "Novo Nome"; // Acessa o atributo "nome" da instância atual recebida como argumento
    }

}
