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
public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + this.idMonitor + ", marca=" + this.marca + ", tama\u00f1o=" + this.tamaño + '}';
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }  
    
    public static int getContadorMonitores() {
        return contadorMonitores;
    } 
}
