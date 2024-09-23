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
public class Programa_02 {

    public static void main(String[] args) {
        //Declaracion de variables
        int cantidad, cant_invertida, digito;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //Proceso
        cant_invertida = 0;
        digito = 0;
        while (cantidad > 0) {
            digito = cantidad % 10;
            cant_invertida = cant_invertida * 10 + digito;
            cantidad = cantidad / 10;
        }
        //Salida
        System.out.println("La cantidad invertidad es igual a: " + cant_invertida);
    }
}
