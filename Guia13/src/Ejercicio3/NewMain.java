/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author SFC
 */
import java.util.Scanner;

/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y
 * guardarlas en dos variables de tipo int. Por ultimo realizar una división con
 * los dos numeros y mostrar el resultado.
 *
 */
public class NewMain {

    public static void main(String[] args) {
        divisionNumero();
    }

    public static void divisionNumero() {
        String num1, num2;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer número");
        num1 = leer.next();
        System.out.println("Ahora el segundo");
        num2 = leer.next();

        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);

        try {
            int divisionResultado = int1 / int2;
            System.out.println(divisionResultado);
        } catch (ArithmeticException e) {

            System.out.println("División por cero");

        }

    }

}
