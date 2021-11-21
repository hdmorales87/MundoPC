/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.java.mundopc.*;

/**
 *
 * @author Hector
 */
public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("ps2", "HP");
        Raton mouseHP = new Raton("ps2", "HP");
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("ps2", "Gamer");
        Raton mouseGamer = new Raton("ps2", "Gamer");
        
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, mouseGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
