/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFormattedTextField;
import sun.text.normalizer.UTF16;

/**
 *
 * @author NICOLAS RIVERA
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu = 0;
        boolean flag;
        boolean again;
        
        Scanner sc = new Scanner(System.in);
        
       do { 
           again = false;
       
        
       do{
           
           flag = false;
       
        try {
            
            System.out.println("MENU DE OPERACIONES");
        System.out.println("1 = SUMA 2 = RESTA 3 = MULTIPLICACION 4 = DIVISION = 5 EXIT");
        System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");
       
       
        menu = sc.nextInt();
        } catch (InputMismatchException e){
                    System.out.println("SU CARACTER FUE INCORRECTO");
                    sc.nextLine();
                    flag = true;
        }
        
        
        }while (flag);
      
        
                
         if (menu ==1){
            System.out.println("Usted escogio SUMA");
    int numero = 0;
    int numero2 = 0;
        System.out.println("Introduce el primer numero:");			
    numero = sc.nextInt();
    System.out.println("Introduce el segundo numero:");	
    numero2 = sc.nextInt();
         System.out.println("el resultado de la suma es:" + (numero + numero2));
        }
        if (menu ==2){
           System.out.println("Usted escogio RESTA");
         System.out.println("RESTA");
    int resta = 0;
    int resta2 = 0;
        System.out.println("Introduce el primer numero:");			
    resta = sc.nextInt();
    System.out.println("Introduce el segundo numero:");	
    resta2 = sc.nextInt();
         System.out.println("el resultado de la resta es:" + (resta - resta2));
        }
       if (menu == 3){
           System.out.println("Usted escogio MULTIPLICACION");
         System.out.println("MULTIPLICACION");
    int mul;
    int mul2;
        System.out.println("Introduce el primer numero:");			
    mul = sc.nextInt();
    System.out.println("Introduce el segundo numero:");	
    mul2 = sc.nextInt();
         System.out.println("el resultado de la multiplicacion es:" + (mul * mul2));
       }
         if (menu == 4){
             System.out.println("Usted escogio DIVISION");
         System.out.println("DIVISION");
    float division;
    float division2;
        System.out.println("Introduce el primero numero:");
        division = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        division2 = sc.nextInt();
        if (division2 == 0){System.out.println("no se puede dividir por 0");}
        System.out.println("el resultado de la division es:" + (division / division2));
       
         }
         again = true;
         
         if (menu ==5){
             System.out.println(" ____________________________");
             System.out.println("|                            |");
             System.out.println("|USTED HA CERRADO EL PROGRAMA|");
             System.out.println("|____________________________|");
             System.exit(0);
             }
         
       }while (again);
         
         
    }
       
         } 
    
    
