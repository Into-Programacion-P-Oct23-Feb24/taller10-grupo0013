/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int f;
        int c;
        double suma = 0;
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double [][] ventas = new double [2][5];
        for (f = 0; f < ventas.length; f++){
            for (c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese el valor de ventas %s\n",vendedores[f]);
                ventas[f][c] = entrada.nextDouble();
                suma += ventas[f][c];
            }
        }
        for (f = 0;  f<ventas.length; f++) {
            System.out.printf("Vendedor(a) %s\n",vendedores[f]);
        }
        System.out.printf("Ha realizado un total de %.2f en ventas.\n",suma);
    }
}
