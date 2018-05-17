/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;

import Elfos.Elfo;
import Orcos.Orco;


/**
 *
 * @author HP PC
 */
public class Guerra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFactory factory;
        
        factory = Produccion.getFactory("Orcos");
        Orco hechicero = factory.getOrcos("Hechicero");
        hechicero.atacar();
        
        
        factory = Produccion.getFactory("Elfos");
        Elfo arquero = factory.getElfos("Arquero");
        arquero.atacar();
        //elfos.morir();
        hechicero.morir();
        
        factory = Produccion.getFactory("Elfos");
        Elfo mago = factory.getElfos("Mago");
        mago.atacar();
        //elfos.morir();

        factory =  Produccion.getFactory("Orcos");
        Orco Bestia = factory.getOrcos("BestiaMayor");
        Bestia.atacar();
        
       mago.morir();
       arquero.morir();
        
        
        

        

        
    }
    
}
