
package com.mycompany.boletin17;

/**
 *
 * @author jaimg
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gato obxG = new Gato();
        Papagayo obxP = new Papagayo();
        Tigre obxT = new Tigre();
        Avestruza obxA = new Avestruza();
        Murcielago obxM = new Murcielago();
        System.out.println("Gato: ");
        obxG.caminar();
        obxG.nadar();
        System.out.println("Papagaio: ");
        obxP.caminar();
        obxP.volar();
        System.out.println("Tigre: ");
        obxT.caminar();
        obxT.nadar();
        System.out.println("Avestruza: ");
        obxA.caminar();
        obxA.volar();
        System.out.println("Morcego: ");
        obxM.caminar();
        obxM.volar();
        
    }
    
}





