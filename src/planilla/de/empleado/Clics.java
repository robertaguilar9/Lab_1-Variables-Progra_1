/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planilla.de.empleado;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Clics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner (System.in);
        double Subtotal = 0, TotalC = 0, CPC = 0, ISV = 0, Total_con_ISV = 0;
        
        System.out.println("Ingrese el Total de Clics: ");
        int Cantidad_Clic = lea.nextInt();
        
        System.out.println("Ingrese Clic 1:");
        int Clic1 = lea.nextInt();
        System.out.println("Ingrese precio de Clic 1:");
        double Precio_C1 = lea.nextDouble();
        
        System.out.println("Ingrese Clic 2:");
        int Clic2 = lea.nextInt();
        System.out.println("Ingrese precio de Clic 2:");
        double Precio_C2 = lea.nextDouble();
        
        System.out.println("Ingrese Clic 3:");
        int Clic3 = lea.nextInt();
        System.out.println("Ingrese precio de Clic 3:");
        double Precio_C3 = lea.nextDouble();
        
        Subtotal = (Precio_C1*Clic1) + (Precio_C2*Clic2) + (Precio_C3*Clic3);
        CPC = Subtotal / Cantidad_Clic;
        ISV = Subtotal * 0.16;
        Total_con_ISV = Subtotal + ISV;
        
        System.out.println("_________");
        System.out.println("Subtotal:");
        System.out.println(String.format( "%.2f", Subtotal));
        System.out.println("ISV 16%:");
        System.out.println(String.format( "%.2f", ISV));
        System.out.println("TOTAL:");
        System.out.println(String.format("%.2f", Total_con_ISV));
    }
    
}
