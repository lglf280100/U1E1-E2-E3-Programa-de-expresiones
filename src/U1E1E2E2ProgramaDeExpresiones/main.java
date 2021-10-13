/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U1E1E2E2ProgramaDeExpresiones;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opc;
        
        aritmeticas aritmeticas = new aritmeticas();
        aritmeticas2 aritmeticas2 = new aritmeticas2();
        tabladv tabladv2 = new tabladv();
        numcarcad numcarcad3 = new numcarcad();
        do{
        
        System.out.println("---BIENVENIDO---");
        System.out.println("1. Expresiones aritmeticas:");
        System.out.println("2. Expresion logica:");
        System.out.println("3. Expresion numcarcad:");
        System.out.println("4. Salir");
        
        System.out.println("Elige una opción:");
        opc = sc.nextInt();
        
        switch (opc){
            case 1:
                aritmeticas.aritmeticas();
                aritmeticas2.aritmeticas2();
                break;
            case 2:
                tabladv2.tabladv();
                break;
            case 3:
                numcarcad3.numcarcad();
                break;
            case 4:
                System.out.println("---Adiós C:---");
                salir = true;
                break;
                default:
                System.out.println("--Ingrese un dato correcto--");
        }
        } while(!salir);
        }
}