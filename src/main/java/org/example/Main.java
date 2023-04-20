package org.example;
import static Exeptions.Exeption3_Work.*;

public class Main {
    public static void main(String[] args) {
        int number = 2;
        int[] arr1 = new int[] {1,4,3,4,34,4,43,3,4,4};
        int[] arr2 = new int[] {1,4,2,4,34,4,46,3,4,4};
        int[] arr3 = new int[] {1,4,2,4,34,4,46,3,4};
        int[] arr4 = new int[] {1,0,2,4,34,4,46,3,4,9};
        printArray(arr1);
        printArray(arr2);


        switch (number) {
            //Задача 1
            case (1):
            System.out.println("Вариант успешный");
            printArray(difElement2Array(arr1, arr2));
            System.out.println("Массивы не равны");
            printArray(difElement2Array(arr1, arr3));
            break;
            //Задача 2
            case (2):
            System.out.println("Вариант успешный");
            printArray(dividElement2Array(arr1, arr2));
            System.out.println("Нельзя делить на 0");
            printArray(dividElement2Array(arr1, arr4));
            break;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("; "+arr[i]);
        }
        System.out.println();
    }
}
