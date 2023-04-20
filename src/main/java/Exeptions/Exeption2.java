package Exeptions;

public class Exeption2 {
    public static int sumBin2Array(int [][] arr){
        if (arr.length != arr[0].length){
            throw new RuntimeException("Массив не квадратный");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Число "+ i+ j +" не равно 0 или 1");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
