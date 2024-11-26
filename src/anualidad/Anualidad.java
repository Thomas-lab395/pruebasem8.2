/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anualidad;

/**
 *
 * @author Mayra Bardales
 */

class Anualidad {
    private final double renta; // R
    private final double tasaInteres; // i
    private final int numeroPagos; // n

    
    public Anualidad(double renta, double tasaInteres, int numeroPagos) {
        this.renta = renta;
        this.tasaInteres = tasaInteres;
        this.numeroPagos = numeroPagos;
    }

    
    public double calcularOrdinaria() {
        double factor = 1 - Math.pow(1 + tasaInteres, -numeroPagos);
        return renta * (factor / tasaInteres);
    }

    
    public double calcularAnticipada() {
        double ordinaria = calcularOrdinaria();
        return ordinaria * (1 + tasaInteres);
    }
}

