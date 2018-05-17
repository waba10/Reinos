/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;


import Elfos.ReinoElfos;
import Orcos.ReinoOrcos;

/**
 *
 * @author HP PC
 */
public class Produccion {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Elfos":
                return  new ReinoElfos();
            case "Orcos":
                return new ReinoOrcos();
        }
        return null;
    }
    
}
