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
public class ModeloCadenaSinEspacios extends Dato<String[]> {

    public ModeloCadenaSinEspacios(String[] objetoDato) {
        super(objetoDato);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String[] arregloCadenasSinEspacios = objetoDato;

        for (int i = 0; i < arregloCadenasSinEspacios.length; i++) {
            sb.append(arregloCadenasSinEspacios[i]);

            if (i < arregloCadenasSinEspacios.length - 1) {
                sb.append(" ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
    
    

    @Override
    public Dato<String[]> ordenarBurbuja(boolean ascendentemente, boolean info) {
        String[] arregloCadenasSinEspacios = Arrays.copyOf(objetoDato, objetoDato.length);
        
        int n = arregloCadenasSinEspacios.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascendentemente) {
                    if (arregloCadenasSinEspacios[j].compareTo(arregloCadenasSinEspacios[j + 1]) > 0) {
                        // Intercambiar las cadenas
                        String temp = arregloCadenasSinEspacios[j];
                        arregloCadenasSinEspacios[j] = arregloCadenasSinEspacios[j + 1];
                        arregloCadenasSinEspacios[j + 1] = temp;
                    }
                } else {
                    if (arregloCadenasSinEspacios[j].compareTo(arregloCadenasSinEspacios[j + 1]) < 0) {
                        // Intercambiar las cadenas
                        String temp = arregloCadenasSinEspacios[j];
                        arregloCadenasSinEspacios[j] = arregloCadenasSinEspacios[j + 1];
                        arregloCadenasSinEspacios[j + 1] = temp;
                    }
                }
            }

        }
        return new ModeloCadenas(arregloCadenasSinEspacios);
        
    }

    @Override
    public Dato<String[]> ordenarSeleccion(boolean ascendentemente) {
        
        String[]arregloCadenasSinEspacios = Arrays.copyOf(objetoDato, objetoDato.length);

        
        int n = arregloCadenasSinEspacios.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (ascendentemente) {
                    if (arregloCadenasSinEspacios[j].compareTo(arregloCadenasSinEspacios[indiceMinimo])<0 ) {
                        indiceMinimo = j;
                    }
                } else {
                    if (arregloCadenasSinEspacios[j].compareTo( arregloCadenasSinEspacios[indiceMinimo])<0) {
                        indiceMinimo = j;
                    }
                }
            }
            // Intercambiar el elemento mínimo con el elemento en la posición i
            String temp = arregloCadenasSinEspacios[indiceMinimo];
            arregloCadenasSinEspacios[indiceMinimo] = arregloCadenasSinEspacios[i];
            arregloCadenasSinEspacios[i] =  temp;
        }
        return new ModeloCadenas(arregloCadenasSinEspacios);

    }
    
    @Override
    public Dato<String[]> ordenarInsercion(boolean ascendentemente) {
        String[] arregloCadenasSinEspacios = Arrays.copyOf(objetoDato, objetoDato.length);

        int n = arregloCadenasSinEspacios.length;
        for (int i = 1; i < n; i++) {
            String valorActual = arregloCadenasSinEspacios[i];
            int j = i - 1;
            if (ascendentemente) {
                while (j >= 0 && arregloCadenasSinEspacios[j].compareTo(valorActual)>0 ) {
                    arregloCadenasSinEspacios[j + 1] = arregloCadenasSinEspacios[j];
                    j--;
                }
            } else {
                while (j >= 0 && arregloCadenasSinEspacios[j].compareTo(valorActual)>0) {
                    arregloCadenasSinEspacios[j + 1] = arregloCadenasSinEspacios[j];
                    j--;
                }
            }
            arregloCadenasSinEspacios[j + 1] = valorActual;
        }
        return new ModeloCadenas(arregloCadenasSinEspacios);
    }
}