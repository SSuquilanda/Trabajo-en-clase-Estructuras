/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau1.models;

import java.util.Arrays;

/**
 *
 * @author pablo
 */

public class ModeloCadenas extends Dato<String[]> {

    public ModeloCadenas(String[] objetoDato) {
        super(objetoDato);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String[] arregloCadenas = objetoDato;

        for (int i = 0; i < arregloCadenas.length; i++) {
            sb.append(arregloCadenas[i]);

            if (i < arregloCadenas.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public Dato<String[]> ordenarBurbuja(boolean ascendentemente, boolean info) {

        String[] arregloCadenas = Arrays.copyOf(objetoDato, objetoDato.length);
        
        int n = arregloCadenas.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascendentemente) {
                    if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) {
                        // Intercambiar las cadenas
                        String temp = arregloCadenas[j];
                        arregloCadenas[j] = arregloCadenas[j + 1];
                        arregloCadenas[j + 1] = temp;
                    }
                } else {
                    if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) < 0) {
                        // Intercambiar las cadenas
                        String temp = arregloCadenas[j];
                        arregloCadenas[j] = arregloCadenas[j + 1];
                        arregloCadenas[j + 1] = temp;
                    }
                }
            }

        }

        return new ModeloCadenas(arregloCadenas);


    }

    @Override
    public Dato<String[]> ordenarSeleccion(boolean ascendentemente) {
        String[]arregloCadenas = Arrays.copyOf(objetoDato, objetoDato.length);

        
        int n = arregloCadenas.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (ascendentemente) {
                    if (arregloCadenas[j].compareTo(arregloCadenas[indiceMinimo])<0 ) {
                        indiceMinimo = j;
                    }
                } else {
                    if (arregloCadenas[j].compareTo( arregloCadenas[indiceMinimo])<0) {
                        indiceMinimo = j;
                    }
                }
            }
            // Intercambiar el elemento mínimo con el elemento en la posición i
            String temp = arregloCadenas[indiceMinimo];
            arregloCadenas[indiceMinimo] = arregloCadenas[i];
            arregloCadenas[i] =  temp;
        }
        return new ModeloCadenas(arregloCadenas);

    }

    @Override
    public Dato<String[]> ordenarInsercion(boolean ascendentemente) {
        String[] arregloCadenas = Arrays.copyOf(objetoDato, objetoDato.length);

        int n = arregloCadenas.length;
        for (int i = 1; i < n; i++) {
            String valorActual = arregloCadenas[i];
            int j = i - 1;
            if (ascendentemente) {
                while (j >= 0 && arregloCadenas[j].compareTo(valorActual)>0 ) {
                    arregloCadenas[j + 1] = arregloCadenas[j];
                    j--;
                }
            } else {
                while (j >= 0 && arregloCadenas[j].compareTo(valorActual)>0) {
                    arregloCadenas[j + 1] = arregloCadenas[j];
                    j--;
                }
            }
            arregloCadenas[j + 1] = valorActual;
        }
        return new ModeloCadenas(arregloCadenas);
    }
    }

