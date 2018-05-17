/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orcos;

/**
 *
 * @author HP PC
 */
public class Hechicero implements Orco {

    @Override
    public void atacar() {
        System.out.println("El hechicero ataca con Conjuro maligno");
    }

    @Override
    public void morir() {
        System.out.println("Hechicero muerto");
    }
    
}
