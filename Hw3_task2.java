/*Пусть дан произвольный список целых чисел, удалить из него чётные числа */
//package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw3_task2 {
    public static ArrayList <Integer> generateList(ArrayList <Integer> list){
        int countElement = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        if(sc.hasNextInt()){
            countElement = sc.nextInt();
        }
        for(int i = 0; i < countElement; i++){
            list.add((int)(Math.random() * 13));
        }
        return list;
    }

    public static void printList(ArrayList <Integer> list){
        for (int j : list) {
            System.out.print(j + " ");
        }
    }

    public static ArrayList <Integer> deleteEvenNumber(ArrayList <Integer> list){
        list.removeIf(integer -> integer % 2 == 0);
        return list;
    }

    public static void main(String[] args) {
        ArrayList <Integer> randomNumber = new ArrayList<>();
        generateList(randomNumber);
        printList(randomNumber);
        deleteEvenNumber(randomNumber);
        System.out.println();
        printList(randomNumber);
    }
}
