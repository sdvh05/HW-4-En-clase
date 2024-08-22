/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Hp
 */
public class Valladares_Steve_BIArray {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();

        System.out.println("HW#4: En Clase");
        System.out.println("Steve Valladares - 22341344");
        System.out.println("");
        System.out.println("Ingrese La Dimension de la Matriz cuadrada de Numeros (N*N)");
        int Dimension = lea.nextInt();
        System.out.println("");

        int Matriz[][] = new int[Dimension][Dimension];

        for (int Fila = 0; Fila < Dimension; Fila++) {
            for (int Columna = 0; Columna < Dimension; Columna++) {
                Matriz[Fila][Columna] = random.nextInt(90) + 10;
            }

        } 

        for (int Fila = 0; Fila < Matriz.length; Fila++) {
            for (int Columna = 0; Columna < Matriz[Fila].length; Columna++) {
                System.out.print(Matriz[Fila][Columna] + " ");
            }
            System.out.println("");
        }
        
        int SumaPrincipal=0;
        String SumaP=" ";
        for (int Diagonal = 0; Diagonal < Dimension; Diagonal++) {
            SumaPrincipal+=Matriz[Diagonal][Diagonal];
            SumaP+=Matriz[Diagonal][Diagonal]+" ";
        }
        
        int SumaSecundaria=0;
        String SumaS=" ";
        for (int Diagonal = 0; Diagonal < Dimension; Diagonal++) {
            SumaSecundaria+=Matriz[Diagonal][Dimension-Diagonal-1];
            SumaS+=Matriz[Diagonal][Dimension-Diagonal-1]+" ";
        }
        
        System.out.println("");
        System.out.println("**RESULTADOS**");
        System.out.println("La Suma de la Diagonal Principal es: "+SumaPrincipal);
        System.out.println(SumaP+" = "+SumaPrincipal);
                System.out.println("");
        System.out.println("La Suma de la Diagonal Secundaria es: "+SumaSecundaria);
        System.out.println(SumaS+" = "+SumaSecundaria);
    }
}
