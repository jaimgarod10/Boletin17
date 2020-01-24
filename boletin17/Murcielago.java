/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boletin17;

/**
 *
 * @author jaimg
 */
public class Murcielago extends Mamifero implements IPuedeVolar{
    
    @Override
    public void volar() {
        System.out.println("Puede volar");
    }
    
}



