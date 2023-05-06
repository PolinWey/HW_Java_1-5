/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hw3_task3 {
    public static ArrayList<Integer> generateList(ArrayList <Integer> list){
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
    public static void findMinMaxAndMedium(ArrayList <Integer> list){
        int mediumIndexNumber = list.size() / 2;
        Collections.sort(list);
        System.out.println("Минимальное число в списке: " + Collections.min(list));
        System.out.println("Среднее число в списке: " + list.get(mediumIndexNumber));
        System.out.println("Максимальное число в списке: " + Collections.max(list));
    }
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        generateList(numbers);
        printList(numbers);
        System.out.println();
        findMinMaxAndMedium(numbers);
        printList(numbers);
    }
}
