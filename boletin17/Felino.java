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
public class Felino extends Mamifero implements IPuedeNadar{
    
    
    @Override
    public void nadar() {
        System.out.println("Puede nadar");
    }

}


