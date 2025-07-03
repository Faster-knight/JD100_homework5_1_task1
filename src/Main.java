import java.util.Random;

public class Main {
    // [RUSSIAN] Данное поле класса содержит размер вложенного массива
    public static final int SIZE = 8;
    // [RUSSIAN] Данный метод выводит входную матрицу на экран
    public static void printMatrix(int[][] matrixPrint) {
        for (int[] ints : matrixPrint) {
            for (int j = 0; j < ints.length; j++) {
                System.out.format("%4d", ints[j]);
            }
            System.out.println();
        }
    }
    // [RUSSIAN] Данный метод запускает программу и заполняет матрицу рандомными значениями
    // После чего проиходит ее поворот на 90 градусов по часовой стрелке
    // После произведения поворота происходит вывод результата
    public static void main(String[] args) {
        int[][] startColors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < startColors.length; i++) {
            for (int j = 0; j < startColors[i].length; j++) {
                startColors[i][j] = random.nextInt(255);
            }
        }
        for (int i = 0; i < startColors.length; i++) {
            for (int j = 0; j < startColors[i].length; j++) {
                rotatedColors[i][j] = startColors[SIZE - 1 - j][i];
            }
        }
        System.out.println("Начальная матрица");
        printMatrix(startColors);
        System.out.println("Конечная матрица с поворотом");
        printMatrix(rotatedColors);
    }
}
