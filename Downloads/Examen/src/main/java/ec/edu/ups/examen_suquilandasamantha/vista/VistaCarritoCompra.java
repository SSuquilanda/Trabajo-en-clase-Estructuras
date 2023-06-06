/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.vista;

import ec.edu.ups.examen_suquilandasamantha.modelo.CarritoCompra;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCarritoCompra {
    private Scanner teclado;
    
    public CarritoCompra ingresarCarritoCompra() throws ParseException {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar Fecha con formato dd/mm/yyyy:");
        String fecha1 = teclado.nextLine();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date fecha = format.parse(fecha1);
        System.out.println("Ingrese el subtotal del carrito: ");
        double subtotal = teclado.nextInt();
        System.out.println("Ingrese el codigo del carrito: ");
        int codigo = teclado.nextInt();
        return new CarritoCompra(fecha, subtotal, codigo);
    }

    public CarritoCompra actualizarCarritoCompra() throws ParseException {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar datos:");
        String fecha1 = teclado.nextLine();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date fecha = format.parse(fecha1);
        System.out.println("Ingrese el nuevo subtotal");
        int subtotal = teclado.nextInt();
        System.out.println("Ingrese el nuevo codigo ");
        int codigo = teclado.nextInt();
        return new CarritoCompra(fecha, subtotal, codigo);
    }

    public CarritoCompra eliminarCarritoCompra () {
        System.out.println("Ingrese el codigo del carrito a eliminar: ");
        int id = teclado.nextInt();
        return new CarritoCompra(id);
    }

    public int buscarCarritoCompra() {
        System.out.println("Ingrerse el codigo del carrito de compra a buscar: ");
        int id = teclado.nextInt();
        return id;
    }

    public void verCarritoCompra (CarritoCompra carritoCompra) {
        System.out.println("Los datos de cliente son: " + carritoCompra);
    }

    public void verCarritos(List<CarritoCompra> carritos) {
        for (CarritoCompra carritoCompra : carritos) {
            System.out.println("Datos del cliente: " + carritoCompra);
        }
    }
    
        
}
    
            
