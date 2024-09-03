/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Familias;

/**
 *
 * @author SFC
 */
public class FamiliasDAO extends DAO {

    public void agregarEstancia(Familias f) throws Exception {
        try {
            if (f == null) {
                throw new Exception("Dato invalido");
            }

            String sql = "INSERT INTO estancias VALUES (" + f.getId_familia() + ",'" + f.getNombre() + "'," + f.getEdad_min() + ","
                    + f.getEdad_max() + "," + f.getNum_hijos() + ",'" + f.getEmail() + "'." + f.getId_casa_familia() + ")";
            super.instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
