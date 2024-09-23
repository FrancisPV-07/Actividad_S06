/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;

/**
 * Crear un programa en Java que permita ingresar una cantidad. Visualizar el
 * numero de digitos de la cantidad ingresada. Por ejemplo: Cantidad: 1234
 * Num_dig: 4
 *
 * @author Francis
 */
public class Programa_01 {

    public static void main(String[] args) {
        //Declaracion de variables
        int cantidad, num_dig;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //Proceso
        num_dig = 0;
        while (cantidad > 0) {            
            num_dig++;
            cantidad = cantidad / 10;
            //System.out.println(cantidad);
        }
        //Salida
        System.out.println("La cantidad de digitos es igual a: " + num_dig);
    }
}
