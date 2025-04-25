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
public class PlanillaDeEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner (System.in);
        
        lea.useDelimiter("\n");
        
        System.out.println("Ingresar Nombre del Empleado: ");
        String nombre = lea.next();
        
        System.out.println("Ingrese Horas trabajadas en el Mes: ");
        double HorasT = lea.nextDouble();
        
        System.out.println("Ingresar Tarifa por Hora: ");
        double TarifaH = lea.nextDouble();
        
        double Salario_Mensual = HorasT * TarifaH;
        double Salario_Semanal = Salario_Mensual / 4;
        
        System.out.print("-----Boleta del Empleado-----"+
                "\nNombre del Empleado: " + nombre +
                "\nHora de Trabajo Mensual: " + HorasT +
                "\nTarifa por Hora: Lps. " + TarifaH +
                "\nSalario del Empleado Semanal: Lps. " + Salario_Semanal);
        
    }
    
}
