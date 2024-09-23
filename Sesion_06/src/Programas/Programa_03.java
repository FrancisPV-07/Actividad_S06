/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Programa_03 {

    public static void main(String[] args) {
        //Declaracion de variables
        int cantidad, dmay, cdimp, sdpares, r, dig;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //Proceso
        dmay = 0;
        cdimp = 0;
        sdpares = 0;
        while (cantidad > 0) {
            dig = cantidad % 10;
            if (dig > dmay) {
                dmay = dig;
            }
            r = dig % 2;
            if (r == 0) {
                sdpares += dig;
            } else {
                cdimp++;
            }
            cantidad = cantidad / 10;
        }
        //Salida
        System.out.println("El digito mayor es: " + dmay);
        System.out.println("La cantidad de digitos impares es: " + cdimp);
        System.out.println("La suma de digitos pares es: " + sdpares);
    }
}
