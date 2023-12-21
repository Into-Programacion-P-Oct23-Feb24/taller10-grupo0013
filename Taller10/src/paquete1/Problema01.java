/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notas = {{9,10,7,8}, {10,5,7,9}, {7, 9.4, 10, 9}};
        String [] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double suma = 0;
        double[] promedio = new double [4];
        
        for(int f=0; f<notas.length;f++){
            for(int c=0; c<notas[f].length; c++){
                suma = suma + notas[f][c];      
            }
            promedio[f] = suma / notas[f].length;
            suma = 0;
        }
        for (int f = 0; f < notas.length; f++) {
                System.out.printf("Estudiante: %s tiene un promedio de "
                        + "%s\n", estudiantes[f], promedio[f]);
            
        }
    }
    
}
