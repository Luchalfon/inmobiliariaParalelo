/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalinmobiliaria;

import Entidades.Propietario;
import accesoADatos.PropietarioData;

import java.util.List;

public class FinalInmobiliaria {
    public static void main(String[] args) {
        System.out.println("Hola");
        PropietarioData propietarioDao = new PropietarioData();
        Propietario propietario1 = new Propietario("Perez", 123688888, "Puerto ric0 14", "Diego", "23444446", true);
        Propietario propietario2 = new Propietario("Jacinto", 12367469, "Jamaica 2453", "Lucas", "234578789", true);
        Propietario propietario3 = new Propietario("Gomez", 123611119, "Alberdi 213", "Eduardo", "1154678956", true);
        
        /*
        //alta propietario
        propietarioDao.guardarPropietario(propietario1);
        propietarioDao.guardarPropietario(propietario2);
        propietarioDao.guardarPropietario(propietario3);
        
        //Listar propietarios de la base
        List<Propietario> lista = propietarioDao.listarPropietarios();
        System.out.println("Lista despues de guardar entidades");
        for(Propietario p : lista){
            System.out.println("nombre= "+p.getNombre()+" apellido= "+p.getApellido());
        }
        //baja propietario
        
        propietarioDao.eliminarPropietario(propietario2.getId_propietario());
        propietarioDao.eliminarPropietario(propietario1.getId_propietario());
        
        
        lista = propietarioDao.listarPropietarios();
        System.out.println("Lista con la eliminacion previa realizada");
        for(Propietario p : lista){
            System.out.println("nombre= "+p.getNombre()+" apellido= "+p.getApellido());
        }
        */
        //modificar
        
        Propietario aModificarPropietario = propietarioDao.buscarPropietarioPorID(1);
        System.out.println("Propietario sin modificar");
        System.out.println(aModificarPropietario.getNombre()+" Apellido= "+aModificarPropietario.getApellido());
        aModificarPropietario.setApellido("Rivadavia");
        aModificarPropietario.setNombre("Bernardino");
        propietarioDao.modificarPropietario(aModificarPropietario);
        
        System.out.println("Modificacion de entidad en base de datos");
        
        aModificarPropietario = propietarioDao.buscarPropietarioPorID(1);
        System.out.println("nombre "+aModificarPropietario.getNombre()+" apellido = "+aModificarPropietario);
        
    }

}
