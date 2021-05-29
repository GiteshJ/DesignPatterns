package StructuralDesignPattern.FlyweightPattern.Gazillions.After;

public class FlyweightAfterDemo {
    public static  int ROWS = 6, COLS = 10;

    public static void  test(int row, int col) {
    	ROWS = row;
    	COLS = col;
        Factory theFactory = new Factory(ROWS);
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++)
                theFactory.getFlyweight(i).report(j);
            //System.out.println();
        }
    }
}