package Exeptions;

public class Exeption1 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9};
        printCodeError(findNumber(arr, 0,5));

    }

    public static int findNumber (int[] arr, int value, int min) {
        if (arr == null){
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }

    public static void printCodeError(int code){
        switch (code){
            case (-1):
                System.out.println("Длина массива слишком маленькая");
                break;
            case (-2):
                System.out.println("Искомый элемент не найден");
                break;
            case (-3):
                System.out.println("Массив пустой ");
                break;
            default:
                System.out.println("Индекс = " + code);
                break;
        }
    }
}
