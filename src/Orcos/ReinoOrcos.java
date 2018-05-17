/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orcos;

import guerra.AbstractFactory;
import Elfos.Elfo;

/**
 *
 * @author HP PC
 */
public class ReinoOrcos implements AbstractFactory{

    @Override
    public Elfo getElfos(String type) {
        return null;
    }

    @Override
    public Orco getOrcos(String type) {
        switch (type) {
            case "Hechicero":
                return new Hechicero();
            case "Lanzador":
                return new Lanzador();
            case "BestiaMayor":
                return new BestiaMayor();
        }
        return null;
    }
    
}
