/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Service;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Service {
    public void showMenu(){
            System.out.println("===============");
            System.out.println("     MENU      ");
            System.out.println("===============");
            System.out.println("");
            System.out.println("1-Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2-Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3-Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4-Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5-Listar el nombre y el precio del producto más barato.");
            System.out.println("6-Ingresar un producto a la base de datos.");
            System.out.println("7-Ingresar un fabricante a la base de datos.");
            System.out.println("8-Editar un producto con datos a elección.");
    }
    
    public void menu(){
        Scanner leer = new Scanner(System.in);
        int choice;   
        choice = leer.nextInt();
        while (choice < 1 && choice > 8){
            System.out.println("El valor ingresado no corresponde a ninguna opcion, intente nuevamente");
            choice = leer.nextInt();
        }
        do {
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);
    }
}