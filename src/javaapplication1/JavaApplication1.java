/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("calculadora imc");
        //Paso 1. Declaracion de variables
              double w,l, imc;
              String eIMC;
        //En la siguiente linea le indico a java que utilizare un teclado
        Scanner kb= new Scanner(System.in);
        //paso 2. asignar valores a las variables 
        System.out.println("introduce el peso");
        w=kb.nextDouble();
        System.out.println("introduce la estatura");
        l=kb.nextDouble();
        //Paso 3. Resolver el problema
          imc=w/Math.pow(l,2);
          //Paso 3.1 Evaluamos IMC
          if(imc>25){
              eIMC="Sobrepeso";
          }else if (imc<19){
             eIMC="Desnutricion";
          
          }else{
              eIMC="normal";
              System.out.println("normal");
          }
          //paso 4. Mostrar el resultado
          System.out.println("Peso ="+w);
          System.out.println("Estatura="+l);
          System.out.println("Imc="+imc);
         
          
        // TODO code application logic here
    }
    
}
