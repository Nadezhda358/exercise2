public class Main {
    //Напишете метод, който приема матрица като аргумент и
    //връща едномерен масив, съдържащ всички четни числа от
    //матрицата.
    //Пример:
    //2 4 5 1
    //3 7 8 5
    //9 5 0 4
    //Резултат:
    //[2, 4, 8, 0, 4]
    public static void findEvenNumbers(int[][] array){
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 == 0){
                    countEven++;
                }
            }
        }

        int[] evenNumbers = new int[countEven];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenNumbers[i] = array[i][j];
                    System.out.print(evenNumbers[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] array = {
                {2, 4, 5, 1},
                {3, 7, 8, 5},
                {9, 5, 0, 4}
        };
        
        findEvenNumbers(array);
    }
}