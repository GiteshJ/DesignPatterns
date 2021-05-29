package StructuralDesignPattern.FlyweightPattern.Gazillions.Before;

public class FlyweightBeforeDemo {
    public static int ROWS = 6, COLS = 10;

    public static void test(int row, int col) {
    	ROWS = row;
    	COLS = col;
        Gazillion[][] matrix = new Gazillion[ROWS][COLS];
        for (int i=0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = new Gazillion(COLS);
            }
        }
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++) {
                matrix[i][j].report();
            }
            //System.out.println();
        }
    }
}
