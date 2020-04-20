/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//Campos Avila Angel Uriel
/**
 *
 * @author bokuzera
 */
public class consumidor extends Thread {
    private Contenedor contenedor;
    private final int lim;
public consumidor (Contenedor c, int N) {
        this.lim = N;
        contenedor= c;
}
    @Override
     public void run() {
         int value = 0;
           for (int i = 0; i < lim; i++) {
            value = contenedor.get();
             System.out.println("Consumidor. get: " + value);
}
}
    }
    

