package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Que operación deseas hacer:\n1)Suma\n2)Resta\n3)Multiplicación\n4)División\n5)Salir\n");
            opc = console.nextInt();
            switch (opc) {
                case 1:
                    int num1 = pedir_dato1();
                    int num2 = pedir_dato2();
                    int resultado = suma(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    num1 = pedir_dato1();
                    num2 = pedir_dato2();
                    resultado = resta(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    num1 = pedir_dato1();
                    num2 = pedir_dato2();
                    resultado = producto(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    num1 = pedir_dato1();
                    num2 = pedir_dato2();
                    if (num2 != 0) {
                        resultado = division(num1, num2);
                        System.out.println(num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.print("No se puede dividir entre 0");
                    }
                case 5:
                    System.out.print("Adios\n");
                    break;
                default:
                    System.out.print("Opción no Valida\n");
                    break;
            }
        }while(opc!=5);
        console.close();
    }
    public static int suma(int num1,int num2){
        return num1+num2;
    }
    public static int resta(int num1,int num2){
        if (num1>num2)
            return num1-num2;
        else
            return num2-num1;
    }
    public static int producto(int num1,int num2){
        return num1*num2;
    }
    public static int division(int num1,int num2){
            return num1/num2;
    }
    public static int pedir_dato1(){
        Scanner console = new Scanner( System.in);
        System.out.print("Enter number 1  ");
        int num1 = console.nextInt();
        return num1;
    }
    public static int pedir_dato2(){
        Scanner console = new Scanner( System.in);
        System.out.print("Enter number 2 ");
        int num2 = console.nextInt();
        return num2;
    }
}
