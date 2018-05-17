/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfos;

/**
 *
 * @author HP PC
 */
public class Mago implements Elfo {

    @Override
    public void atacar() {
        System.out.println("El Mago ataca con Bola de fuego");
    }

    @Override
    public void morir() {
        System.out.println("Mago muerto");
    }
    
}
