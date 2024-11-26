/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anualidad;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Ingrese el valor de la renta o pago por periodo : ");
        double renta = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interes por periodo ( en formato decimal): ");
        double tasaInteres = scanner.nextDouble();

        System.out.println("Ingrese el numero de pagos : ");
        int numeroPagos = scanner.nextInt();

        System.out.println("Es una anualidad ordinaria o anticipada? (1 = Ordinaria, 2 = Anticipada): ");
        int tipoAnualidad = scanner.nextInt();

        
        Anualidad anualidad = new Anualidad(renta, tasaInteres, numeroPagos);

        
        switch (tipoAnualidad) {
            case 1:
                {
                    double resultado = anualidad.calcularOrdinaria();
                    System.out.printf("El valor presente de la anualidad ordinaria es: %.2f\n", resultado);
                    break;
                }
            case 2:
                {
                    double resultado = anualidad.calcularAnticipada();
                    System.out.printf("El valor presente de la anualidad anticipada es: %.2f\n", resultado);
                    break;
                }
            default:
                System.out.println("Opcion invalida. Por favor, seleccione 1 o 2.");
                break;
        }

      
    }
}

