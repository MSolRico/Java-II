/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Estancias;

/**
 *
 * @author SFC
 */
public class EstanciasDAO extends DAO {

    public void agregarEstancia(Estancias e) throws Exception {
        try {
            if (e == null) {
                throw new Exception("Dato invalido");
            }

            String sql = "INSERT INTO estancias VALUES (" + e.getId_estancia() + "," + e.getId_cliente() + "," + e.getId_casa() + ",'"
                    + e.getNombre_huesped() + "','" + e.getFecha_desde() + "','" + e.getFecha_hasta() + "'.";
            super.instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
