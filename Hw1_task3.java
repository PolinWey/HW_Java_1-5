/*Реализовать простой калькулятор */

import java.util.Scanner;

public class Hw1_task3 {
    public static void Calculator(){
        int firstNumber, secondNumber;
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextInt();
        System.out.print("Что именно вы хотите сделать: сложить, умножить, вычесть или поделить (+, -, *, /): ");
        operation = sc.next();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextInt();
        sc.close();

        if(operation.equals("+")){
            System.out.println(firstNumber + secondNumber);
        }
        if(operation.equals("-")){
            System.out.println(firstNumber - secondNumber);
        }
        if(operation.equals("*")){
            System.out.println(firstNumber * secondNumber);
        }
        if(operation.equals("/")){
            System.out.println(firstNumber / secondNumber);
        }
        
    }

    public static void main(String[] args) {
        Calculator();
    }
}
