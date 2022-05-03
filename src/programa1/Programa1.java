/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.awt.Button;
import java.awt.Component;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
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

        Scanner sc = new Scanner(System.in);

        int opciones = 0;
        boolean again = false;

        do {
            try {
                again = false;
                JOptionPane.showMessageDialog(null, "MENU", "Created by Nicolas", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(" 1. OPERACIONES BASICAS \n 2. PRIMOS \n 3. FIBONACCI \n 4. SALIR");
                System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");
                opciones = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
            switch (opciones) {
                case 1: {
                    menu1();
                    again = true;
                    break;
                }
                case 2: {
                    menu2();
                    again = true;
                    break;

                }
                case 3: {
                    menu3();
                    again = true;
                    break;

                }
                case 4: {
                    exit();
                }
                default: {
                    JOptionPane.showMessageDialog(null,"Error","",JOptionPane.WARNING_MESSAGE);
                    again = true;
                }

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
        JOptionPane.showMessageDialog(null, "su resultado es: " + (suma1 + suma2));
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
        JOptionPane.showMessageDialog(null, "El resultado es: " + (mul1 * mul2));
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
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (resta - resta2));

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
            JOptionPane.showMessageDialog(null, "no se puede dividir por 0");
        } else {
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + (division / division2));
        }
    }

    static void primos1() {
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

    static void fibo1() {
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
            } else {
                break;
            }
        }
    }

    static void primos2() {
        Scanner sc = new Scanner(System.in);
        int num;
        int y = 1;
        int cont = 0;

        System.out.println("Escriba el numero que desea: ");
        num = sc.nextInt();
        while (y <= num) {
            if (num % y == 0) {
                cont++;
                y++;
            } else {
                y++;
            }
        }
        if (cont == 2) {
            JOptionPane.showMessageDialog(null,"su numero es primo");

        } else {
            JOptionPane.showMessageDialog(null,"su numero no es primo");
        }
    }

    static void primos3() {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 2;
        int j = 1;
        int cont = 0;
        System.out.println("Escriba el numero de primos que desea ver: ");
        n = sc.nextInt();
        while (n > 0) {
            n--;
            while (n >= i) {
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

    }

    static void fibo2() {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c;
        int n;
        System.out.println("Escriba el numero de FIBONACCI que desea ver: ");
        n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while (true) {
            c = a + b;
            if (n > 0) {
                System.out.println(c);
                a = b;
                b = c;
                n--;
            } else {
                break;
            }
        }

    }

    static void menu2() {
        boolean flag;
        int menu3 = 0;
        Scanner sc = new Scanner(System.in);

        try {                        //funcion try catch para generar una excepcion al ecribir una variable no int
            flag = false;
            System.out.println("USTED ESCOGIO PRIMOS");
            System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPCION QUE DESEE: \n 1. SECUENCIA DE NUMEROS PRIMOS \n 2. SABER SI UN NUMERO ES PRIMO \n 3. NUMERO DE PRIMOS QUE DESEA VER");

            menu3 = sc.nextInt();
        } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
            System.out.println("SU CARACTER FUE INCORRECTO");
            sc.nextLine();
            flag = true;                            //si es asi volver a el menu
        }

        if (menu3 == 1) {
            primos1();
        }
        if (menu3 == 2) {
            primos2();
        }
        if (menu3 == 3) {
            primos3();
        }

    }

    static void menu1() {
        int menu2 = 0;
        Scanner sc = new Scanner(System.in);
        //flag

        try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

            System.out.println("USTED ESCOGIO OPERACIONES BASICAS \n 1. SUMA \n 2. RESTA \n 3. MULTIPLICACION \n 4. DIVISION");
            System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");

            menu2 = sc.nextInt();
        } catch (InputMismatchException e) {            //funcion que genera la excepcion para que imprima una frase   
            System.out.println("SU CARACTER FUE INCORRECTO");
            sc.nextLine();                       //si es asi volver a el menu
        }
        if (menu2 == 1) {
            suma();
        }
        if (menu2 == 2) {
            resta();
        }
        if (menu2 == 3) {
            mul();
        }
        if (menu2 == 4) {
            division();
        }

    }

    static void menu3() {
        boolean flag;
        int menu4 = 0;
        Scanner sc = new Scanner(System.in);

        flag = false;            //flag

        try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

            System.out.println("USTED ESCOGIO FIBONACCI");
            System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPCION QUE DESEE \n 1. SECUENCIA FIBONACCI \n 2. X NUMEROS PEDIDOS FIBONACCI");

            menu4 = sc.nextInt();
        } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
            System.out.println("SU CARACTER FUE INCORRECTO");
            sc.nextLine();
            flag = true;                            //si es asi volver a el menu
        }
        if (menu4 == 1) {
            fibo1();
        }
        if (menu4 == 2) {
            fibo2();
        }

    }

    static void exit() {
        JOptionPane.showMessageDialog(null,"USTED SE HA SALIDO","Created by Nicolas",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
