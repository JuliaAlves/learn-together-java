package com.example;

//Class, this, object, scope, static

public class classAnimal {
     public String som;
     public String especie;

     public classAnimal(String som, String especie) {
         this.som = som;
         this.especie = especie;
     }
     public classAnimal(String especie) {
        this.especie = especie;
    }

     public void fazerBarulho() {
         System.out.println("O " + especie + " faz " + som + "!");
     }

     public static void main(String[] args) {
         classAnimal gato = new classAnimal("Miau", "Gato");
         gato.fazerBarulho();

         classAnimal cachorro = new classAnimal("Auau", "Cachorro");
         cachorro.fazerBarulho();

//object
        System.out.println(gato.equals(cachorro)); // Comparando as referências dos objetos (se eles apontam para a mesma área de memória)
        System.out.println(gato.hashCode()); // Código hash (valor numérico que representa a identidade do objeto)
        System.out.println(gato.toString()); // Representação em string do objeto
        System.out.println(gato.getClass()); // Classe do objeto em tempo de execução
     }
}


