/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia12;

/**
 *
 * @author SFC
 */
public class Animal {

    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico...");
    }
}

class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}

class Gato extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}


