
package com.ceep.test;
import com.ceep.domain.Vehiculo;
//import com.ceep.domain.*; //* me importaría todo, es el comidin
//Todas las clases son extens de la clase Object

public class PruebaGestion {
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1111CCC","Seat", "Ibiza", "gris",1000, true);
        Vehiculo v2 = new Vehiculo("2222LLL","Kia", "Ceep", "negro",5000, false);
        Vehiculo v3 = new Vehiculo();
        //ctr+espacio -> saca los datos del constructor
        
        v3.setDisponible(false);
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println("v3 = " + v3);
    }
    
}
