/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Tienda.Service.Service;

/**
 *
 * @author Adriana N
 */
public class mainTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Service sc = new Service();
        sc.menu();
    }
    
}
