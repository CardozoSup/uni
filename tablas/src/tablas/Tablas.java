/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablas;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cj = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema");
        System.out.println("ingrese el numero el cual desee ver su tabla de multiplicacion");
        int num = cj.nextInt();
        for (int i=1 ; i<11;i++){
            System.out.println("El resultado es de: " + num + "*" +i+ " es: " + i*num );
        }
    }
    
}
