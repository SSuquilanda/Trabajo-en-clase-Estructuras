/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.vista;

import java.util.Scanner;
import ec.edu.ups.examen_suquilandasamantha.modelo.Cliente;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCliente {
    private Scanner teclado;
    
    public Cliente ingresarCliente() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la cedula del Cliente: ");
        String cedula = teclado.nextLine();
        System.out.println("Ingrese el nombre del Cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del Cliente: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la direccion del Cliente: ");
        String dirección = teclado.nextLine();
        System.out.println("Ingrese el telefono del Cliente: ");
        String telefono = teclado.nextLine();
        System.out.println("Ingrese el id del cliente (codigo) : ");
        int id = teclado.nextInt();
        return new Cliente(cedula, nombre, apellido, dirección, telefono, id);
    }

    public Cliente actualizarCliente() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la nueva cedula del cliente a actualizar");
        String cedula = teclado.nextLine();
        System.out.println("Ingrese el nuevo nombre del cliente a actualizar");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el nuevo Apellido del cliente a actualizar");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la nueva direccion del cliente a actualizar");
        String dirección = teclado.nextLine();
        System.out.println("Ingrese el nuevo telefono del cliente a actualizar");
        String telefono = teclado.nextLine();
        System.out.println("Ingrese el nuevo id del cliente (codigo) : ");
        int id = teclado.nextInt();
        return new Cliente(cedula, nombre, apellido, dirección, telefono, id);
    }

    public Cliente eliminarCliente() {
        System.out.println("Ingrese el id del cliente a eliminar: ");
        int codigo = teclado.nextInt();
        return new Cliente(codigo);
    }

    public int buscarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a buscar");
        int id = teclado.nextInt();
        return id;
    }

    public void verCliente(Cliente cliente) {
        System.out.println("Los datos del cliente con cedula 0101010");
        System.out.println("Los datos de cliente son: " + cliente);
    }

    public void verClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Datos del cliente: " + cliente);
        }
    }
}
