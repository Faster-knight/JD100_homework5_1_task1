import java.util.Random;

public class Main {
    public static final int SIZE = 8;
    public static void printMatrix(int[][] matrixStart, int[][]  matrixResult) {
        System.out.println("Начальная матрица");
        for (int[] ints : matrixStart) {
            for (int j = 0; j < ints.length; j++) {
                System.out.format("%4d", ints[j]);
            }
            System.out.println();
        }
        System.out.println("Конечная матрица с поворотом");
        for (int[] ints : matrixResult) {
            for (int j = 0; j < ints.length; j++) {
                System.out.format("%4d", ints[j]);
            }
            System.out.println();
        }
    }
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
        printMatrix(startColors, rotatedColors);
    }
}
