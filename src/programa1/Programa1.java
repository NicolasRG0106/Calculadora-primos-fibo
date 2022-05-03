/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.InputMismatchException;
import java.util.Scanner;

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
                System.out.println("MENU");
                System.out.println(" 1. OPERACIONES BASICAS \n 2. PRIMOS \n 3. FIBONACCI \n 4. SALIR");
                System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");
                opciones = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
            switch (opciones) {
                case 1: {
                    menu1();
                    break;
                }
                case 2: {
                    menu2();
                    break;

                }
                case 3: {
                    menu3();
                    break;

                }
                case 4: {
                    exit();
                }
                default: {
                    System.out.println("Error");
                    again = true;
                }

            }
        } while (again);
    }

    static void suma() {
        Scanner scan = new Scanner(System.in);
        int suma1 = 0;
        int suma2 = 0;
        System.out.println("Usted escogio suma");
        try {
            System.out.println("Escriba el primer numero: ");
            suma1 = scan.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            scan.nextLine();
            return;
        }
        try {
            System.out.println("Escriba el segundo numero");
            suma2 = scan.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            scan.nextLine();
            return;
        }
        System.out.println("su resultado es: " + (suma1 + suma2));
    }

    static void mul() {
        Scanner scan = new Scanner(System.in);
        int mul1;
        int mul2;
        System.out.println("Usted escogio multiplación");
        try {
            System.out.println("Escriba el primer numero");
            mul1 = scan.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            scan.nextLine();
            return;
        }
        try {
            System.out.println("Escribe el segundo numero");
            mul2 = scan.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            scan.nextLine();
            return;
        }
        System.out.println("El resultado es: " + (mul1 * mul2));
    }

    static void resta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted escogio RESTA");
        System.out.println("RESTA");
        int resta = 0;
        int resta2 = 0;
        try {
            System.out.println("Introduce el primer numero:");
            resta = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
        try {
            System.out.println("Introduce el segundo numero:");
            resta2 = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
        System.out.println("El resultado de la resta es: " + (resta - resta2));

    }

    static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted escogio DIVISION");
        System.out.println("DIVISION");
        float division;
        float division2;
        try {
            System.out.println("Introduce el primero numero:");
            division = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
        try {
            System.out.println("Introduce el segundo numero:");
            division2 = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
        if (division2 == 0) {
            System.out.println("no se puede dividir por 0");
        } else {
            System.out.println("El resultado de la division es: " + (division / division2));
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
        try {
            System.out.println("Escribe el numero");
            num = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
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

        try {
            System.out.println("Escribe un numero");
            n = scan.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            scan.nextLine();
            return;
        }
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

        try {
            System.out.println("Escriba el numero que desea: ");
            num = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
        while (y <= num) {
            if (num % y == 0) {
                cont++;
                y++;
            } else {
                y++;
            }
        }
        if (cont == 2) {
            System.out.println("su numero es primo");

        } else {
            System.out.println("su numero no es primo");
        }
    }

    static void primos3() {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 2;
        int j = 1;
        int cont = 0;
        try {
            System.out.println("Escriba el numero de primos que desea ver: ");
            n = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
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
        try {
            System.out.println("Escriba el numero de FIBONACCI que desea ver: ");
            n = sc.nextInt();
        } catch (Exception error) {
            System.out.println("INGRESE UN NUMERO ENTERO");
            sc.nextLine();
            return;
        }
        System.out.println(a);
        System.out.println(b);
        n = n - 2;
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
        while (true) {
            try {                        //funcion try catch para generar una excepcion al ecribir una variable no int
                flag = false;
                System.out.println("USTED ESCOGIO PRIMOS");
                System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPCION QUE DESEE: \n 1. SECUENCIA DE NUMEROS PRIMOS \n 2. SABER SI UN NUMERO ES PRIMO \n 3. NUMERO DE PRIMOS QUE DESEA VER");

                menu3 = sc.nextInt();
            } catch (InputMismatchException e) {                //funcion que genera la excepcion para que imprima una frase   
                System.out.println("Error");
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
    }

    static void menu1() {
        int menu2 = 0;
        Scanner sc = new Scanner(System.in);
        //flag
        while (true) {
            try {                        //funcion try catch para generar una excepcion al ecribir una variable no int

                System.out.println("USTED ESCOGIO OPERACIONES BASICAS \n 1. SUMA \n 2. RESTA \n 3. MULTIPLICACION \n 4. DIVISION");
                System.out.println("ESCRIBA EL NUMERO DEPENDIENDO LA OPERACION QUE DESEE: ");

                menu2 = sc.nextInt();
            } catch (InputMismatchException e) {            //funcion que genera la excepcion para que imprima una frase   
                System.out.println("Error");
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
    }

    static void menu3() {
        boolean flag;
        int menu4 = 0;
        Scanner sc = new Scanner(System.in);

        flag = false;            //flag
        while (true) {
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
    }

    static void exit() {
        System.out.println(" ____________________________");
        System.out.println("|                            |");
        System.out.println("|USTED HA CERRADO EL PROGRAMA|");
        System.out.println("|____________________________|");
        System.exit(0);
    }

}
