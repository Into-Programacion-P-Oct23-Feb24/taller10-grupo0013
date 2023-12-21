/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int f = 0; f < notasCualitativas.length; f++) {
            for (int c = 0; c < notasCuantitativas[f].length; c++) {
                if (notasCuantitativas[f][c] >= 9.6) {
                    notasCualitativas[f][c] = "Sobresaliente";
                } else {
                    if (notasCuantitativas[f][c] >= 8) {
                        notasCualitativas[f][c] = "Muy Buena";
                    } else {
                        if (notasCuantitativas[f][c] >= 5) {
                            notasCualitativas[f][c] = "Buena";
                        } else {
                            if (notasCuantitativas[f][c] >= 3) {
                                notasCualitativas[f][c] = "Regular";
                            } else {
                                notasCualitativas[f][c] = "Insuficiente";
                            }
                        }
                    }

                }

            }
        }
        for (int f = 0; f < notasCualitativas.length; f++) {
            for (int c = 0; c < notasCuantitativas[f].length; c++) {
                System.out.printf("La nota %.2f es %s\n"
                        , notasCuantitativas[f][c],notasCualitativas[f][c]);
            }
        }
    }
}
