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
public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return this.idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + this.idTeclado + ", " + super.toString() + '}';
    }
}
