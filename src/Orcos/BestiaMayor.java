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
public class BestiaMayor implements Orco{

    @Override
    public void atacar() {
        System.out.println("La Bestia Mayor ataca con ¡Muerte instantanea!");
    }

    @Override
    public void morir() {
        System.out.println("Bestia mayor muerto");
    }
    
}
