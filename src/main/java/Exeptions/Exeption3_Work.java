package Exeptions;

public class Exeption3_Work {
    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов
    двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
    public static int[] difElement2Array(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы не равны по длине");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов
    двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
    которое пользователь может увидеть - RuntimeException.*/
    public static int[] dividElement2Array(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы не равны по длине");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i] == 0){
                throw new RuntimeException("Нельзя делить на ноль - элемент "+(i+1)+" во втором массиве");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
