/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codoaacodo;

import java.util.Scanner;

public class ActividadJava {
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);
    Scanner entrada =new Scanner(System.in);
    
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editorDeCodigo;
    String sistemaOperativo;
    
    System.out.println("Por favor ingrese su Nombre: ");
    nombre= sc.nextLine();
    
    System.out.println("Por favor ingrese su Apellido: ");
    apellido = sc.nextLine();
    
    System.out.println("Por favor ingrese su edad: ");
    edad= sc.nextInt();
  
    System.out.println("Por favor ingrese su hobbie: ");
    hobbie= entrada.nextLine();
   
    System.out.println("Por favor ingrese su editor de código preferido: ");
    editorDeCodigo= entrada.nextLine();
    
    System.out.println("Por favor ingrese el Sistema Operativo que utiliza: ");
    sistemaOperativo= entrada.nextLine();
    
    
    System.out.println();
    System.out.println("El Nombre ingresado es: "+ nombre);
    System.out.println("El Apellido ingresado es: "+ apellido);
    System.out.println("La edad ingresada es: " + edad);
    System.out.println("El Hobbie ingresado es: "+ hobbie);
    System.out.println("El editor de código preferido es: "+ editorDeCodigo);
    System.out.println("El Sistema Operativo que utiliza es: "+ sistemaOperativo);
    
    
    
    }
}
