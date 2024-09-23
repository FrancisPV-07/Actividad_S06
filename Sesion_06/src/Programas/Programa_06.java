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
public class Programa_06 {

    public static void main(String[] args) {
        //Declaracion de variables
        int num1, num2, d;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar primer numero: ");
        num1 = lectura.nextInt();
        System.out.print("Ingresar segundo numero: ");
        num2 = lectura.nextInt();
        //Proceso
        while (num2 != 0) {
            d = num1 % num2;
            num1 = num2;
            num2 = d;
        }
        //Salida
        System.out.println("El MCD de los numeros ingresados es: " + num1);
    }
}
