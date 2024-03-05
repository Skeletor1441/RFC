/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        String nombre,appaterno,apmaterno,año,mes,dia,rfc;
        
        System.out.println("Ingresa tus datos para realizar tu tramite de RFC");
         System.out.println("Introduce tu nombre");
          nombre = leer.nextLine();
         System.out.println("Introduce tu apellido paterno");
         appaterno = leer.nextLine();
         System.out.println("Introduce tu apellido materno");
         apmaterno = leer.nextLine();
         System.out.println("Introduce tu año de nacimiento");
        año = leer.nextLine();
         System.out.println("Introduce tu mes de nacimiento");
         mes = leer.nextLine();
          System.out.println("Introduce tu dia de nacimiento");
         dia = leer.nextLine();
       rfc = appaterno.trim().substring(0,2);
       rfc = rfc.concat(apmaterno.trim().substring(0, 1));
         rfc = rfc.concat(nombre.trim().substring(0, 1));
       rfc = rfc.concat(año.trim().substring(2, 4));
       rfc = rfc.concat(mes);
        rfc = rfc.concat(dia);
       System.out.println("Tu RFC es: "+rfc.toLowerCase());
       
    }
    
}
