/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfos;

import guerra.AbstractFactory;
import Orcos.Orco;

/**
 *
 * @author HP PC
 */
public class ReinoElfos implements AbstractFactory{

    @Override
    public Elfo getElfos(String type) {
        switch (type) {
            case "Arquero":
                return new Arquero();
            case "Mago":
                return new Mago();
            case "ReyElfo":
                return new ReyElfo();
        }
        return null;
    }

    @Override
    public Orco getOrcos(String type) {
        return null;
    }
    
}
