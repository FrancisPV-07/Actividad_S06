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
public class Programa_04 {

    public static void main(String[] args) {
        //Declaracion de variables
        int num1, num2, cont;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar primer numero: ");
        num1 = lectura.nextInt();
        System.out.print("Ingresar segundo numero: ");
        num2 = lectura.nextInt();
        //Proceso
        cont = num1;
        if (num1 > num2) {
            //Salida
            System.out.println("El numero 2 debe ser mayor que el 1");
        } else {
            while (cont < num2) {
                if (cont % 2 == 0) {
                    //Salida
                    System.out.println(cont);
                }
                cont++;
            }
        }
    }
}
