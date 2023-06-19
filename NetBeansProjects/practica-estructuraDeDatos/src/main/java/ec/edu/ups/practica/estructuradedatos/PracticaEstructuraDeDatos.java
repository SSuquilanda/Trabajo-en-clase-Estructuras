/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica.estructuradedatos;

import java.util.Scanner;
import vista.VistaContacto;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class PracticaEstructuraDeDatos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    int opcion = 0;
    VistaContacto vistaContacto = new VistaContacto ();
    
    do {
            System.out.println("""                              
                                Menu de Opciones 
                               1. Ingreso del Contacto
                               2. Buscra contacto
                               3. Eliminar Contacto 
                               4. Salir""");
            opcion = teclado.nextInt();
            //Vista//

            switch (opcion) {
                case 1:
                    controladorContacto.registrar();
                    break;

                case 2:
                    controladorContacto.registrar();
                    break;

                case 3:
                    controladorContacto.registrarCliente();
                    break;
}
}
    }
}
