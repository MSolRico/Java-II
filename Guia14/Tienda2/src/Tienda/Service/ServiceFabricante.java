
package Tienda.Service;

import Tienda.Entidad.Fabricante;
import Tienda.Persistencia.DaoFabricante;

public class ServiceFabricante {
    DaoFabricante df = new DaoFabricante();
    
    public void MostrarFabricantes() throws Exception{
        for (Fabricante lista : df.listarFabricantes()) {
            System.out.println(lista.toString());
        }
    }
    
    public void AgregarFabricante() throws Exception{
        df.AgregarFabricante();
    }
}
