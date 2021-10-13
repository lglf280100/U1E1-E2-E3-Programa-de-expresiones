package U1E1E2E2ProgramaDeExpresiones;

import java.util.Scanner;

public class numcarcad {
    public void numcarcad(){
     Scanner sc = new Scanner(System.in);
     int contadorN = 0;
     String cadena = "(9 + 1 9 )*.2 / 6.6 ^ 4 -7 .46";
     String c = "",n = "",s ="";
     //Cadena leer datos
     
     String[] arrayDato = cadena.split(" ");
     int caracter = 0, numero =0, str=0;
     //Ciclo for donde va a retornar el tipo de dato que se requiera
     for (int i=0; i < arrayDato.length; i++) {
            if(arrayDato[i].matches("[a-zA-z~@#^*()/+-]")) {
                caracter++;
                c=c+arrayDato[i]+" ";
    }else if(arrayDato[i].matches("[0-9]")) {
                numero++;
                n=n+arrayDato[i]+" ";
    }else{
        str++;
        s=s+arrayDato[i]+" ";
    }
     }
     //Nos va a imprimir el dato en la consola
        System.out.println("No. Caracteres: "+ caracter + " Caracteres:" +c);
        System.out.println("No. Numeros: "+ numero + " Numeros:" +n);
        System.out.println("No. Cadenas: "+ str + " Caracteres:" +s);
    }   
}