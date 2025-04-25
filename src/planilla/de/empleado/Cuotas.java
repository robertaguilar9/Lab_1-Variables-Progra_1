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
public class Cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        double Total = 0, CuotaM = 0, Total1 = 0;
        
        System.out.println("Ingrese el monto del Prestamo:");
        double Prestamo = lea.nextDouble();
        
        System.out.println("Ingrese el plazo de meses a Pagar:");
        double plazo_meses = lea.nextDouble ();
        
        System.out.println("Ingrese el interes mensual");
        double interes_mensual = lea.nextDouble ();
        
        Total = Prestamo*plazo_meses*interes_mensual;
        CuotaM = Total/plazo_meses;
        Total1 = Prestamo + Total;
        
        System.out.println("*****CUOTAS MENSUALES*****"+
                "\nCuota de Pago Mensual: Lps. " + CuotaM +
                "\nTotal a Pagar: Lps. " + Total1);
    }
    
}
