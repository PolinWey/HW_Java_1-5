/*Реализовать алгоритм сортировки слиянием */

import java.util.Scanner;

public class Hw3_task1 {
    public static int [] mergeSort(int [] array1, int [] array2){
        int [] resultArray = new int[array1.length + array2.length];
        int indexArray1 = 0;
        int indexArray2 = 0;
        int indexResultArray = 0;

        for(int i = 0; i < resultArray.length; i++){
            if(indexArray1 == array1.length){
                for(int indx = indexArray2; indx < array2.length; indx++){
                    resultArray[indexResultArray] = array2[indx];
                    indexResultArray++;
                }
                break;
            }
            else if(indexArray2 == array2.length){
                for(int indx = indexArray1; indx < array1.length; indx++){
                    resultArray[indexResultArray] = array1[indx];
                    indexResultArray++;
                }
                break;
            }
            if(array1[indexArray1] > array2[indexArray2]){
                resultArray[indexResultArray] = array2[indexArray2];
                indexArray2++;
            }
            else{
                resultArray[indexResultArray] = array1[indexArray1];
                indexArray1++;
            }
            indexResultArray++;
        }
        return resultArray;
    }
    public static int [] bubleSorting(int [] array){
        int temp = 0;
        for(int i = 0;i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int [] generateArray(){
        int countElementToArray1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        if(sc.hasNextInt()){
            countElementToArray1 = sc.nextInt();
        }
        else{
            System.out.println("Введенный символ не является числом:");
        }
        int [] array = new int[countElementToArray1];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 13);
        }
        bubleSorting(array);
        return array;
    }

    public static void printArray(int [] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int [] resultArray = mergeSort(generateArray(), generateArray());
        printArray(resultArray);
    }
}
