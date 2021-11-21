/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.mundopc;

/**
 *
 * @author Hector
 */
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {    
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }    

    public int getIdRaton() {
        return this.idRaton;
    }   

    public static int getContadorRatones() {
        return contadorRatones;
    } 
    
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + this.idRaton + ", " + super.toString() + '}';
    }
}

