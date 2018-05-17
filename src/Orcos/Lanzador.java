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
public class Lanzador implements Orco {

    @Override
    public void atacar() {
        System.out.println("El Lanzador ataca con Lanza envenenada");
    }

    @Override
    public void morir() {
        System.out.println("Lanzador muerto");
    }
    
}
