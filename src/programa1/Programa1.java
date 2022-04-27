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
        boolean first;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;

        Scanner sc = new Scanner(System.in); //ingreso de texto por usuario

        do {                         //bucle para escoger la opcion y cuando termine volver al menu
            again = false;           //flag 

            do {                          //bucle para que al escoger un no int volver al menu y no generar error

                first = false;            //flag

                try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

                    System.out.println("MENU");
                    System.out.println(" 1. OPERACIONES BASICAS \n 2. PRIMOS \n 3. FIBONACCI \n 4. SALIR");
                    System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");

                    menu = sc.nextInt();
                } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
                    System.out.println("SU CARACTER FUE INCORRECTO");
                    sc.nextLine();
                    first = true;                            //si es asi volver a el menu
                }

            } while (first);
            //bucle para que al escoger un no int volver al menu y no generar error
            if (menu == 1) {
                flag = false;            //flag

                try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

                    System.out.println("USTED ESCOGIO OPERACIONES BASICAS \n 1. SUMA \n 2. RESTA \n 3. MULTIPLICACION \n 4. DIVISION");
                    System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");

                    menu2 = sc.nextInt();
                } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
                    System.out.println("SU CARACTER FUE INCORRECTO");
                    sc.nextLine();
                    flag = true;                            //si es asi volver a el menu
                }
            }

            if (menu == 2) {                          //bucle para que al escoger un no int volver al menu y no generar error

                flag = false;            //flag

                try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

                    System.out.println("USTED ESCOGIO PRIMOS");
                    System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPCION QUE DESEE: \n 1.SECUENCIA DE NUMEROS PRIMOS ");

                    menu3 = sc.nextInt();
                } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
                    System.out.println("SU CARACTER FUE INCORRECTO");
                    sc.nextLine();
                    flag = true;                            //si es asi volver a el menu
                }

            }

            if (menu == 3) {                          //bucle para que al escoger un no int volver al menu y no generar error

                flag = false;            //flag

                try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

                    System.out.println("USTED ESCOGIO FIBONACCI");
                    System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPCION QUE DESEE \n 1. SECUENCIA FIBONACCI ");

                    menu4 = sc.nextInt();
                } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
                    System.out.println("SU CARACTER FUE INCORRECTO");
                    sc.nextLine();
                    flag = true;                            //si es asi volver a el menu
                }

            }

            if (menu2 == 1) {
                System.out.println("Usted escogio SUMA");
                int numero = 0;
                int numero2 = 0;
                System.out.println("Introduce el primer numero:");
                numero = sc.nextInt();
                System.out.println("Introduce el segundo numero:");
                numero2 = sc.nextInt();
                System.out.println("El resultado de la suma es:" + (numero + numero2));
            }
            if (menu2 == 2) {
                System.out.println("Usted escogio RESTA");
                System.out.println("RESTA");
                int resta = 0;
                int resta2 = 0;
                System.out.println("Introduce el primer numero:");
                resta = sc.nextInt();
                System.out.println("Introduce el segundo numero:");
                resta2 = sc.nextInt();
                System.out.println("El resultado de la resta es:" + (resta - resta2));
            }
            if (menu2 == 3) {
                System.out.println("Usted escogio MULTIPLICACION");
                System.out.println("MULTIPLICACION");
                int mul;
                int mul2;
                System.out.println("Introduce el primer numero:");
                mul = sc.nextInt();
                System.out.println("Introduce el segundo numero:");
                mul2 = sc.nextInt();
                System.out.println("El resultado de la multiplicacion es:" + (mul * mul2));
            }
            if (menu2 == 4) {
                System.out.println("Usted escogio DIVISION");
                System.out.println("DIVISION");
                float division;
                float division2;
                System.out.println("Introduce el primero numero:");
                division = sc.nextInt();
                System.out.println("Introduce el segundo numero:");
                division2 = sc.nextInt();
                if (division2 == 0) {
                    System.out.println("no se puede dividir por 0");
                }
                System.out.println("El resultado de la division es:" + (division / division2));
            }
            if (menu3 == 1) {

                System.out.println("Usted escogio SECUENCIA DE NUMEROS PRIMOS");
                System.out.println("NUMEROS PRIMOS");
                int num;
                int cont = 0;
                int i = 2;
                int j = 1;
                System.out.println("Escribe el numero");
                num = sc.nextInt();
                while (num >= i) {
                    while (i >= j) {
                        if (i % j == 0) {
                            cont++;
                        }
                        j++;
                    }
                    if (cont == 2) {
                        System.out.println(i);
                    }
                    i++;
                    cont = 0;
                    j = 1;
                }
            }

            if (menu4 == 1) {
                System.out.println("Usted escogio SECUENCIA FIBONACCI");
                System.out.println("FIBONACCI");
                Scanner scan = new Scanner(System.in);

                int a = 0;
                int b = 1;
                int c;
                int n;

                System.out.println("Escribe un numero");
                n = scan.nextInt();
                System.out.println(a);
                System.out.println(b);
                while (true) {
                    c = a + b;
                    if (c < n) {
                        System.out.println(c);
                        a = b;
                        b = c;
                    }
                }
            }

            again = true;                                        // cada vez que termine esta flag volvera a dar las opciones del menu

            if (menu == 4) {                                       //si no escogio ninguna de las opciones que estaban dentro de la flag y escogio 6 va a cerrar
                System.out.println(" ____________________________");
                System.out.println("|                            |");
                System.out.println("|USTED HA CERRADO EL PROGRAMA|");
                System.out.println("|____________________________|");
                System.exit(0);
            }

        } while (again);

    }

    static void suma() {
        Scanner scan = new Scanner(System.in);
        int suma1;
        int suma2;
        System.out.println("Usted escogio suma");
        System.out.println("Escriba el primer numero: ");
        suma1 = scan.nextInt();
        System.out.println("Escriba el segundo numero");
        suma2 = scan.nextInt();
        System.out.println("su resultado es: " + (suma1 + suma2));
    }

    static void mul() {
        Scanner scan = new Scanner(System.in);
        int mul1;
        int mul2;
        System.out.println("Usted escogio multiplación");
        System.out.println("Escriba el primer numero");
        mul1 = scan.nextInt();
        System.out.println("Escribe el segundo numero");
        mul2 = scan.nextInt();
        System.out.println("El resultado es; " + (mul1 * mul2));
    }

    static void resta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted escogio RESTA");
        System.out.println("RESTA");
        int resta = 0;
        int resta2 = 0;
        System.out.println("Introduce el primer numero:");
        resta = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        resta2 = sc.nextInt();
        System.out.println("El resultado de la resta es:" + (resta - resta2));

    }

    static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted escogio DIVISION");
        System.out.println("DIVISION");
        float division;
        float division2;
        System.out.println("Introduce el primero numero:");
        division = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        division2 = sc.nextInt();
        if (division2 == 0) {
            System.out.println("no se puede dividir por 0");
        }
        System.out.println("El resultado de la division es:" + (division / division2));

    }
    static void primos1(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Usted escogio SECUENCIA DE NUMEROS PRIMOS");
                System.out.println("NUMEROS PRIMOS");
                int num;
                int cont = 0;
                int i = 2;
                int j = 1;
                System.out.println("Escribe el numero");
                num = sc.nextInt();
                while (num >= i) {
                    while (i >= j) {
                        if (i % j == 0) {
                            cont++;
                        }
                        j++;
                    }
                    if (cont == 2) {
                        System.out.println(i);
                    }
                    i++;
                    cont = 0;
                    j = 1;
                }
    }
    static void fibo1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Usted escogio SECUENCIA FIBONACCI");
                System.out.println("FIBONACCI");
                Scanner scan = new Scanner(System.in);

                int a = 0;
                int b = 1;
                int c;
                int n;

                System.out.println("Escribe un numero");
                n = scan.nextInt();
                System.out.println(a);
                System.out.println(b);
                while (true) {
                    c = a + b;
                    if (c < n) {
                        System.out.println(c);
                        a = b;
                        b = c;
                    }
                }
    }
    
}
