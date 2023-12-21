/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        int n = 0;
        double numero;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.println("Ingrese un valor");
                numero = entrada.nextDouble();
                if (numero >= 1000 && numero <= 1199){
                    datos[f][c] = numero;
                    
                }else {
                    datos[f][c] = 10;
                    n = n + 1;
                }
            }
        }
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("%.2f\n", datos[f][c]);
            }
        }
        System.out.printf("Valores fuera de rango %d\n", n);
    }
}
