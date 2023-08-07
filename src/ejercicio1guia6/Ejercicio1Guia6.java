/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia6;

/**
 *
 * @author Admin
 */
public class Ejercicio1Guia6 {

//    /Demuestre como provocar intencionalmente una excepción del tipo
//NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
//error./
    public static void main(String[] args) {
        // TODO code application logic here
        String letra=null;
        try {
            int num=letra.length();
            System.out.println("El tamaño de la cadena es: "+num);
        } catch (NullPointerException e) {
            System.out.println("No hay número xD");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Hasta mañana");
        }
        
    }
    
}
