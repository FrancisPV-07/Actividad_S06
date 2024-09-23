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
public class Programa_05 {

    public static void main(String[] args) {
        //Declaracion de variables
        String key, contraseña;
        key = "Curso2024";
        contraseña = "";
        Scanner lectura = new Scanner(System.in);
        //Proceso
        while (!contraseña.equals(key)) {
            //Entrada de datos
            System.out.print("Ingresar contraseña: ");
            contraseña = lectura.next();
        }
        //Salida
        System.out.println("Contraseña correcta");
    }
}
