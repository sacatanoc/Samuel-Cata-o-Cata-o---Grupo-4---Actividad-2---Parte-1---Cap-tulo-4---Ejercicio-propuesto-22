/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_11;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_propuesto_numero_22 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        String nom;
        int horas_mes;
        double valor_hora, salario;
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del empleado:");
        nom = lector.nextLine();
        System.out.println("Por favor ingrese la cantidad de horas que el empleado trabajó en el mes:");
        horas_mes = lector.nextInt();
        System.out.println("Por favor ingrese el salario básico por hora del empleado:");
        valor_hora = lector.nextDouble();
        salario = horas_mes*valor_hora;
        System.out.println("Nombre: "+nom);
        if (salario>450000) {
            System.out.println("Salario mensual: $"+salario);
        }
    }
}
