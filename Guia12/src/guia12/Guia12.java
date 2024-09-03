/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12;

/**
 *
 * @author SFC
 */
public class Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
